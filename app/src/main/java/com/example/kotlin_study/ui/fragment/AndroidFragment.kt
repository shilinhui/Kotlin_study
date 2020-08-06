package com.example.kotlin_study.ui.fragment


import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup

import com.example.kotlin_study.base.BaseBindingFragment
import com.example.kotlin_study.databinding.FragmentAndroidBinding

/**
 * Android
 */
class AndroidFragment : BaseBindingFragment<FragmentAndroidBinding>() {

    companion object {
        val ANDROID = "ANDROID"
        fun newInstance(): AndroidFragment{
            val fragment = AndroidFragment()
            val bundle = Bundle()
            fragment.arguments = bundle
            return fragment
        }
    }

    override fun crateDataBinding(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): FragmentAndroidBinding {
        return FragmentAndroidBinding.inflate(inflater, container, false)
    }

    override fun initView() {

    }

}
