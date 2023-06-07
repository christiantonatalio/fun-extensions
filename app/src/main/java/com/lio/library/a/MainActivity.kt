package com.lio.library.a

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lio.library.extensions.isInvalidEmail

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val a = "nataliosaleky@gmail.com"
        val x = a.isInvalidEmail()
    }
}