package com.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //starting the setListener function
        setListeners()
    }

    private fun setListeners(){
        //find all the views and put them in variables
        val boxOneText = findViewById<TextView>(R.id.box_one_text)
        val boxTwoText = findViewById<TextView>(R.id.box_two_text)
        val boxThreeText = findViewById<TextView>(R.id.box_three_text)
        val boxFourText = findViewById<TextView>(R.id.box_four_text)
        val boxFiveText = findViewById<TextView>(R.id.box_five_text)
        //find the root layout
        val rootConstraintLayout = findViewById<View>(R.id.constraint_layout)
        //create a list of all the views
        val clickableViews: List<View> = listOf(boxOneText,boxTwoText,boxThreeText,boxFourText,boxFiveText,rootConstraintLayout)
        //set the click listeners
        for (item in clickableViews){
            item.setOnClickListener{
                makeColored(it)
            }
        }
    }

    private fun makeColored(view: View){
        when(view.id){
            //boxes using color class for using the colors
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)
            R.id.box_three_text -> view.setBackgroundColor(Color.BLUE)
            R.id.box_four_text -> view.setBackgroundColor(Color.MAGENTA)
            R.id.box_five_text -> view.setBackgroundColor(Color.BLUE)
            //if the view doesn't match with any of the views then it must be background screen user has clicked on
            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}