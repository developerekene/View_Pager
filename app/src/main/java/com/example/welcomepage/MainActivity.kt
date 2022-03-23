package com.example.welcomepage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.viewpager2.widget.ViewPager2
import me.relex.circleindicator.CircleIndicator3

class MainActivity : AppCompatActivity() {

    private var titleList = mutableListOf<String>()
    private var desclist = mutableListOf<String>()
    private var imageList = mutableListOf<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        postToList()
        var view_pager_2 = findViewById<ViewPager2>(R.id.view_pager_2)



        view_pager_2.adapter = ViewPagerAdapter(titleList, desclist, imageList)
        val indicator: CircleIndicator3 = findViewById(R.id.CircleIndicator3)
        indicator.setViewPager(view_pager_2)
    }

    private fun addToList(title: String, description: String, image: Int){

        titleList.add(title)
        desclist.add(description)
        imageList.add(image)
    }

    private fun postToList(){
        for(i: Int in 1..5){
            addToList("Title $i", "Description $i", R.drawable.tttimage1)
        }
    }
}