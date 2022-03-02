package aidapavel.uspmobile.ui.devices

import aidapavel.uspmobile.R
import aidapavel.uspmobile.databinding.ActivityMainBinding
import aidapavel.uspmobile.databinding.FragmentDevicesBinding
import aidapavel.uspmobile.ui.base.BottomMenu
import aidapavel.uspmobile.ui.base.viewBinding
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import moxy.MvpAppCompatFragment

class DevicesFragment : MvpAppCompatFragment(R.layout.fragment_devices) {
    private val binding: FragmentDevicesBinding by viewBinding()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setModelsListTablets(BottomMenu(ActivityMainBinding.inflate(LayoutInflater.from(context))).getValue())
    }

    private fun setModelsListTablets(position: Int){
        binding.textView.text = "tab s8"
        /*setData*/
    }
}