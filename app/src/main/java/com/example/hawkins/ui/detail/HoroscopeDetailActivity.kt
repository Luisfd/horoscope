package com.example.hawkins.ui.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.core.view.isVisible
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.navigation.navArgs
import com.example.hawkins.R
import com.example.hawkins.databinding.ActivityHoroscopeDetailBinding
import com.example.hawkins.databinding.ActivityMainBinding
import com.example.hawkins.databinding.FragmentPalmistryBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class HoroscopeDetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHoroscopeDetailBinding
    private val horoscopeDetailViewModel:HoroscopeDetailViewModel by viewModels()

    private val args:HoroscopeDetailActivityArgs by navArgs()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHoroscopeDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initUI()
        args.type
    }

    private fun initUI() {
        initUIState()
    }



    private fun initUIState() {
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                horoscopeDetailViewModel.state.collect {
                    when(it){
                        HoroscopeDetailState.Loading -> loadingState()
                        is HoroscopeDetailState.Error -> errorStateTODO()
                        is HoroscopeDetailState.Success -> successState()
                    }                    }
                }
        }
    }

    private fun loadingState() {
        binding.pb.isVisible = true
    }

    private fun errorStateTODO() {
        TODO("Not yet implemented")
    }

    private fun successState() {
        TODO("Not yet implemented")
    }
}