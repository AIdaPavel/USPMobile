package aidapavel.uspmobile.ui.devices

import aidapavel.uspmobile.R
import aidapavel.uspmobile.databinding.FragmentDevicesBinding
import aidapavel.uspmobile.ui.base.viewBinding
import android.os.Bundle
import android.view.View
import moxy.MvpAppCompatFragment

class DevicesFragment() : MvpAppCompatFragment(R.layout.fragment_devices) {
    private val binding: FragmentDevicesBinding by viewBinding()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setModelsList(0)
    }

    private fun setModelsList(position: Int){
        when (position) {
            0 -> {/*getData()*/}
            1 -> {/*getData()*/}
            2 -> {/*getData()*/}
        }
    }
}