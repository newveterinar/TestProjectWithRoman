package ru.geekbrains.tests.testprojectwithroman

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //hehsfaewhfwehfowafaw
        //что-то написала Таня
        Toast.makeText(this, "Hi", Toast.LENGTH_SHORT).show()
    }
}