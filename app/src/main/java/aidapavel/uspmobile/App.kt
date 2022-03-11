package aidapavel.uspmobile

import aidapavel.uspmobile.databinding.ActivityMainBinding
import aidapavel.uspmobile.ui.ViewPagerFragment
import aidapavel.uspmobile.ui.base.viewBinding
import android.content.Context
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class App : AppCompatActivity() {
    private var backPressedTime: Long = 0L
    private lateinit var toast: Toast
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        toast = Toast.makeText(binding.root.context, R.string.back_pressed, Toast.LENGTH_SHORT)

        supportFragmentManager.beginTransaction().replace(R.id.containerMain, ViewPagerFragment()).commit()
    }

    override fun onBackPressed() {
        if (ViewPagerFragment().backPressed()) {
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