package com.example.thedanileron.kotlinvania

import android.app.Service
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.IBinder
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    private val TAG: String = "MainActivity"
    val lambdaDiv = { x: Int, div: Int -> Log.i(TAG, "x/div : ${x / div}") }

    // OnCreate returns Unit which means "no value"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        for (i in 1..10)
            Log.i(TAG, dayToString(Random().nextInt(8)))


        Log.i(TAG, "No value:${dayToString()}")
        var shouldGo = shouldGoOut("Sunday", isRaining = false, temperature = 3)

        val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper")
        val currys = spices.filter { it.contains("curry") }.sortedBy { it.length }.take(2)
        Log.i(TAG, "currys: $currys")
        lambdaDiv(10, 5)
    }

    // In Kotlin you can specify a default value of function variable
    fun dayToString(day: Int = 1): String {
        return when (day) {
            1 -> "Monday"
            2 -> "Tuesday"
            3 -> "Wednesday"
            4 -> "Thursday"
            5 -> "Friday"
            6 -> "Saturday"
            7 -> "Sunday"
            else -> "Undefined"
        }
    }

    fun shouldGoOut(day: String, temperature: Int = 15, isRaining: Boolean): Boolean {
        return (day == "Sunday" || day == "Saturday") && !isRaining && !isTooCold(temperature)
    }

    // Kotlin one line function( function with single expression)
    fun isTooCold(temperature: Int) = temperature < 5


}
