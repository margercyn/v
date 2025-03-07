package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.lifecycle.findViewTreeViewModelStoreOwner
import com.google.android.material.bottomnavigation.BottomNavigationView
import javax.annotation.meta.When

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       val vA = findViewById<Button>(R.id.pere)
        vA.setOnClickListener {
            val intent = Intent(this, Regist::class.java)
            startActivity(intent)
        }
    }
}