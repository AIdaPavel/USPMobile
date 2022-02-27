package aidapavel.uspmobile

import aidapavel.uspmobile.databinding.ActivityMainBinding
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class App : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bottomNavigationView.setOnItemSelectedListener { menuItem ->
            when(menuItem.itemId) {
                R.id.bottom_nav_smartphone -> {
                    Log.d("menuItem", "${menuItem.title}")
                    true
                }
                R.id.bottom_nav_tablet -> {
                    Log.d("menuItem", "${menuItem.title}")
                    true
                }
                R.id.bottom_nav_accessories -> {
                    Log.d("menuItem", "${menuItem.title}")
                    true
                }
                else -> {
                    false
                }
            }
        }

        binding.bottomNavigationView.selectedItemId = R.id.bottom_nav_smartphone
    }
}