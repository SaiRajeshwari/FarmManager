package com.example.rajee.farmmanager;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public static String temperature = "";
    public static String humidity = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_fan = (Button) findViewById(R.id.turn_fan);
        btn_fan.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.addFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES);
                i.setAction("com.example.rajee.broadcast.FAN");
                i.putExtra("fan", "true");
                i.putExtra("sprinkler", "false");
                sendBroadcast(i);
            }
        });

        Button btn_fan_sprinkler = (Button) findViewById(R.id.turn_fan_sprinkler);
        btn_fan_sprinkler.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.addFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES);
                i.setAction("com.example.rajee.broadcast.FAN_SPRINKLER");
                i.putExtra("fan", "true");
                i.putExtra("sprinkler", "true");
                sendBroadcast(i);
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        Button btn_temp_humidity = (Button) findViewById(R.id.temp_humidity);
        btn_temp_humidity.setText("Temperature " + temperature + "(F) \n & Humidity " + humidity + "%");
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

}