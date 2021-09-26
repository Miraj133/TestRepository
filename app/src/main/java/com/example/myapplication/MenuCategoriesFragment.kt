package com.example.myapplication

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.myapplication.databinding.MenuCategoriesFragmentBinding
import com.google.android.material.tabs.TabLayoutMediator


class MenuCategoriesFragment : Fragment() {

    private lateinit var binding: MenuCategoriesFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = MenuCategoriesFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        configureMenuViewPager()
        configureFavoriteViewPager()
        generateMenuPagesListAndConnectWithViewPager()
        generateFavoritePagesListAndConnectWithViewPager()

        binding.bnvMain.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.menu -> {
                    binding.vpMenu.currentItem =0
                    binding.vpMenu.visibility = View.VISIBLE
                    binding.vpFavorite.visibility = View.GONE
                    Log.d("lesson19", "срабоало меню")
                    true
                }

                R.id.favorite -> {
                    binding.vpFavorite.currentItem = 0
                    binding.vpFavorite.visibility = View.VISIBLE
                    binding.vpMenu.visibility = View.GONE
                    Log.d("lesson19", "сработало избранное")
                    true
                }
                else -> true
            }
        }
    }

    private fun configureMenuViewPager() {
        binding.vpMenu.adapter = ViewPagerAdapter(this).apply {
            addFragment(AllFragment())
            addFragment(FastFoodFragment())
            addFragment(DessertsFragment())
        }
        binding.vpMenu.isUserInputEnabled = false
    }

    private fun configureFavoriteViewPager() {
        binding.vpFavorite.adapter = ViewPagerAdapter(this).apply {
            addFragment(AllFragment())
            addFragment(FastFoodFragment())
            addFragment(DessertsFragment())
        }
        binding.vpFavorite.isUserInputEnabled = false
    }

    private fun generateMenuPagesListAndConnectWithViewPager() {
        val tabNamesMenu = generateMenuList()
        TabLayoutMediator(binding.tbMain, binding.vpMenu) { tab, position ->
            tab.text = tabNamesMenu[position]
        }.attach()
    }

    private fun generateFavoritePagesListAndConnectWithViewPager() {
        val tabNamesFavorite = generateMenuList()
        TabLayoutMediator(binding.tbMain, binding.vpFavorite) { tab, position ->
            tab.text = tabNamesFavorite[position]
        }.attach()
    }

    private fun generateMenuList(): List<String> {
        return listOf("Всё", "Фаст - фуд", "Десерты")
    }

}






