package com.example.atlasdriver;

import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class LoginActivity extends AppCompatActivity {

    private static final String LOG_TAG = LoginActivity.class.getSimpleName();
    EditText tUsername;
    private FirebaseAuth mAuth;

    private void updateUI(FirebaseUser currentUser) {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Log.d(LOG_TAG, "-------");
        Log.d(LOG_TAG, "onCreate");

        tUsername = findViewById(R.id.user);

        mAuth = FirebaseAuth.getInstance();
        //passwordTextView = findViewById(R.id.pswd);
    }
}





