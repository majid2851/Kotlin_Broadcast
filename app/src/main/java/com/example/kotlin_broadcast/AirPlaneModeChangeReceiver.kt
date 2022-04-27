package com.example.kotlin_broadcast

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast

class AirPlaneModeChangeReceiver: BroadcastReceiver()
{
    override fun onReceive(context: Context?, intent: Intent?)
    {
        val isAirplaneEnabled=intent?.getBooleanExtra("state",false) ?:
            return//if isAirplaneEnabled==null ->cease operation
        if (isAirplaneEnabled){
            Log.i("mag2851","airplane is enabled")
        }else{
            Log.i("mag2851","airplane is disabled")
        }

    }


}