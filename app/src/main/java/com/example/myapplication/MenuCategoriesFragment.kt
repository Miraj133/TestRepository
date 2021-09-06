package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.myapplication.databinding.ActivitySwipesBinding
import com.google.android.material.tabs.TabLayoutMediator

class MenuCategoriesFragment: Fragment() {



    private lateinit var binding: ActivitySwipesBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = ActivitySwipesBinding.inflate(inflater, container,false)
        return binding.root
    }

    

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
      binding.vpMain.adapter = ViewPagerAdapter (this).apply {
          addFragment(AllFragment())
          addFragment(FastFoodFragment())
          addFragment(DessertsFragment())

      }
        val tabNames = listOf ("Всё",  "Фаст - фуд", "Десерты")
        binding.vpMain.isUserInputEnabled = false
        TabLayoutMediator(binding.tbMain, binding.vpMain){tab, position ->
            tab.text = tabNames[position]
        }.attach()

    }




}




