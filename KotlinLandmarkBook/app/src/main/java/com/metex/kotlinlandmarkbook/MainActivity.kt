package com.metex.kotlinlandmarkbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.metex.kotlinlandmarkbook.databinding.ActivityDetailsBinding
import com.metex.kotlinlandmarkbook.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var landmarList: ArrayList<Landmark>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        landmarList = ArrayList<Landmark>()

        val kizKulesi= Landmark("Maiden's Tower","Istanbul",R.drawable.istanbul)
        val eiffel = Landmark("Eiffel","Paris",R.drawable.paris)
        val brandenburg = Landmark("brandenburg Gate","Berlin",R.drawable.berlin)
        val redSquare = Landmark("Red Square","Moscow",R.drawable.moscow)
        val tower = Landmark("Tower Bridge","London",R.drawable.london)

        landmarList.add(kizKulesi)
        landmarList.add(eiffel)
        landmarList.add(brandenburg)
        landmarList.add(redSquare)
        landmarList.add(tower)

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        val landmarkAdapter = LandmarkAdapter(landmarList)
        binding.recyclerView.adapter= landmarkAdapter



    }
}