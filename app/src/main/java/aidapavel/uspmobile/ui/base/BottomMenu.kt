package aidapavel.uspmobile.ui.base

import aidapavel.uspmobile.R
import aidapavel.uspmobile.databinding.FragmentViewpagerBinding
import androidx.viewpager2.widget.ViewPager2

class BottomMenu {

    fun usedBottomMenu(binding: FragmentViewpagerBinding) {
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
                R.id.bottom_nav_laptops -> {
                    binding.viewPager.currentItem = 3
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
                    0 ->
                        binding.bottomNavigationView
                            .menu.findItem(R.id.bottom_nav_tablet).isChecked = true
                    1 ->
                        binding.bottomNavigationView
                            .menu.findItem(R.id.bottom_nav_smartphone).isChecked = true
                    2 ->
                        binding.bottomNavigationView
                            .menu.findItem(R.id.bottom_nav_accessories).isChecked = true
                    3 ->
                        binding.bottomNavigationView
                            .menu.findItem(R.id.bottom_nav_laptops).isChecked = true
                    else ->
                        binding.bottomNavigationView
                            .menu.findItem(R.id.bottom_nav_smartphone).isChecked = true
                }
            }
        })
    }
}