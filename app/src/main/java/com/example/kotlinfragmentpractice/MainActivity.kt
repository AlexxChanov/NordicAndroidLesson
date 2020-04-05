package com.example.kotlinfragmentpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this,"hello",Toast.LENGTH_SHORT).show()
        //some comment

        val fragment1 = fragment1()
        //val fragment2 = fragment2()
//
//        val someData = Bundle()
//        someData.putString("key","SomeValue")
//        someData.putInt("IntKey",4)
//        fragment1.arguments=someData
//
//        fragment2.arguments = Bundle().also {
//            it.putString("key","CheKogo")
//            it.putInt("IntKey",33)
//        }
//

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer,fragment1 )
            .commit()

//        supreme.setOnClickListener{
//            supportFragmentManager.beginTransaction()
//                .replace(R.id.fragmentContainer, fragment1)
//                .commit()
//        }
//        new_balance.setOnClickListener{
//            supportFragmentManager.beginTransaction()
//                .replace(R.id.fragmentContainer, fragment2)
//                .commit()
//        }
    }
    }
