package com.simplecounter.app

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.simplecounter.app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    
    private lateinit var binding: ActivityMainBinding
    private var counter = 0
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        // 1. Enable Edge-to-Edge before setting the content view
        enableEdgeToEdge()
        
        // 2. Use View Binding for robust view access
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        
        // 3. Handle System Bar insets to avoid content being hidden under the status or navigation bars
        ViewCompat.setOnApplyWindowInsetsListener(binding.main) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        
        // 4. Initialize UI
        binding.titleText.text = getString(R.string.app_name)
        updateCounterDisplay()
        
        binding.incrementButton.setOnClickListener {
            counter++
            updateCounterDisplay()
        }
        
        binding.resetButton.setOnClickListener {
            counter = 0
            updateCounterDisplay()
        }
    }
    
    private fun updateCounterDisplay() {
        binding.counterText.text = getString(R.string.counter_value, counter)
    }
}
