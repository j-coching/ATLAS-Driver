package com.example.atlasdriver;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.widget.ImageView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Log.d(LOG_TAG, "-------");
        Log.d(LOG_TAG, "XXXXXX");

        new Handler().postDelayed(new Runnable(){
            @Override
            public void run(){
                startActivity(new Intent(MainActivity.this,LoginActivity.class));
                finish();
            }
        },2000);

    }
}