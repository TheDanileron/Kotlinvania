package com.example.thedanileron.kotlinvania

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    // val creates constant
    private val TAG = "MainActivity"
    private val mButtonPressHistory: ButtonPressHistory = ButtonPressHistory(100)
    // ? mark means the value can be null
    private val currentDay: Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun dayToString(day: Int): String {
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

    public fun btnOnClick(view: View) {
        when (view.id) {
            R.id.btn -> {
                when (textView.text) {
                    "You pressed me" -> textView.text = "And again"
                    "And again" -> textView.text = "You love it don't ya?"
                    else -> textView.text = "You pressed me"
                }
                mButtonPressHistory.insertEntry(textView.text as String)
            }
            R.id.btnLogHistory -> {
                Log.i(TAG, mButtonPressHistory.mHistoryMap.toString())
            }
        }
    }

}
