package com.example.myapp

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    private fun clickHandlerFunction(viewThatIsClicked: View) {
        // Add code to perform the button click event
    }


    private fun addNickname(view: View) {
        val editText = findViewById<EditText>(R.id.nicknameEdit)
        val nicknameTextView = findViewById<TextView>(R.id.textView)
        nicknameTextView.text = editText.text
        editText.visibility = View.GONE
        view.visibility = View.GONE
        nicknameTextView.visibility = View.VISIBLE

        findViewById<Button>(R.id.done_button).setOnClickListener {
            addNickname(it)
        }

    }

    private fun updateNickname (view: View) {
        val editText = findViewById<EditText>(R.id.nicknameEdit)
        val doneButton = findViewById<Button>(R.id.done_button)

        editText.visibility = View.VISIBLE
        doneButton.visibility = View.VISIBLE
        view.visibility = View.GONE

        findViewById<TextView>(R.id.name_text).setOnClickListener {
            updateNickname(it)
        }
    }



    // Hide the keyboard.
//    val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
//    inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)





}

