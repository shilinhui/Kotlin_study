package com.example.kotlin_study.ui.fragment


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.kotlin_study.R
import com.example.kotlin_study.base.BaseBingingFragment
import com.example.kotlin_study.databinding.FragmentHolderBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class HolderFragment : BaseBingingFragment<FragmentHolderBinding>() {

    companion object {
        val HOLDER = "HOLDER"
        fun newInstance(): HolderFragment{
            val fragment = HolderFragment()
            val bundle = Bundle()
            fragment.arguments = bundle
            return fragment
        }

    }

    override fun crateDataBinding(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): FragmentHolderBinding {
        return FragmentHolderBinding.inflate(inflater, container,false)
    }

    override fun initView() {
    }

}
