package com.example.atlasdriver;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Menu1Fragment extends Fragment {

    View view;

    public boolean mi_Button_interface_counter = false;
    public boolean km_Button_interface_counter = true;
    public boolean aButton1_interface_counter, aButton2_interface_counter, aButton3_interface_counter, aButton4_interface_counter, aButton5_interface_counter = false;
    private Button miles_switch, kilometers_switch;
    private Button amenity_button_1, amenity_button_2, amenity_button_3, amenity_button_4, amenity_button_5;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_menu1, container, false);

            kilometers_switch = (Button) view.findViewById(R.id.kilometers_select);
            miles_switch = (Button) view.findViewById(R.id.miles_select);

            amenity_button_1 = (Button) view.findViewById(R.id.amenity_switch_1);
            amenity_button_2 = (Button) view.findViewById(R.id.amenity_switch_2);
            amenity_button_3 = (Button) view.findViewById(R.id.amenity_switch_3);
            amenity_button_4 = (Button) view.findViewById(R.id.amenity_switch_4);
            amenity_button_5 = (Button) view.findViewById(R.id.amenity_switch_5);

        miles_switch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mi_Button_interface_counter == false){
                    miles_switch.setBackgroundResource(R.drawable.selected_mi);
                    kilometers_switch.setBackgroundResource(R.drawable.unselected_km);
                    mi_Button_interface_counter = true;
                    km_Button_interface_counter = false;
                }
            }
        });

        kilometers_switch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(km_Button_interface_counter == false){
                    kilometers_switch.setBackgroundResource(R.drawable.selected_km);
                    miles_switch.setBackgroundResource(R.drawable.unselected_miles);
                    km_Button_interface_counter = true;
                    mi_Button_interface_counter = false;
                }
            }
        });

        amenity_button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(aButton1_interface_counter == false){
                    amenity_button_1.setBackgroundResource(R.drawable.amenity_switch_on);
                    aButton1_interface_counter = true;
                }
                else{
                    amenity_button_1.setBackgroundResource(R.drawable.amenity_switch_off);
                    aButton1_interface_counter = false;
                }
            }
        });

        amenity_button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(aButton2_interface_counter == false){
                    amenity_button_2.setBackgroundResource(R.drawable.amenity_switch_on);
                    aButton2_interface_counter = true;
                }
                else{
                    amenity_button_2.setBackgroundResource(R.drawable.amenity_switch_off);
                    aButton2_interface_counter = false;
                }
            }
        });

        amenity_button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(aButton3_interface_counter == false){
                    amenity_button_3.setBackgroundResource(R.drawable.amenity_switch_on);
                    aButton3_interface_counter = true;
                }
                else{
                    amenity_button_3.setBackgroundResource(R.drawable.amenity_switch_off);
                    aButton3_interface_counter = false;
                }
            }
        });

        amenity_button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(aButton4_interface_counter == false){
                    amenity_button_4.setBackgroundResource(R.drawable.amenity_switch_on);
                    aButton4_interface_counter = true;
                }
                else{
                    amenity_button_4.setBackgroundResource(R.drawable.amenity_switch_off);
                    aButton4_interface_counter = false;
                }
            }
        });

        amenity_button_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(aButton5_interface_counter == false){
                    amenity_button_5.setBackgroundResource(R.drawable.amenity_switch_on);
                    aButton5_interface_counter = true;
                }
                else{
                    amenity_button_5.setBackgroundResource(R.drawable.amenity_switch_off);
                    aButton5_interface_counter = false;
                }
            }
        });

        return view;

    }


}






