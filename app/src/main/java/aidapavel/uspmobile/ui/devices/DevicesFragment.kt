package aidapavel.uspmobile.ui.devices

import aidapavel.uspmobile.R
import aidapavel.uspmobile.databinding.FragmentDevicesMainBinding
import aidapavel.uspmobile.ui.base.viewBinding
import aidapavel.uspmobile.ui.recycler.RecyclerFragment
import android.os.Bundle
import android.view.View
import moxy.MvpAppCompatFragment

class DevicesFragment : MvpAppCompatFragment(R.layout.fragment_devices_main) {
    private val binding: FragmentDevicesMainBinding by viewBinding()
    private var positionValue: Int = 0

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setModelsListDevices()
    }

    private fun setModelsListDevices(){
        childFragmentManager.beginTransaction()
                .replace(R.id.container, RecyclerFragment(positionValue))
                .commit()
    }

    companion object {

        fun newInstance(position: Int): DevicesFragment {
            val devicesFragment = DevicesFragment()
            devicesFragment.positionValue = position
            return devicesFragment
        }
    }
}