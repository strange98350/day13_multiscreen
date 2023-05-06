package com.example.day13

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.day13.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // creating key
    companion object {
        const val KEY = "com.example.day13.MainActivity.KEY"
    }

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnOrder.setOnClickListener {
            val ordersPlaced = binding.eT1.text.toString() + " " + binding.eT2.text.toString() + " " +
                    binding.eT3.text.toString() + " " + binding.eT4.text.toString()

            val intent = Intent(this, Order::class.java)
            intent.putExtra(KEY, ordersPlaced)
            startActivity(intent)
        }
    }
}
