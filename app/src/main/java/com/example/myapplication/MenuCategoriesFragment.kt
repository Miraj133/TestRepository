package com.example.myapplication

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.myapplication.databinding.MenuCategoriesFragmentBinding


class MenuCategoriesFragment : Fragment() {

    private lateinit var binding: MenuCategoriesFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = MenuCategoriesFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        configureViewPager()

    }

    private fun configureViewPager() {
        binding.vpMain.adapter = ViewPagerAdapter(this).apply {
            addFragment(AllFragment())
            addFragment(FastFoodFragment())
            addFragment(DessertsFragment())
        }
        binding.bnvMain.setOnNavigationItemReselectedListener {
            when (it.itemId){
                R.id.menu -> {
                    binding.vpMain.currentItem=0
                }

                R.id.favorite -> {
                    binding.vpMain.currentItem=0
                }
            }

        }
    }


}




