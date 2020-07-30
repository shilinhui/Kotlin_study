package com.example.kotlin_study.ui.fragment


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.kotlin_study.R
import com.example.kotlin_study.base.BaseBingingFragment
import com.example.kotlin_study.databinding.FragmentIoBinding

/**
 * IOS
 */
class IOSFragment : BaseBingingFragment<FragmentIoBinding>() {

    companion object {
        val IOS = "IOS"
        fun newInstance(): IOSFragment{
            val fragment = IOSFragment()
            val bundle = Bundle()
            fragment.arguments = bundle
            return fragment
        }

    }
    override fun crateDataBinding(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): FragmentIoBinding {
        return FragmentIoBinding.inflate(inflater, container, false)
    }

    override fun initView() {
    }

}
