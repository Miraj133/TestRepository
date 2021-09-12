package com.example.myapplication

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(fragment: MenuCategoriesFragment) : FragmentStateAdapter(fragment) {
    private val fragments: MutableList<Fragment> = mutableListOf()

    fun addFragment(fragment: Fragment) {
        fragments.add(fragment)
    }

    override fun getItemCount(): Int {
        return fragments.size //возвращается размер фрагмента
    }

    override fun createFragment(position: Int): Fragment {
        return fragments[position] //возвращаетстся тот или иной фрагмент
    }
}