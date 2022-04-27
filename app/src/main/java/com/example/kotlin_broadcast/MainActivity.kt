package com.example.kotlin_broadcast

import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity()
{
     lateinit var receiver:AirPlaneModeChangeReceiver
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        receiver=AirPlaneModeChangeReceiver()
        IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED)
            .also {
                registerReceiver(receiver,it)
            }




    }

    override fun onStop() {
        super.onStop()
        unregisterReceiver(receiver)
    }



}