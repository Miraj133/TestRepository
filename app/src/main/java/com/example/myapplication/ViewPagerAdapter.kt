package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(activity: AppCompatActivity): FragmentStateAdapter(activity){
    private val fragments: MutableList<Fragment> = mutableListOf()

    fun addFragment(fragment: Fragment){
        fragments.add(fragment)
    }

    override fun getItemCount(): Int {
        return fragments.size //возвращается размер фрагмента
    }

    override fun createFragment(position: Int): Fragment {
       return fragments[position] //возвращаетстся тот или иной фрагмент
    }
}