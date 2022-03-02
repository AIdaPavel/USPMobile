package aidapavel.uspmobile.ui.base

import aidapavel.uspmobile.R
import aidapavel.uspmobile.databinding.ActivityMainBinding
import androidx.viewpager2.widget.ViewPager2

class BottomMenu(private val binding: ActivityMainBinding) : IBackPressed {

    private var value: Int = 0

    fun usedBottomMenu() {
        binding.bottomNavigationView.setOnItemSelectedListener { menuItem ->
            when(menuItem.itemId) {
                R.id.bottom_nav_tablet -> {
                    binding.viewPager.currentItem = 0
                    true
                }
                R.id.bottom_nav_smartphone-> {
                    binding.viewPager.currentItem = 1
                    true
                }
                R.id.bottom_nav_accessories -> {
                    binding.viewPager.currentItem = 2
                    true
                }
                else -> {
                    false
                }
            }
        }

        binding.bottomNavigationView.selectedItemId = R.id.bottom_nav_smartphone

        binding.viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                when(position) {
                    0 -> {
                        binding.bottomNavigationView
                            .menu.findItem(R.id.bottom_nav_tablet).isChecked = true
                        value = position
                    }
                    1 -> {
                        binding.bottomNavigationView
                            .menu.findItem(R.id.bottom_nav_smartphone).isChecked = true
                        value = position
                    }
                    2 -> {
                        binding.bottomNavigationView
                            .menu.findItem(R.id.bottom_nav_accessories).isChecked = true
                        value = position
                    }
                    else -> {
                        binding.bottomNavigationView
                            .menu.findItem(R.id.bottom_nav_smartphone).isChecked = true
                        value = 1
                    }
                }
            }
        })
    }


    override fun backPressed(): Boolean {
        if (binding.bottomNavigationView.selectedItemId == R.id.bottom_nav_smartphone) {
            return true
        }
        binding.bottomNavigationView.selectedItemId = R.id.bottom_nav_smartphone
        return false
    }

    fun getValue(): Int {
        return value
    }
}