package aidapavel.uspmobile.ui.devices

import aidapavel.uspmobile.R
import aidapavel.uspmobile.databinding.FragmentDevicesBinding
import aidapavel.uspmobile.ui.base.viewBinding
import android.os.Bundle
import android.view.View
import moxy.MvpAppCompatFragment

class DevicesFragment() : MvpAppCompatFragment(R.layout.fragment_devices) {
    private val binding: FragmentDevicesBinding by viewBinding()
    private var positionValue: Int = 0

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setModelsListTablets(positionValue)
    }

    private fun setModelsListTablets(position: Int){
        when (position) {
            0 -> binding.textView.text = getText(R.string.tablets) //код для теста, будет заменен
            1 -> binding.textView.text = getText(R.string.smartphones) //код для теста, будет заменен
            2 -> binding.textView.text = getText(R.string.accessories) //код для теста, будет заменен
        }
    }

    companion object {

        fun newInstance(position: Int):DevicesFragment {
            val devicesFragment = DevicesFragment()
            devicesFragment.positionValue = position
            return devicesFragment
        }
    }
}