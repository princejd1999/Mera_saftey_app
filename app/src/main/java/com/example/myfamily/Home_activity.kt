package com.example.myfamily

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.android.material.bottomnavigation.BottomNavigationView

class Home_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        var bottom_bar = findViewById<BottomNavigationView>(R.id.nav_frag_home)
        bottom_bar.setOnItemReselectedListener {
            inflate_frag()
        }
        }

    private fun inflate_frag() {
        var transaction_fag = supportFragmentManager.beginTransaction()
        transaction_fag.replace(R.id.container,Ambulance_fragment.newInstance())
        transaction_fag.commit()
    }
}


