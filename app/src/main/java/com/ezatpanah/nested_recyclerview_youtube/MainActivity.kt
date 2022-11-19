package com.ezatpanah.nested_recyclerview_youtube

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ezatpanah.nested_recyclerview_youtube.adapter.MainAdapter
import com.ezatpanah.nested_recyclerview_youtube.databinding.ActivityMainBinding
import com.ezatpanah.nested_recyclerview_youtube.utils.SampleData

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            rvMain.adapter=MainAdapter(SampleData.collections)
        }

    }
}