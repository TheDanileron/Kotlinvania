package com.example.thedanileron.kotlinvania

import java.util.*

class ButtonPressHistory(var capacity: Int) {
    // There is no static fields in Kotlin
    // Fortunately, Kotlin object can handle this. If you declare a companion object inside your class, you'll be
    // able to call its members with the same syntax as calling static
    // methods in Java/C#, using only the class name as a qualifier.
    companion object {
        val historyMap = TreeMap<Int, String>()
    }

    val mHistoryMap = TreeMap<Int, String>()
    var mCapacity: Int = capacity

    fun insertEntry(entry: String) {
        if (mHistoryMap.size >= capacity) {
            mHistoryMap.remove(mHistoryMap.firstKey())
        }
        var mapSize = mHistoryMap.size
        mHistoryMap[++mapSize] = entry
    }


}
