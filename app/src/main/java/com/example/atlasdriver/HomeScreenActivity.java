package com.example.atlasdriver;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;

public class HomeScreenActivity extends AppCompatActivity {

    public boolean interface_counter = false;
    private ImageView cctv_map_switch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        cctv_map_switch = (ImageView) findViewById(R.id.cctv_map_switch);

        cctv_map_switch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(interface_counter == false){
                    replaceFragment(new MapFragment());
                    interface_counter = true;
                    
                }
                else{
                    replaceFragment(new CCTVFragment());
                    interface_counter = false;
                }
            }
        });
    }

    private void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout, fragment);
        fragmentTransaction.commit();
    }
}