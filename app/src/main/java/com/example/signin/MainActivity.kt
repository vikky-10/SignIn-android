package com.example.signin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var llmain: LinearLayout = findViewById(R.id.main);
        var signIn: Button = findViewById(R.id.Sing_in) as Button;
        signIn.setOnClickListener {
            val actionSnackbar = Snackbar.make(llmain,"Done successfully", Snackbar.LENGTH_LONG).setAction("Ok") {
                // Call action functions here
            }.show()
             
        }
    }
}