package com.example.atlasdriver;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class AmenityFragment extends Fragment {

    View view;
    public boolean aButton1_interface_counter, aButton2_interface_counter, aButton3_interface_counter, aButton4_interface_counter, aButton5_interface_counter = true;
    private Button amenity_button_1, amenity_button_2, amenity_button_3, amenity_button_4, amenity_button_5;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_amenity, container, false);

        amenity_button_1 = (Button) view.findViewById(R.id.aButton1);
        amenity_button_2 = (Button) view.findViewById(R.id.aButton2);
        amenity_button_3 = (Button) view.findViewById(R.id.aButton3);
        amenity_button_4 = (Button) view.findViewById(R.id.aButton4);
        amenity_button_5 = (Button) view.findViewById(R.id.aButton5);

        amenity_button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(aButton1_interface_counter == false){
                    amenity_button_1.setBackgroundResource(R.drawable.aircon_on);
                    aButton1_interface_counter = true;
                }
                else{
                    amenity_button_1.setBackgroundResource(R.drawable.aircon_off);
                    aButton1_interface_counter = false;
                }
            }
        });

        amenity_button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(aButton2_interface_counter == false){
                    amenity_button_2.setBackgroundResource(R.drawable.wifi_on);
                    aButton2_interface_counter = true;
                }
                else{
                    amenity_button_2.setBackgroundResource(R.drawable.wifi_off);
                    aButton2_interface_counter = false;
                }
            }
        });

        amenity_button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(aButton3_interface_counter == false){
                    amenity_button_3.setBackgroundResource(R.drawable.tv_on);
                    aButton3_interface_counter = true;
                }
                else{
                    amenity_button_3.setBackgroundResource(R.drawable.tv_off);
                    aButton3_interface_counter = false;
                }
            }
        });

        amenity_button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(aButton4_interface_counter == false){
                    amenity_button_4.setBackgroundResource(R.drawable.cr_on);
                    aButton4_interface_counter = true;
                }
                else{
                    amenity_button_4.setBackgroundResource(R.drawable.cr_off);
                    aButton4_interface_counter = false;
                }
            }
        });

        amenity_button_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(aButton5_interface_counter == false){
                    amenity_button_5.setBackgroundResource(R.drawable.lights_off);
                    aButton5_interface_counter = true;
                }
                else{
                    amenity_button_5.setBackgroundResource(R.drawable.lights_on);
                    aButton5_interface_counter = false;
                }
            }
        });

        return view;
    }
}