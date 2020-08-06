package com.example.kotlin_study.ui.fragment


import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup

import com.example.kotlin_study.base.BaseBindingFragment
import com.example.kotlin_study.databinding.FragmentIoBinding

/**
 * IOS
 */
class IOSFragment : BaseBindingFragment<FragmentIoBinding>() {

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
