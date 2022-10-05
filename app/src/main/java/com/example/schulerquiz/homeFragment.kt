package com.example.schulerquiz

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import kotlin.system.exitProcess

class HomeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_home, container, false)
        val buttonScore = view.findViewById<Button>(R.id.btnScore)
        val buttonExit = view.findViewById<Button>(R.id.btnExit)
        val buttonPlay = view.findViewById<Button>(R.id.btnPlay)

        buttonPlay.setOnClickListener {
            findNavController().navigate(R.id.dataFragment)
        }

        buttonScore.setOnClickListener {
            findNavController().navigate(R.id.scoreFragment)
        }

        buttonExit.setOnClickListener {
            exitProcess(0);
        }

        return view
    }
}