package com.example.kotlin_study.base

import android.databinding.ViewDataBinding
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

abstract class BaseBingingFragment<B : ViewDataBinding> : Fragment() {
    lateinit var mBinding : B
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        mBinding = crateDataBinding(inflater, container, savedInstanceState)
        initView()
        return mBinding.root
    }

    abstract fun crateDataBinding(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): B

    abstract fun initView()
}