package com.khusinov.viewpager2example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.khusinov.viewpager2example.adapters.ViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

lateinit var list: List<String>
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        view_pager_2.adapter = ViewPagerAdapter()


    }
}