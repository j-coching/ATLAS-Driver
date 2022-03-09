package com.example.atlasdriver;

import androidx.appcompat.app.AppCompatActivity;
import androidx.camera.view.CameraView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class HomeScreenActivity extends AppCompatActivity {

    public boolean interface_counter = true;
    private Button cctv_map_switch;
    CameraView mCameraView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        String date = new SimpleDateFormat("MM.dd.yy | EEE", Locale.getDefault()).format(new Date());
        TextView dateToday = findViewById(R.id.date_today);
        dateToday.setText(date);


        cctv_map_switch = (Button) findViewById(R.id.cctv_map_switch);
        replaceFragment(new MapFragment());
        replaceFragment2(new DashboardSpace());

        MapFragment mFragment = new MapFragment();
        CCTVFragment cFragment = new CCTVFragment();

        cctv_map_switch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(interface_counter == false){
                    replaceFragment(mFragment);
                    cctv_map_switch.setBackgroundResource(R.drawable.cctv_switch);
                    interface_counter = true;
                }
                
                else{
                    replaceFragment(cFragment);
                    cctv_map_switch.setBackgroundResource(R.drawable.map_switch);
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

    private void replaceFragment2(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout2, fragment);
        fragmentTransaction.commit();
    }
}