package com.example.schulerquiz

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class ScoreFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_score, container, false)
        val buttonMenu = view.findViewById<Button>(R.id.btnMenu)

        buttonMenu.setOnClickListener {
            findNavController().navigate(R.id.homeFragment)
        }

        return view
    }
}