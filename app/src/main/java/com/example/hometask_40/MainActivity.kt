package com.example.hometask_40

import android.content.Intent
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main_discounts.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        goToCountries()
        goToDiscounts()

    }


    fun goToCountries() {

        ivCountiresButtom.setOnClickListener {
            val intent = Intent(this, MainActivityCountries::class.java)
            startActivity(intent)
        }
    }

    fun goToDiscounts() {

        ivDiscountsButtom.setOnClickListener {
            val intent = Intent(this, MainActivityDiscounts::class.java)
            startActivity(intent)
        }
    }




}



