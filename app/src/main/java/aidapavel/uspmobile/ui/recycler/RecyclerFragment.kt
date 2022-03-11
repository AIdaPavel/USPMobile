package aidapavel.uspmobile.ui.recycler

import aidapavel.uspmobile.R
import aidapavel.uspmobile.databinding.FragmentModelsListBinding
import aidapavel.uspmobile.ui.base.viewBinding
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import moxy.MvpAppCompatFragment

class RecyclerFragment(private val position: Int) : MvpAppCompatFragment(R.layout.fragment_models_list) {

    private val binding: FragmentModelsListBinding by viewBinding()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setData(position)

    }

    private fun setData(position: Int) {
        // TODO перенести дату дальше из фрагмента
        val dataSmartphone = arrayListOf(
            Data("Z Fold"),
            Data("Z Flip"),
            Data("S 22"),
            Data("S 21"),
            Data("S 21fe"),
            Data("S 20fe"),
            Data("A 72"),
            Data("A 52"),
            Data("A 32"),
            Data("A 22"),
            Data("A 22s"),
            Data("А 12"),
            Data("М 52"),
            Data("М 32"),
            Data("М 22"),
            Data("М 12"),
        )

        val dataTablet = arrayListOf(
            Data("Tab S8"),
            Data("Tab S7"),
            Data("Tab S7fe"),
            Data("Tab S6lite"),
            Data("Tab A8"),
            Data("Tab A8 Kids"),
        )

        val dataAccessory = arrayListOf(
            Data("Watch 4"),
            Data("Watch 3"),
            Data("Active 2"),
            Data("Buds pro"),
            Data("Buds 2"),
            Data("Buds live"),
        )

        val dataLaptop = arrayListOf(
            Data("Book Pro 360"),
            Data("Book Pro"),
        )
        when (position) {
            0 -> {
                binding.devicesTitle.text = getString(R.string.tablets)
                binding.recyclerModelList.adapter = RecyclerModelsListAdapter(dataTablet)
            }
            1 -> {
                binding.devicesTitle.text = getString(R.string.smartphones)
                binding.recyclerModelList.adapter = RecyclerModelsListAdapter(dataSmartphone)
            }
            2 -> {
                binding.devicesTitle.text = getString(R.string.accessories)
                binding.recyclerModelList.adapter = RecyclerModelsListAdapter(dataAccessory)
            }
            3 -> {
                binding.devicesTitle.text = getString(R.string.laptop)
                binding.recyclerModelList.adapter = RecyclerModelsListAdapter(dataLaptop)
            }
        }
    }

}