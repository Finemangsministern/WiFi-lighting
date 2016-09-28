package com.example.emil.lightcontroluno;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void onDrawmodeClick(View view){
        Intent intent = new Intent(this,Drawmode.class);
        startActivity(intent);
    }

    public void onStarmodeClick(View view){
        Intent intent = new Intent(this,Starmode.class);
        startActivity(intent);
    }

    public void onSunriseClick(View view){
        Intent intent = new Intent(this,Sunrise.class);
        startActivity(intent);
    }
}
