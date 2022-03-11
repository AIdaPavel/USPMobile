package aidapavel.uspmobile.ui.adapter

import aidapavel.uspmobile.ui.devices.DevicesFragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity ) {

    private val fragments = arrayOf(DevicesFragment, DevicesFragment, DevicesFragment, DevicesFragment)

    override fun getItemCount() = fragments.size

    override fun createFragment(position: Int) = fragments[position].newInstance(position)

}