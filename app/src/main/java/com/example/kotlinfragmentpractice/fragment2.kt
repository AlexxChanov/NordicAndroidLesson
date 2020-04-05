package com.example.kotlinfragmentpractice


import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import kotlinx.android.synthetic.main.fragment_two.*
import kotlin.time.times
import kotlin.time.toDuration

class fragment2 : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_two, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        selectButton2.setOnClickListener{
            selectNB.visibility = View.VISIBLE
        }

        navToFirstFragment.setOnClickListener{
            fragmentManager?.beginTransaction()
                ?.replace(R.id.fragmentContainer,fragment1())
                ?.addToBackStack(null)
                ?.commit()
        }
    }

    override fun onStop() {
        super.onStop()
        Log.i("Third fragment", "Has been stopped")
    }
}