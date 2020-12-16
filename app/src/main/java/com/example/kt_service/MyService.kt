package com.example.kt_service

import android.app.Service
import android.content.Intent
import android.os.IBinder
import androidx.core.content.ContextCompat.startActivity
import kotlin.UnsupportedOperationException

class MyService : Service() {

    override fun onCreate() {
        super.onCreate()
        Thread{
            run{
                try {
                    Thread.sleep(5000)
                    var intent = Intent(this, MainActivity2::class.java)
                    intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
                    startActivity(intent)
                }catch (e:InterruptedException){
                    e.printStackTrace()
                }
            }
        }.start()

        stopSelf()
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        return super.onStartCommand(intent, flags, startId)
        return START_STICKY
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    override fun onBind(intent: Intent): IBinder {
        TODO("Return the communication channel to the service.")
        throw UnsupportedOperationException("Not yet implemented")
    }
}