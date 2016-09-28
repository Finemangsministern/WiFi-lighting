package com.example.emil.lightcontroluno;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
    }

    public void onSplashClick(View view){
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
        finish();
    }
}
