package com.mbialowas.mobiledev_demonstration_2025

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeActivity : AppCompatActivity() {
    lateinit var bottomNav: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        bottomNav = findViewById(R.id.bottom_nav)

        bottomNav.setOnItemSelectedListener {menuItem ->
            when (menuItem.itemId) {
                R.id.nav_home ->  replaceFragment(HomeFragment())
                R.id.nav_search ->  replaceFragment(SearchFragment())
                R.id.nav_profile ->  replaceFragment(ProfileFragment())
            }
            true
        }
    }
    /*
        Purpose: replaces the current fragment with a new fragment
        args: fragment: Fragment
        returns: void
     */
    private fun replaceFragment(fragment: Fragment) {
        Log.i("mjb", "fragment method being called")
        supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer, fragment).commit()
    }
}