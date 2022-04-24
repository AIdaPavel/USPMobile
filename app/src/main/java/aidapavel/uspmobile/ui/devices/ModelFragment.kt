package aidapavel.uspmobile.ui.devices

import aidapavel.uspmobile.R
import aidapavel.uspmobile.databinding.FragmentModelCharacteristicsBinding
import aidapavel.uspmobile.ui.base.viewBinding
import aidapavel.uspmobile.ui.recycler.RecyclerFragment
import android.os.Bundle
import android.view.View
import moxy.MvpAppCompatFragment

class ModelFragment : MvpAppCompatFragment(R.layout.fragment_model_characteristics) {
    private val binding: FragmentModelCharacteristicsBinding by viewBinding()
    private lateinit var modelView: View

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setModelsCharacteristics()
    }

    private fun setModelsCharacteristics() {
        childFragmentManager.beginTransaction()
            .replace(R.id.container, ModelFragment())
            .commit()


    }

    companion object {

        fun newInstance(view: View): ModelFragment {
            val modelFragment = ModelFragment()
            modelFragment.modelView = view
            return modelFragment
        }
    }
}