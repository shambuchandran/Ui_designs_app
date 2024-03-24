package com.example.uidesigns

import android.content.Intent
import android.media.RouteListingPreference.Item
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.uidesigns.databinding.ActivityMainActivitymanagestoreBinding

class MainActivitymanagestore : AppCompatActivity() {
    private lateinit var binding: ActivityMainActivitymanagestoreBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainActivitymanagestoreBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding.bottomNavigationView.setOnItemReselectedListener { MenuItem ->
            when (MenuItem.itemId) {
                R.id.home -> {
                    startActivity(Intent(this, MainActivity::class.java))
                    true
                }

                R.id.account -> {
                    startActivity(Intent(this, MainActivitypayments::class.java))
                    true
                }
                R.id.products -> {
                    startActivity(Intent(this, MainActivitypremium::class.java))
                    true
                }
                R.id.orders -> {
                    startActivity(Intent(this, MainActivityorder::class.java))
                    true
                }


                else -> false

            }
        }
    }
}


