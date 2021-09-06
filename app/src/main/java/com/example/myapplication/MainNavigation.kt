package com.example.myapplication

interface MainNavigation {
   fun openAuthFragment()
   fun openOrderFragment(etPhone: String)
   fun openDish()
   fun openMenuCategoriesFragment()
}