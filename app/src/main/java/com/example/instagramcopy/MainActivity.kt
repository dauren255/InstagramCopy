package com.example.instagramcopy

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupViews()
        setNavigationBar()
    }

    private fun setupViews() {
        val recyclerView = findViewById<RecyclerView>(R.id.home_recycler_view)
        recyclerView.setHasFixedSize(true)
        val layoutManager = LinearLayoutManager(applicationContext)
        layoutManager.reverseLayout = true
        layoutManager.stackFromEnd = true
        recyclerView.layoutManager = layoutManager

        val arrs = mutableListOf(
            Post("timur.tleu",R.drawable.post_author,R.drawable.post, 809, "Поделись, какой факт запомнился?)", 48)
        )
        recyclerView.adapter = PostAdapter(applicationContext, arrs)
    }

    private fun setNavigationBar() {
        val bottomNavigationView: BottomNavigationView = findViewById(R.id.bottom_navigation_bar)
        bottomNavigationView.setSelectedItemId(R.id.home)

        bottomNavigationView.setOnNavigationItemSelectedListener(BottomNavigationView.OnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.home -> return@OnNavigationItemSelectedListener true

                R.id.search -> {
                    startActivity(Intent(applicationContext, SearchActivity::class.java))
                    overridePendingTransition(0, 0)
                    return@OnNavigationItemSelectedListener true
                }
            }
            false
        })
    }
}

