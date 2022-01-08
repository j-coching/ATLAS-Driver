package com.example.atlasdriver;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class AmenityFragment extends Fragment {

    View view;
    public boolean aButton1_interface_counter = true;
    private Button amenity_button_1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_amenity, container, false);

        amenity_button_1 = (Button) view.findViewById(R.id.aButton1);

        amenity_button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(aButton1_interface_counter == false){
                    amenity_button_1.setBackgroundResource(R.drawable.map_switch);
                    aButton1_interface_counter = true;
                }
                else{
                    amenity_button_1.setBackgroundResource(R.drawable.cctv_switch);
                    aButton1_interface_counter = false;
                }
            }
        });

        return view;
    }
}