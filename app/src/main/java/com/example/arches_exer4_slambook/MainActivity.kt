package com.example.arches_exer4_slambook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

//import com.example.arches_exer4_slambook.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    private fun afterDoneButton(view: View) {
//      this pertains to those edit texts that are about to be gone when done button is clicked
        val editTextName = findViewById <EditText>(R.id.editTextName)
        val editNickname = findViewById<EditText>(R.id.editNickname)
        val editAge = findViewById<EditText>(R.id.editAge)
        val editBirthday = findViewById<EditText>(R.id.editBirthday)
        val editPhoneNumber = findViewById<EditText>(R.id.editPhoneNumber)
        val editEmail = findViewById<EditText>(R.id.editEmail)
        val editCourse = findViewById<EditText>(R.id.editCourse)
        val editDream = findViewById<EditText>(R.id.editDream)
        val editCrush = findViewById<EditText>(R.id.editCrush)
        val editMessage = findViewById<EditText>(R.id.editMessage)

//      this pertains to those texts that are about to be gone when done button is clicked
        val hello_text = findViewById<TextView>(R.id.hello_text)
        val name_text = findViewById<TextView>(R.id.name_text)
        val nickname_text = findViewById<TextView>(R.id.nickname_text)
        val age_text = findViewById<TextView>(R.id.age_text)
        val birthday_text = findViewById<TextView>(R.id.birthday_text)
        val phoneNumber_text = findViewById<TextView>(R.id.phoneNumber_text)
        val email_text = findViewById<TextView>(R.id.email_text)
        val course_text = findViewById<TextView>(R.id.course_text)
        val dream_text = findViewById<TextView>(R.id.dream_text)
        val crush_text = findViewById<TextView>(R.id.crush_text)
        val message_text = findViewById<TextView>(R.id.message_text)

//      this pertains to those texts that are about to be shown when all other contents changed visibility to gone

    }
}
