package com.example.task1

import android.app.Activity
import android.app.DownloadManager
import android.content.Intent
import android.graphics.Bitmap
import android.net.Uri
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley


class MainActivity: AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.relativelayout)
        val btn1:Button=findViewById(R.id.button5)
        btn1.setOnClickListener {
        viewContact()

        }
    }
    fun viewContact() {
        val contactUri = Uri.parse("www.google.com")
        val intent = Intent(Intent.ACTION_VIEW, contactUri)
        if (intent.resolveActivity(packageManager) != null) {
            startActivity(intent)
            apicall()
        }
    }

    private fun apicall() {
        val Uri="https://some-random-api.ml/animal/dog"
        val queue = Volley.newRequestQueue(this)
        val jsonObjectRequest = JsonObjectRequest(
            DownloadManager.Request.Method.Get,Uri, null,
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