package com.zaid.healthify.ui.homeScreen.dashboardScreen

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import com.google.android.material.tabs.TabLayoutMediator
import com.zaid.healthify.R
import com.zaid.healthify.databinding.FragmentDashboardBinding
import com.zaid.healthify.util.getFirstName
import com.zaid.healthify.util.setMarginTopForFullScreen
import com.zaid.healthify.util.viewBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collect

@AndroidEntryPoint
class DashboardFragment : Fragment(R.layout.fragment_dashboard) {

    private lateinit var dashboardPagerAdapter: DashboardPagerAdapter
    private val binding by viewBinding(FragmentDashboardBinding::bind)
    private val viewModel by viewModels<DashboardViewModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.headerText.setMarginTopForFullScreen()
        dashboardPagerAdapter = DashboardPagerAdapter(requireActivity())
        collectUserInfo()
        initViewPager()
    }

    @SuppressLint("SetTextI18n")
    private fun collectUserInfo() = lifecycleScope.launchWhenStarted {
        viewModel.user.collect {
            it?.let { user ->
                binding.headerText.text = "Hey ${user.username.getFirstName()} !"
            }
        }
    }

    private fun initViewPager() {
        binding.viewpager.adapter = dashboardPagerAdapter
        TabLayoutMediator(binding.tableLayout, binding.viewpager) { tab, position ->
            when (position) {
                0 -> {
                    tab.text = "Water"
                }
                1 -> {
                    tab.text = "Sleep"
                }
            }
        }.attach()
    }
}
