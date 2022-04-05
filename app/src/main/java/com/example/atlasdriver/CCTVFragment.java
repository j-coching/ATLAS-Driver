package com.example.atlasdriver;

import androidx.fragment.app.Fragment;

import android.animation.Animator;
import android.content.pm.ActivityInfo;
import android.hardware.Camera;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.VideoView;
import java.util.Objects;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.VideoView;

public class CCTVFragment extends Fragment {

    View view;
    private ViewGroup container;
    boolean cctv1 = true;
    boolean cctv2 = true;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        View view = inflater.inflate(R.layout.fragment_cctv, container, false);
        VideoView vv1 = (VideoView)view.findViewById(R.id.cctv_view1);
        VideoView vv2 = (VideoView)view.findViewById(R.id.cctv_view2);

        Button btn1 = (Button) view.findViewById(R.id.cctv_btn1);
        Button btn2 = (Button) view.findViewById(R.id.cctv_btn2);

        String path1 = "android.resource://" + getActivity().getPackageName() + "/" + R.raw.zenitsu;
        String path2 = "android.resource://" + getActivity().getPackageName() + "/" + R.raw.tekken;
        String rtspURL1 = "rtsp://192.168.100.4:1027/ch0";
        String rtspURL2 = "rtsp://wowzaec2demo.streamlock.net/vod/mp4:BigBuckBunny_115k.mp4";
        String rtspURL3 = "http://192.168.100.4:8080/playlist.m3u";

        vv1.setVideoURI(Uri.parse(path1));
        vv2.setVideoURI(Uri.parse(path2));

        vv1.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);
            }
        });

        vv2.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);
            }
        });

        vv1.requestFocus();
        vv1.start();

        vv2.requestFocus();
        vv2.start();

        c1Fragment c1Fragment = new c1Fragment();
        c2Fragment c2Fragment = new c2Fragment();

        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                replaceFragment(c1Fragment);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                replaceFragment(c2Fragment);
                }
        });

        return view;
    }
    private void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout, fragment);
        fragmentTransaction.commit();
    }
}