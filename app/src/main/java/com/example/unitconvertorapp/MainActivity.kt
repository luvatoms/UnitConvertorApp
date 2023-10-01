package com.example.unitconvertorapp

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var button: Button? = null
    private var textView: TextView? = null
    private var editText: EditText? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView = findViewById(R.id.textView3)
        button = findViewById(R.id.button)
        editText = findViewById(R.id.editTextText)
        //        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(MainActivity.this, "hii clicklistener worked", Toast.LENGTH_SHORT).show();
//                String s = editText.getText().toString();
//                int kg = Integer.parseInt(s);
//                double pound = 2.205*kg;
//                textView.setText(kg+" kg is pound "+pound);
//            }
//
//        });
    }

    fun calculate(view: View?) {
        Toast.makeText(this@MainActivity, "thnks for using this app", Toast.LENGTH_SHORT).show()
        val s = editText!!.text.toString()
        val kg = s.toInt()
        val pound = 2.205 * kg
        textView!!.text = "$kg kg is pound $pound"
    }
}