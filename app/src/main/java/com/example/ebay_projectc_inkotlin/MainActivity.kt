package com.example.ebay_projectc_inkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import com.example.ebay_projectc_inkotlin.adapter.FavoriteAdapter
import com.example.ebay_projectc_inkotlin.model.Favorite

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    fun initViews() {
        recyclerView = findViewById(R.id.recyclerView)
        val manager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        recyclerView.layoutManager = manager

        refreshAdapter(getFavourites())
    }

    fun refreshAdapter(items:ArrayList<Favorite>) {
        val adapter = FavoriteAdapter(this,items)
        recyclerView!!.adapter = adapter
    }

    fun getFavourites(): ArrayList<Favorite> {
        val items: ArrayList<Favorite> = ArrayList()
        items.add(Favorite("AppleWatch",R.drawable.product1))
        items.add(Favorite("AppleWatch",R.drawable.product2))
        items.add(Favorite("AppleWatch",R.drawable.product3))
        items.add(Favorite("AppleWatch",R.drawable.product4))
        items.add(Favorite("AppleWatch",R.drawable.product5))
        items.add(Favorite("AppleWatch",R.drawable.product6))
        items.add(Favorite("AppleWatch",R.drawable.product7))
        items.add(Favorite("AppleWatch",R.drawable.product8))
        items.add(Favorite("AppleWatch",R.drawable.product1))
        items.add(Favorite("AppleWatch",R.drawable.product4))
        items.add(Favorite("AppleWatch",R.drawable.product7))

        return items
    }
}