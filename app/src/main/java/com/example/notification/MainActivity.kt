package com.example.notification

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.google.firebase.iid.FirebaseInstanceId
import com.google.firebase.iid.FirebaseInstanceIdService
import kotlin.math.log

class MainActivity : AppCompatActivity() {

    lateinit var btnSend : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSend = findViewById(R.id.button_send_notificatio)
        btnSend.setOnClickListener {
            this.showNotification("01","Teste ", "Testando a notificação local")

        }
        Log.i("**newToken", FirebaseInstanceId.getInstance().token.toString())
    }

}