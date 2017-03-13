package com.example.rajee.farmmanager;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public static String temperature = "";
    public static String humidity = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Button btn_temp_humidity = (Button) findViewById(R.id.temp_humidity);
        btn_temp_humidity.setText("Temperature " + temperature + "(F) \n & Humidity " + humidity + "%");
    }
}
