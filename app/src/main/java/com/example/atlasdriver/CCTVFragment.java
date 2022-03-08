package com.example.atlasdriver;

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

    View view;
    VideoView vv;
    VideoView videoView;
    MediaPlayer mp;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        View view = inflater.inflate(R.layout.fragment_cctv, container, false);
        VideoView vv = (VideoView)view.findViewById(R.id.cctv_view);
        String path = "android.resource://" + getActivity().getPackageName() + "/" + R.raw.vfeed;
        vv.setVideoURI(Uri.parse(path));
        vv.start();

        return view;
    }


}

