package com.example.kotlin_study.ui.fragment


import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup

import com.example.kotlin_study.base.BaseBindingFragment
import com.example.kotlin_study.databinding.FragmentGirlBinding

/**
 * 妹子
 */
class GirlFragment : BaseBindingFragment<FragmentGirlBinding>() {

    companion object {
        val GIRL = "GIRL"
        fun newInstance(): GirlFragment{
            val fragment = GirlFragment()
            val bundle = Bundle()
            fragment.arguments = bundle
            return fragment
        }
    }
    override fun crateDataBinding(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): FragmentGirlBinding {
        return FragmentGirlBinding.inflate(inflater, container, false)
    }

    override fun initView() {
    }


}
