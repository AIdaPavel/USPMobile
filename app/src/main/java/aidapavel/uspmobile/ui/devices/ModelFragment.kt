package aidapavel.uspmobile.ui.devices

import aidapavel.uspmobile.R
import aidapavel.uspmobile.databinding.FragmentModelCharacteristicsBinding
import aidapavel.uspmobile.ui.base.viewBinding
import android.os.Bundle
import moxy.MvpAppCompatFragment

class ModelFragment : MvpAppCompatFragment(R.layout.fragment_model_characteristics) {
    private val binding: FragmentModelCharacteristicsBinding by viewBinding()


    companion object {

        fun newInstance(bundle: Bundle): ModelFragment {
            val modelFragment = ModelFragment()
            modelFragment.arguments = bundle
            return modelFragment
        }
    }
}