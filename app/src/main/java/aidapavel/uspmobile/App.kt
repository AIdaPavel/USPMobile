package aidapavel.uspmobile

import aidapavel.uspmobile.databinding.ActivityMainBinding
import aidapavel.uspmobile.ui.base.BottomMenu
import aidapavel.uspmobile.ui.adapter.ViewPagerAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class App : AppCompatActivity() {
    private var backPressedTime: Long = 0L
    private lateinit var toast: Toast
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.viewPager.adapter = ViewPagerAdapter(supportFragmentManager, lifecycle)
        BottomMenu(binding).usedBottomMenu()

    }

    override fun onBackPressed() {
        toast = Toast.makeText(binding.root.context, R.string.back_pressed, Toast.LENGTH_SHORT)
        if (BottomMenu(binding).backPressed()) {
            if (backPressedTime + 1000 > System.currentTimeMillis()) {
                super.onBackPressed()
            }

            toast.show()
        }
        backPressedTime = System.currentTimeMillis()
    }

    override fun onDestroy() {
        toast.cancel()
        super.onDestroy()
    }
}