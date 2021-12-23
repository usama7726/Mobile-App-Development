package com.example.task1

import android.app.Activity
<<<<<<< HEAD
import android.app.DownloadManager
=======
>>>>>>> eef6f73ac7c5f583f75aa68846fe195d2ef94ea9
import android.content.Intent
import android.graphics.Bitmap
import android.net.Uri
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
<<<<<<< HEAD
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley


class MainActivity: AppCompatActivity() {

=======
import com.google.android.gms.actions.NoteIntents

class MainActivity: AppCompatActivity() {

    private var data: Uri?
>>>>>>> eef6f73ac7c5f583f75aa68846fe195d2ef94ea9

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.relativelayout)
        val btn1:Button=findViewById(R.id.button5)
	val btn2 = findViewById<Button>(R.id.button6)
	btn2.setOnClickListener{
	capturePhoto()
	}
        btn1.setOnClickListener {
        viewContact()
            dialPhoneNumber()

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
<<<<<<< HEAD

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

=======
    fun dialPhoneNumber(phoneNumber: String) {
        val intent = Intent(Intent.ACTION_DIAL).apply{
            data = Uri.parse("tel:$phoneNumber")
        }
        if (intent.resolveActivity(packageManager) != null) {
            startActivity(intent)
        }
    }

fun capturePhoto() {
    val intent = Intent(MediaStore.INTENT_ACTION_STILL_IMAGE_CAMERA)
    if (intent.resolveActivity(packageManager) != null) {
var REQUEST_IMAGE_CAPTURE = 1
        startActivityForResult(intent, REQUEST_IMAGE_CAPTURE)
    }
}
>>>>>>> eef6f73ac7c5f583f75aa68846fe195d2ef94ea9
}