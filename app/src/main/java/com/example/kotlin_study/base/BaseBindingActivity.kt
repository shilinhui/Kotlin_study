package com.example.kotlin_study.base

import android.annotation.TargetApi
import android.databinding.ViewDataBinding
import android.os.Build
import android.os.Bundle
import android.os.PersistableBundle
import android.support.annotation.RequiresApi
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.MenuItem
import com.example.kotlin_study.R

abstract class BaseBindingActivity<B : ViewDataBinding> : AppCompatActivity() {
    lateinit var mBinding: B
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = createDataBinding(savedInstanceState)
        initView()
    }

    abstract fun createDataBinding(savedInstanceState: Bundle?): B

    abstract fun initView()

    fun setupToolbar(toolbar: Toolbar){
        toolbar.title = ""
        toolbar.setNavigationIcon(R.drawable.icon_back)
        setSupportActionBar(toolbar)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item!!.itemId) {
            android.R.id.home -> onBackPressed()
        }
        return super.onOptionsItemSelected(item)
    }
}