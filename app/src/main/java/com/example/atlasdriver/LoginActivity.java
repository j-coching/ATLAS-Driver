package com.example.atlasdriver;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{

    private static final String LOG_TAG = LoginActivity.class.getSimpleName();
    EditText tUsername, tPassword;
    Button mSignIn;
    private FirebaseAuth mAuth;
    private ImageView qr_button;

    private void updateUI(FirebaseUser currentUser) {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        qr_button = (ImageView) findViewById(R.id.qr_button);
        qr_button.setOnClickListener(this);

        FirebaseApp.initializeApp(this);

        Log.e(LOG_TAG, "-------");
        Log.e(LOG_TAG, "about to login");

        tUsername = (EditText) findViewById(R.id.et_user);
        tPassword = (EditText) findViewById(R.id.et_pswd);
        mSignIn = (Button) findViewById(R.id.signin);

        mSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = tUsername.getText().toString();
                String password = tPassword.getText().toString();

                if(TextUtils.isEmpty(username)){
                    tUsername.setError("Username is Required!");

                    return;
                }

                if(TextUtils.isEmpty(password)){
                    tUsername.setError("Password is Required!");

                    return;
                }

                mAuth = FirebaseAuth.getInstance();

                mAuth.signInWithEmailAndPassword(username,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            Toast.makeText(LoginActivity.this, "Logged in Successfully!", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(LoginActivity.this,HomeScreenActivity.class));
                        } else{
                            Toast.makeText(LoginActivity.this, "Log in Unsuccessful!", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }


        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.qr_button:
                startActivity(new Intent(this, cam_qr.class));
                break;
        }
    }
}





