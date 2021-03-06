package com.example.notification

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

class FireBaseMessageService :FirebaseMessagingService() {
   private val tag = "FireBaseMessageService"
    override fun onMessageReceived(remoteMessage: RemoteMessage) {
        Log.i(tag,remoteMessage.from.toString())

        if (remoteMessage.notification!= null){
            this.showNotification("01",remoteMessage.notification?.title.toString(),
            remoteMessage.notification?.body.toString()
                )
        }
    }
}