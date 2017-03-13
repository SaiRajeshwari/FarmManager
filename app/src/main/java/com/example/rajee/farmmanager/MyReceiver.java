package com.example.rajee.farmmanager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class MyReceiver extends BroadcastReceiver {

    public MyReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        MainActivity.temperature = intent.getStringExtra("temperature");
        MainActivity.humidity = intent.getStringExtra("humidity");
    }
}
