package com.example.map_app

import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.example.map_app.databinding.ActivityMainBinding

class MainActivity : FragmentActivity() {

    private val tabTitle: Array<String> = arrayOf(
        "Рестораны",
        "Фитнес центры",
        "Кинотеатры",
    )
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val pager = binding.viewPager2
        val tb = binding.tabLayout
        pager.adapter = MainAdapter(supportFragmentManager, lifecycle)

        TabLayoutMediator(tb, pager) { tab, position ->
            tab.text = tabTitle[position]
        }.attach()
    }
}
