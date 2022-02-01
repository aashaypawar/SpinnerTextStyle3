package org.geeksforgeeks.spinnertextstyle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mSpinner = findViewById<Spinner>(R.id.spinner_1)

        val mList = arrayOf<String?>("Delhi", "Mumbai", "Chennai", "Kolkata", "Bengaluru")

        val mArrayAdapter = ArrayAdapter<Any?>(this, R.layout.spinner_list, mList)
        mArrayAdapter.setDropDownViewResource(R.layout.spinner_list)

        mSpinner.adapter = mArrayAdapter

    }
}