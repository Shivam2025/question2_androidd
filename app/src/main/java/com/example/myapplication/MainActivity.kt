package com.example.myapplication



import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btn_click_me = findViewById(R.id.btn_click_me) as Button

        btn_click_me.setOnClickListener {
            // make a toast on button click event
            val toast =
                Toast.makeText(this, "Save Successfully.", Toast.LENGTH_LONG)
            toast.setGravity(Gravity.TOP or Gravity.RIGHT, 0, 0)
            toast.show()
        }
    }
}