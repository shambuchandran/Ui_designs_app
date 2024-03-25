package com.example.uidesigns

import android.os.Bundle
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivitycatalogue : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_activitycatalogue)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val images = listOf(
            R.drawable.tshirt,
            R.drawable.tshirt1,
            R.drawable.tshirt2,
            R.drawable.tshirt3,
            R.drawable.tshirt,
            R.drawable.tshirt1,
            R.drawable.tshirt2,
            R.drawable.tshirt3,
        )
        val listview=findViewById<ListView>(R.id.orderlistview)
        listview.adapter=ListAdapter(this,images)



    }
}