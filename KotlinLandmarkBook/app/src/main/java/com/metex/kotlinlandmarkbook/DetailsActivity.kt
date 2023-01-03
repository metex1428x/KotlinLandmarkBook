package com.metex.kotlinlandmarkbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.metex.kotlinlandmarkbook.databinding.ActivityDetailsBinding

class DetailsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val intent = intent

        val selectLandmarkList =intent.getSerializableExtra("landmark") as Landmark

        binding.nameText.text=selectLandmarkList.name
        binding.countryText.text= selectLandmarkList.country
        binding.imageView.setImageResource(selectLandmarkList.image)

    }
}