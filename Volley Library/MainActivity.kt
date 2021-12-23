package com.example.myfirstapp

import android.app.DownloadManager
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.JsonArrayRequest
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




    apicall()


    }

    private fun apicall() {
        val Uri="https://some-random-api.ml/animal/dog"
        val queue = Volley.newRequestQueue(this)
        val jsonObjectRequest = JsonObjectRequest(
            Request.Method.Get,url, null,
            Response.Listener{
            Log.d("MainActivity", "Api call successful")

            },Response.ErrorListener
            {
                Log.d("MainActivity", "Api call failed")
            }
        )
    queue.add(JsonObjectRequest)
    }

}

