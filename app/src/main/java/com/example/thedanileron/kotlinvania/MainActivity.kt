package com.example.thedanileron.kotlinvania

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val TAG: String = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // U can call methods on numbers. Kotlin will convert them to Object automatically
        2.plus(71).plus(233).minus(13).div(30).plus(1)

        // Loop from 0 to 100 with step 7
        for (i in 0..100 step 7) {
            Log.i(TAG, "i : $i")
        }

        for (i in 'a'..'m') {
            Log.i(TAG, "i : $i")
        }

        for (i in 5 downTo 1) {
            Log.i(TAG, "i : $i")
        }

        val aquarium = arrayOf("tuna", "shark", "eel")

        // We can loop through index-element array
        for ((index, fish) in aquarium.withIndex()) {
            Log.i(TAG, "index : $index; fish(element): $fish")
        }
    }

}
