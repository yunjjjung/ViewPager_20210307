package com.thejoeun.viewpager_20210307

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.thejoeun.viewpager_20210307.adapters.MainViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    lateinit var mvpa : MainViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }


    override fun setupEvents() {

    }

    override fun setValues() {

        mvpa = MainViewPagerAdapter(supportFragmentManager)

        mainViewPager.adapter = mvpa

    }


}