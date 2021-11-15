package com.zaid.healthify.ui.auth

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.findNavController
import com.zaid.healthify.util.makeStatusBarTransparent
import com.zaid.healthify.R
import com.zaid.healthify.databinding.ActivityAuthBinding
import com.zaid.healthify.util.viewBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AuthActivity : AppCompatActivity() {

    private val binding by viewBinding(ActivityAuthBinding::inflate)
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        navController = findNavController(R.id.fragmentContainerView)
        makeStatusBarTransparent()
    }
}
