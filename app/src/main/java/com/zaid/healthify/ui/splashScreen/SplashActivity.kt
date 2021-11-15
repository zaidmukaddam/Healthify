package com.zaid.healthify.ui.splashScreen

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.zaid.healthify.util.makeStatusBarTransparent
import com.zaid.healthify.R
import com.zaid.healthify.databinding.ActivitySplashBinding
import com.zaid.healthify.ui.auth.AuthActivity
import com.zaid.healthify.ui.homeScreen.MainActivity
import com.zaid.healthify.ui.onBoarding.OnBoardingActivity
import com.zaid.healthify.ui.splashScreen.SplashScreenEvents.*
import com.zaid.healthify.ui.userDetailsInput.UserDetailsActivity
import com.zaid.healthify.util.viewBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collect

@SuppressLint("CustomSplashScreen")
@AndroidEntryPoint
class SplashActivity : AppCompatActivity() {

    companion object {
        private const val SPLASH_SCREEN_DURATION = 2000L
    }

    private val viewModel by viewModels<SplashViewModel>()
    private val binding by viewBinding(ActivitySplashBinding::inflate)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        makeStatusBarTransparent()
        collectUiEvents()
        animateLogo()
        Handler().postDelayed({
            viewModel.onTimerComplete()
        }, SPLASH_SCREEN_DURATION)
    }

    private fun animateLogo() {
        val animation = AnimationUtils.loadAnimation(this, R.anim.scale_logo)
        binding.logo.apply {
            startAnimation(animation)
        }
    }

    private fun collectUiEvents() = lifecycleScope.launchWhenStarted {
        viewModel.events.collect {
            when (it) {
                NavigateToHomeScreen -> navigateToHomeScreen()
                NavigateToLoginScreen -> navigateToLoginScreen()
                NavigateToOnBoarding -> navigateToOnBoardingScreen()
                NavigateToUserDetailsScreen -> navigateToUserDetailsScreen()
            }
        }
    }

    private fun navigateToHomeScreen() {
        Intent(this, MainActivity::class.java).also {
            startActivity(it)
            finish()
        }
    }

    private fun navigateToLoginScreen() {
        Intent(this, AuthActivity::class.java).also {
            startActivity(it)
            finish()
        }
    }

    private fun navigateToOnBoardingScreen() {
        Intent(this, OnBoardingActivity::class.java).also {
            startActivity(it)
            finish()
        }
    }

    private fun navigateToUserDetailsScreen() {
        Intent(this, UserDetailsActivity::class.java).also {
            startActivity(it)
            finish()
        }
    }
}
