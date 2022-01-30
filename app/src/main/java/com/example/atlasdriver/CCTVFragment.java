package com.example.atlasdriver;

import androidx.fragment.app.Fragment;

import android.content.pm.ActivityInfo;
import android.hardware.Camera;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.VideoView;
import java.util.Objects;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.VideoView;

public class CCTVFragment extends Fragment {

    //Camera camera;
    //FrameLayout frameLayout;
    //ShowCamera showCamera;
    VideoView vv;
    View view;
    VideoView videoView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        View view = inflater.inflate(R.layout.fragment_cctv, container, false);
        VideoView vv = (VideoView)view.findViewById(R.id.cctv_view);
        //String path = "android.resource://" + getActivity().getPackageName() + "/" + R.raw.vfeed;
        //String rtspURL = "rtsp://192.168.100.4:5540/ch0";

        //"http://192.168.100.4:8080/playlist.m3u"
        //"rtsp://192.168.100.4:5540/ch0"

        //vv.setVideoURI(Uri.parse(path));
        vv.setVideoURI(Uri.parse("rtsp://192.168.100.4:5540/ch0"));

        //vv.setMediaController(new MediaController(getActivity()));
        vv.requestFocus();
        vv.start();

        return view;
    }
}