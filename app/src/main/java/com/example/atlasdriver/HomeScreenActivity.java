package com.example.atlasdriver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class HomeScreenActivity extends AppCompatActivity {

    private ImageView cctv_map_switch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        cctv_map_switch = (ImageView) findViewById(R.id.switch_cctv_map_view_button);

        cctv_map_switch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Placeholder Activity: once clicked, will go to splash screen.
                //edit this activity so that it will go from map fragment to cctv fragment
                Intent intent = new Intent(HomeScreenActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });


    }
}