package com.example.task1

import android.app.Activity
import android.content.Intent
import android.graphics.Bitmap
import android.net.Uri
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.actions.NoteIntents

class MainActivity: AppCompatActivity() {

    private var data: Uri?

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
        }
    }
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
}