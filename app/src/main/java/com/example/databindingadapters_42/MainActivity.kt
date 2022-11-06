package com.example.databindingadapters_42

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.databindingadapters_42.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val data = DataModel(
            "Camarederic",
            "Android Developer",
            "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.memuplay." +
                    "com%2Fhow-to-use-com.vicman.newprofilepic-on-pc.html&psig" +
                    "=AOvVaw3ZpfJ0N6Ne7ql3anZGB_F-&ust=1667835347199000&source" +
                    "=images&cd=vfe&ved=0CA0QjRxqFwoTCMDGoP3wmfsCFQAAAAAdAAAAABAN",
            12
        )

        binding.dataModel = data
    }
}