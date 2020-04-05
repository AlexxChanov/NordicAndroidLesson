package com.example.kotlinfragmentpractice
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_one.*

class fragment1 : Fragment() {

    private lateinit var savedView: View

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        if(!this::savedView.isInitialized){
            savedView=inflater.inflate(R.layout.fragment_one, container, false)
        }
        return savedView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        selectSupreme.setOnClickListener {
            selectionSupreme.visibility = View.VISIBLE

            


        }

        navToSecondFragment.setOnClickListener{
            fragmentManager?.beginTransaction()
                ?.replace(R.id.fragmentContainer,fragment2())
                ?.addToBackStack(null)
                ?.commit()
        }
    }
}

