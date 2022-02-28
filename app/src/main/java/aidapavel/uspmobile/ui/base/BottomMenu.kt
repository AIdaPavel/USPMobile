package aidapavel.uspmobile.ui.base

import aidapavel.uspmobile.R
import aidapavel.uspmobile.databinding.ActivityMainBinding
import android.util.Log
import android.widget.Toast

class BottomMenu(private val binding: ActivityMainBinding) : IBackPressed {

    fun usedBottomMenu() {
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

    override fun backPressed(): Boolean {
        if (binding.bottomNavigationView.selectedItemId == R.id.bottom_nav_smartphone) {
            return true
        }
        binding.bottomNavigationView.selectedItemId = R.id.bottom_nav_smartphone
        return false
    }
}