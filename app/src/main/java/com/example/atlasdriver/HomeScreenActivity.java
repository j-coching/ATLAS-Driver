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
    private Button menu_switch, kilometers_switch, miles_switch;
    private Button amenity_button_1, amenity_button_2, amenity_button_3, amenity_button_4, amenity_button_5;
    CameraView mCameraView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        String date = new SimpleDateFormat("MM.dd.yy | EEE.", Locale.getDefault()).format(new Date());
        TextView dateToday = findViewById(R.id.date_today);
        dateToday.setText(date);

        cctv_map_switch = (Button) findViewById(R.id.cctv_map_switch);
        menu_switch = (Button) findViewById(R.id.menu_button);

        replaceFragment(new MapFragment());
        replaceFragment2(new DashboardSpace());

        MapFragment mFragment = new MapFragment();
        CCTVFragment cFragment = new CCTVFragment();

        DashboardSpace dFragment = new DashboardSpace();
        Menu1Fragment m1Fragment = new Menu1Fragment();

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

        menu_switch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(interface_counter == false){
                    replaceFragment2(dFragment);
                    menu_switch.setBackgroundResource(R.drawable.menu);
                    dateToday.setText(date);
                    interface_counter = true;
                }

                else{
                    replaceFragment2(m1Fragment);
                    menu_switch.setBackgroundResource(R.drawable.back_to_home_dashboard);
                    dateToday.setText("MENU");
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