package ru.geekbrains.tests.testprojectwithroman

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //что-то написала Таня
        Toast.makeText(this, "Hi", Toast.LENGTH_SHORT).show()
    }
}