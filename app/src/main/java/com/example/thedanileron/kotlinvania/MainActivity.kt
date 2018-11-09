package com.example.thedanileron.kotlinvania

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.HashMap
import kotlin.collections.HashSet

class MainActivity : AppCompatActivity() {

    // val creates constant
    private val TAG = "MainActivity"
    // var creates variable
    private var mResult: Double = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var scale = 1.14
        var width = 5
        var height = 4

        mResult = (width * height * scale)
        Log.i(TAG, "x * y = $mResult; Scale is positive : " + (scale >= 1))

        // Arrays
        val arr = arrayOfNulls<Int>(10)
        arr[1] = 1
        arr[2] = 5
        val intArr = intArrayOf(1, 2, 3, 4, 5)
        val doubleArr = doubleArrayOf(1.1, 1.2, 1.3, 1.4)

        Log.i(TAG, "Array of nulls ${Arrays.toString(arr)}; first value is: ${arr[0]}")
        Log.i(TAG, "Array of int ${Arrays.toString(intArr)}; first value is: ${intArr[0]}")
        Log.i(TAG, "Array of double ${Arrays.toString(doubleArr)}; first value is: ${doubleArr[0]}")

        // List
        val bestGroupsList = ArrayList<String>()
        bestGroupsList.add("Les Friction")
        bestGroupsList.add("Disturbed")
        bestGroupsList.add("Birthday Massacre")

        Log.i(TAG, "bestGroups : $bestGroupsList")

        //Set
        val tagsSet = HashSet<String>()
        tagsSet.add("Google")
        tagsSet.add("Kotlin")
        tagsSet.add("Java")
        tagsSet.add("Android")
        tagsSet.add("Android")
        tagsSet.add("Web")
        tagsSet.add("U cant do it")
        tagsSet.add("If not u can learn it")

        Log.i(TAG, "tagsSet : $tagsSet")

        // Map
        val groupsRatings = HashMap<String, Double>()
        groupsRatings["Les Friction"] = 9.81
        groupsRatings["In This Moment"] = 9.1
        groupsRatings["Disturbed"] = 9.9
        groupsRatings["Siberian Beast"] = 9.6
        groupsRatings["Some random group"] = 6.8
        groupsRatings["Slipknot"] = 7.7

        Log.i(TAG, "groupsRatings : $groupsRatings")
        groupsRatings.forEach {
            if ((it.value + 1) > 10) {
                groupsRatings[it.key] = 10.0
            } else {
                groupsRatings[it.key] = it.value + 1
            }
        }
        Log.i(TAG, "groupsRatings after: $groupsRatings")

        val day = 1
        var dayString: String
        dayString = when (day) {
            1 -> "Monday"
            2 -> "Tuesday"
            3 -> "Wednesday"
            4 -> "Chetverg"
            5 -> "Friday"
            6 -> "Saturday"
            7 -> "Sunday"
            else -> "There is no such day"
        }
        Log.i(TAG, "dayString : $dayString")


        val randomIntMatrix = arrayOfNulls<IntArray>(100)
        val randomIntGenerator = Random()
        for (i in randomIntMatrix.indices) {
            randomIntMatrix[i] = intArrayOf(randomIntGenerator.nextInt(2), randomIntGenerator.nextInt(2),
                    randomIntGenerator.nextInt(2), randomIntGenerator.nextInt(2), randomIntGenerator.nextInt(2))
        }

        for (randomIntArr in randomIntMatrix) {
            Log.i(TAG, Arrays.toString(randomIntArr))
        }


    }
}
