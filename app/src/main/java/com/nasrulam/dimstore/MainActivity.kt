package com.nasrulam.dimstore

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.wanita)

        val mFragmentOne = HomeFragment()
        val fragment = supportFragmentManager.findFragmentByTag(HomeFragment::class.java.simpleName)

        if (fragment !is HomeFragment) {
            supportFragmentManager.beginTransaction()
                .add(R.id.nav_host_fragment, mFragmentOne, HomeFragment::class.java.simpleName)
                .commit()
        }
    }
}