package com.example.jokelistapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import okhttp3.OkHttpClient
import okhttp3.Request

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val client = OkHttpClient()

        val request = Request.Builder()
            .url("https://dad-jokes.p.rapidapi.com/joke/5f80ccd641785ba7c7d27b66")
            .get()
            .addHeader("x-rapidapi-key", "84d6f508d8msh928301995c60981p1acd43jsna37045b1bf8c")
            .addHeader("x-rapidapi-host", "dad-jokes.p.rapidapi.com")
            .build()

        val response = client.newCall(request).execute()
        
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}