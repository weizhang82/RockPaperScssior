package com.example.csis.pace.edu.project;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;

/**
 * Created by dwy on 10/31/15.
 */
public class BatteryManager {
    private BroadcastReceiver batteryReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            int status = intent.getIntExtra("status", 0);
            int health = intent.getIntExtra("health", 0);
            boolean present = intent.getBooleanExtra("present", false);
            int level = intent.getIntExtra("level", 0);
            int scale = intent.getIntExtra("scale", 0);
            int icon_small = intent.getIntExtra("icon-small", 0);
            int plugged = intent.getIntExtra("plugged", 0);
            int voltage = intent.getIntExtra("voltage", 0);
            int temperature = intent.getIntExtra("temperature", 0);

            String technology = intent.getStringExtra("technology");
            String statusString = "";

//            switch(status){
//                case BatteryManager.BATTERY_STATUS_UNKNOWN:
//                    statusString = "unknown";
//                    break;
//            }

            if(action.equals(Intent.ACTION_BATTERY_CHANGED)){
                //电池电量，数字
                Log.d("Battery", "" + intent.getIntExtra("level", 0));
                //电池最大容量
                Log.d("Battery", "" + intent.getIntExtra("scale", 0));
                //电池伏数
                Log.d("Battery", "" + intent.getIntExtra("voltage", 0));
                //电池温度
                Log.d("Battery", "" + intent.getIntExtra("temperature", 0));
                //电池状态，返回是一个数字
                // BatteryManager.BATTERY_STATUS_CHARGING 表示是充电状态
                // BatteryManager.BATTERY_STATUS_DISCHARGING 放电中
                // BatteryManager.BATTERY_STATUS_NOT_CHARGING 未充电
                // BatteryManager.BATTERY_STATUS_FULL 电池满
               }
        }

    };


}
