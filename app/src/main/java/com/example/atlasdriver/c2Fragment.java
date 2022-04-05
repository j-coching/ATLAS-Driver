package com.example.atlasdriver;

import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.VideoView;

public class c2Fragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        View view = inflater.inflate(R.layout.fragment_c2, container, false);
        VideoView cctv1 = (VideoView) view.findViewById(R.id.c2);
        Button c1btn = (Button) view.findViewById(R.id.c2btn);

        CCTVFragment cFragment = new CCTVFragment();

        String path1 = "android.resource://" + getActivity().getPackageName() + "/" + R.raw.tekken;
        cctv1.setVideoURI(Uri.parse(path1));

        cctv1.requestFocus();
        cctv1.start();

        c1btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                replaceFragment(cFragment);
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