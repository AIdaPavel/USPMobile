package aidapavel.uspmobile.ui

import aidapavel.uspmobile.R
import aidapavel.uspmobile.databinding.FragmentViewpagerBinding
import aidapavel.uspmobile.ui.adapter.ViewPagerAdapter
import aidapavel.uspmobile.ui.base.BottomMenu
import aidapavel.uspmobile.ui.base.IBackPressed
import aidapavel.uspmobile.ui.base.viewBinding
import android.os.Bundle
import android.view.View
import moxy.MvpAppCompatFragment

class ViewPagerFragment : MvpAppCompatFragment(R.layout.fragment_viewpager), IBackPressed {
    private val binding: FragmentViewpagerBinding by viewBinding()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.viewPager.adapter = ViewPagerAdapter(requireActivity())
        BottomMenu().usedBottomMenu(binding)
    }

    override fun backPressed(): Boolean {
        //TODO разобраться с binding-ом (приходит NULL)
        /*if (binding.bottomNavigationView.selectedItemId == R.id.bottom_nav_smartphone) {
            return true
        }
        binding.bottomNavigationView.selectedItemId = R.id.bottom_nav_smartphone
        return false*/

        return true
    }
}