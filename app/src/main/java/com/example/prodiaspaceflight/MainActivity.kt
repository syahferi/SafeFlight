package com.example.prodiaspaceflight

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.prodiaspaceflight.core.data.Resource
import com.example.prodiaspaceflight.home.HomeViewModel
import com.example.prodiaspaceflight.utils.collectFlow
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val homeViewModel: HomeViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        with (homeViewModel) {
            collectFlow(articlesFlow) {
                when (it) {
                    is Resource.Loading -> {
                        Log.d("data_test", it.toString())
                    }
                    is Resource.Success -> {
                        Log.d("data_test", it.data.toString())
                    }
                    is Resource.Error -> {
                        Log.d("data_test", it.toString())
                    }
                }
            }
        }
    }

    override fun onResume() {
        super.onResume()

        homeViewModel.getArticleList()
    }
}