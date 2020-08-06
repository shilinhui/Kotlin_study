package com.example.kotlin_study.ui.fragment


import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup

import com.example.kotlin_study.R
import com.example.kotlin_study.base.BaseBindingFragment
import com.example.kotlin_study.databinding.FragmentHolderBinding

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 *关于
 */
class HolderFragment : BaseBindingFragment<FragmentHolderBinding>() {

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
        val text = "\"Kotlin\\n\""
            .plus("Dagger 2\n")
            .plus("Retrofit 2\n")
            .plus("OkHttp 3\n")
            .plus("DataBinding\n")
            .plus("DeepLinkDispatch\n")
            .plus("Gson\n")
            .plus("Glide")
        mBinding?.imgAvatar?.setImageResource(R.mipmap.ic_launcher_round)
        mBinding.tvThank.text = "Kotlin学习 参照"
        mBinding.tvGitAddress.text = "https://github.com/githubwing/GankClient-Kotlin"
        mBinding.tvSummary.text = text
    }

}
