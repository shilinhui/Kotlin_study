package com.example.kotlin_study.ui

import android.databinding.DataBindingUtil
import android.databinding.DataBindingUtil.setContentView
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentPagerAdapter
import android.util.Log
import android.widget.Toast
import com.example.kotlin_study.R
import com.example.kotlin_study.base.BaseBindingActivity
import com.example.kotlin_study.databinding.ActivityMainBinding
import com.example.kotlin_study.toast
import com.example.kotlin_study.ui.fragment.AndroidFragment
import com.example.kotlin_study.ui.fragment.GirlFragment
import com.example.kotlin_study.ui.fragment.HolderFragment
import com.example.kotlin_study.ui.fragment.IOSFragment
import kotlinx.android.synthetic.main.activity_main.*

/**
 * git 提交测试指定文件
 */
class MainActivity : BaseBindingActivity<ActivityMainBinding>() {

    lateinit var mFragments: MutableList<Fragment>
    override fun createDataBinding(savedInstanceState: Bundle?): ActivityMainBinding {
        return DataBindingUtil.setContentView(this,R.layout.activity_main)
    }

    override fun initView() {
        initFragments()
        viewPager.adapter = object : FragmentPagerAdapter(supportFragmentManager){
            override fun getItem(p0: Int): Fragment = mFragments[p0]
            override fun getCount(): Int = mFragments.size
        }
        viewPager.offscreenPageLimit = 4

        navigationView.setOnNavigationItemSelectedListener{ item ->
            var tab = 0
            when(item.itemId){
                R.id.menu_android -> tab = 0
                R.id.menu_ios -> tab = 1
                R.id.menu_girl -> tab = 2
                R.id.menu_about -> tab = 3
            }
            viewPager.currentItem = tab
            true
        }

        floatingButton.setOnClickListener{
            toast("点击了")
        }
    }

    private fun initFragments() {
        mFragments = ArrayList()
        mFragments.add(AndroidFragment.newInstance())
        mFragments.add(IOSFragment.newInstance())
        mFragments.add(GirlFragment.newInstance())
        mFragments.add(HolderFragment.newInstance())
    }
}
