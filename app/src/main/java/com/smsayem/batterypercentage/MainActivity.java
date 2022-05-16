package com.smsayem.batterypercentage;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.content.IntentFilter;
import android.widget.TextView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    BatteryReceiver batteryReceiver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    tv=findViewById(R.id.tv);
    batteryReceiver=new BatteryReceiver(tv);
    registerReceiver(batteryReceiver,new IntentFilter(Intent.ACTION_BATTERY_CHANGED));
        }
    @Override
    protected void onStop() {
        super.onStop();
        unregisterReceiver(batteryReceiver);
    }
}

