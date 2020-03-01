package com.example.arches_exer4_slambook

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.arches_exer4_slambook.databinding.ActivityMainBinding
import kotlinx.android.synthetic.*

//import com.example.arches_exer4_slambook.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val myName: MyName = MyName("Name")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//       setContentView(R.layout.activity_main) -> replaced by the one below
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.myName = myName
//      replace findViewByID<Button>(R.id.done_button) by the one below
        binding.doneButton.setOnClickListener {
            afterDoneButton()
            val inputMethodManager =
                getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            inputMethodManager.hideSoftInputFromWindow(it.windowToken, 0)
        }
    }

    private fun afterDoneButton() {
//        val nameAnswer = findViewById<TextView>(R.id.name_answer)
//        val nicknameAnswer = findViewById<TextView>(R.id.nickname_answer)
//        val ageAnswer = findViewById<TextView>(R.id.age_answer)
//        val thanksAnswer = findViewById<TextView>(R.id.thanks_answer)
//        val button = findViewById<Button>(R.id.done_button)

//      this pertains to those edit texts that are about to be gone when done button is clicked
//        val editTextName = findViewById<EditText>(R.id.editTextName)
//        val editNickname = findViewById<EditText>(R.id.editNickname)
//        val editAge = findViewById<EditText>(R.id.editAge)
//        val editBirthday = findViewById<EditText>(R.id.editBirthday)
//        val editPhoneNumber = findViewById<EditText>(R.id.editPhoneNumber)
//        val editEmail = findViewById<EditText>(R.id.editEmail)
//        val editCourse = findViewById<EditText>(R.id.editCourse)
//        val editDream = findViewById<EditText>(R.id.editDream)
//        val editCrush = findViewById<EditText>(R.id.editCrush)
//        val editMessage = findViewById<EditText>(R.id.editMessage)

//      this pertains to those texts that are about to be gone when done button is clicked
//        val helloText = findViewById<TextView>(R.id.hello_text)
//        val nameText = findViewById<TextView>(R.id.name_text)
//        val nicknameText = findViewById<TextView>(R.id.nickname_text)
//        val ageText = findViewById<TextView>(R.id.age_text)
//        val birthdayText = findViewById<TextView>(R.id.birthday_text)
//        val phoneNumberText = findViewById<TextView>(R.id.phoneNumber_text)
//        val emailText = findViewById<TextView>(R.id.email_text)
//        val courseText = findViewById<TextView>(R.id.course_text)
//        val dreamText = findViewById<TextView>(R.id.dream_text)
//        val crushText = findViewById<TextView>(R.id.crush_text)
//        val messageText = findViewById<TextView>(R.id.message_text)

//      this pertains to those texts that are about to be shown when all other contents changed visibility to gone



        //REFERENCE
//      binding.nicknameText.text = binding.nicknameEdit.text
//      binding.nicknameEdit.visibility = View.GONE
//      binding.doneButton.visibility = View.GONE
//      binding.nicknameText.visibility = View.VISIBLE



        binding.apply{

            editTextName.visibility = View.GONE
            editNickname.visibility = View.GONE
            editAge.visibility = View.GONE
            editBirthday.visibility = View.GONE
            editPhoneNumber.visibility = View.GONE
            editEmail.visibility = View.GONE
            editCourse.visibility = View.GONE
            editDream.visibility = View.GONE
            editCrush.visibility = View.GONE
            editMessage.visibility = View.GONE

            helloText.visibility = View.GONE
            nameText.visibility = View.GONE
            nicknameText.visibility = View.GONE
            ageText.visibility = View.GONE
            birthdayText.visibility = View.GONE
            phoneNumberText.visibility = View.GONE
            emailText.visibility = View.GONE
            courseText.visibility = View.GONE
            dreamText.visibility = View.GONE
            crushText.visibility = View.GONE
            messageText.visibility = View.GONE


            myName?.name = editTextName.text.toString()
            myName?.nickname = editNickname.text.toString()
            myName?.age = editAge.text.toString()

            invalidateAll()

            nameAnswer.visibility = View.VISIBLE
            nicknameAnswer.visibility = View.VISIBLE
            ageAnswer.visibility = View.VISIBLE
            thanksAnswer.visibility = View.VISIBLE
            doneButton.visibility = View.GONE

        }


//        nameAnswer.text = editTextName.text
//        nicknameAnswer.text = editNickname.text
//        ageAnswer.text = editAge.text

//        nameAnswer.visibility = View.VISIBLE
//        nicknameAnswer.visibility = View.VISIBLE
//        ageAnswer.visibility = View.VISIBLE
//        thanksAnswer.visibility = View.VISIBLE
//        button.visibility = View.GONE

    }
}
