package com.example.instagramcopy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.google.android.material.bottomnavigation.BottomNavigationView

class SearchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)
        setNavigationBar()
        setupViews()
    }

    private fun setupViews() {
        val recyclerViewForSearch = findViewById<RecyclerView>(R.id.search_recycler_view)
        recyclerViewForSearch.setHasFixedSize(true)
        val layoutManager = LinearLayoutManager(applicationContext, LinearLayoutManager.HORIZONTAL, true)
        layoutManager.stackFromEnd = true
        recyclerViewForSearch.layoutManager = layoutManager
        val arrs = mutableListOf(
            "IGTV",
            "Shop",
            "Market",
            "Football",
            "Anime",
            "Series",
            "Travel"
        )
        recyclerViewForSearch.adapter = SearchAdapter(applicationContext, arrs)

        val recyclerViewForSearchPost = findViewById<RecyclerView>(R.id.search_posts_recycler_view)
        recyclerViewForSearchPost.layoutManager = StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL)

        val searchPosts = mutableListOf(
            Post("timur.tleu",R.drawable.ic_launcher_background, R.drawable.ic_launcher_background, 809, "Поделись, какой факт запомнился?)", 48),
            Post("timur.tleu",R.drawable.ic_launcher_background, R.drawable.ic_launcher_background, 809, "Поделись, какой факт запомнился?)", 48),
            Post("timur.tleu",R.drawable.ic_launcher_background, R.drawable.ic_launcher_background, 809, "Поделись, какой факт запомнился?)", 48),
            Post("timur.tleu",R.drawable.ic_launcher_background, R.drawable.ic_launcher_background, 809, "Поделись, какой факт запомнился?)", 48),
            Post("timur.tleu",R.drawable.ic_launcher_background, R.drawable.ic_launcher_background, 809, "Поделись, какой факт запомнился?)", 48),
            Post("timur.tleu",R.drawable.ic_launcher_background, R.drawable.ic_launcher_background, 809, "Поделись, какой факт запомнился?)", 48),
            Post("timur.tleu",R.drawable.ic_launcher_background, R.drawable.ic_launcher_background, 809, "Поделись, какой факт запомнился?)", 48),
            Post("timur.tleu",R.drawable.ic_launcher_background, R.drawable.ic_launcher_background, 809, "Поделись, какой факт запомнился?)", 48),
            Post("timur.tleu",R.drawable.ic_launcher_background, R.drawable.ic_launcher_background, 809, "Поделись, какой факт запомнился?)", 48),
            Post("timur.tleu",R.drawable.ic_launcher_background, R.drawable.ic_launcher_background, 809, "Поделись, какой факт запомнился?)", 48),
            Post("timur.tleu",R.drawable.ic_launcher_background, R.drawable.ic_launcher_background, 809, "Поделись, какой факт запомнился?)", 48),
            Post("timur.tleu",R.drawable.ic_launcher_background, R.drawable.ic_launcher_background, 809, "Поделись, какой факт запомнился?)", 48),
            Post("timur.tleu",R.drawable.ic_launcher_background, R.drawable.ic_launcher_background, 809, "Поделись, какой факт запомнился?)", 48),
            Post("timur.tleu",R.drawable.ic_launcher_background, R.drawable.ic_launcher_background, 809, "Поделись, какой факт запомнился?)", 48),
            Post("timur.tleu",R.drawable.ic_launcher_background, R.drawable.ic_launcher_background, 809, "Поделись, какой факт запомнился?)", 48),
            Post("timur.tleu",R.drawable.ic_launcher_background, R.drawable.ic_launcher_background, 809, "Поделись, какой факт запомнился?)", 48),
            Post("timur.tleu",R.drawable.ic_launcher_background, R.drawable.ic_launcher_background, 809, "Поделись, какой факт запомнился?)", 48),
            Post("timur.tleu",R.drawable.ic_launcher_background, R.drawable.ic_launcher_background, 809, "Поделись, какой факт запомнился?)", 48),
            Post("timur.tleu",R.drawable.ic_launcher_background, R.drawable.ic_launcher_background, 809, "Поделись, какой факт запомнился?)", 48),
            Post("timur.tleu",R.drawable.ic_launcher_background, R.drawable.ic_launcher_background, 809, "Поделись, какой факт запомнился?)", 48),
            Post("timur.tleu",R.drawable.ic_launcher_background, R.drawable.ic_launcher_background, 809, "Поделись, какой факт запомнился?)", 48),
            Post("timur.tleu",R.drawable.ic_launcher_background, R.drawable.ic_launcher_background, 809, "Поделись, какой факт запомнился?)", 48),
            Post("timur.tleu",R.drawable.ic_launcher_background, R.drawable.ic_launcher_background, 809, "Поделись, какой факт запомнился?)", 48),
            Post("timur.tleu",R.drawable.ic_launcher_background, R.drawable.ic_launcher_background, 809, "Поделись, какой факт запомнился?)", 48),
            Post("timur.tleu",R.drawable.ic_launcher_background, R.drawable.ic_launcher_background, 809, "Поделись, какой факт запомнился?)", 48),
            Post("timur.tleu",R.drawable.ic_launcher_background, R.drawable.ic_launcher_background, 809, "Поделись, какой факт запомнился?)", 48),
            Post("timur.tleu",R.drawable.ic_launcher_background, R.drawable.ic_launcher_background, 809, "Поделись, какой факт запомнился?)", 48),
            Post("timur.tleu",R.drawable.ic_launcher_background, R.drawable.ic_launcher_background, 809, "Поделись, какой факт запомнился?)", 48),
            Post("timur.tleu",R.drawable.ic_launcher_background, R.drawable.ic_launcher_background, 809, "Поделись, какой факт запомнился?)", 48),
            Post("timur.tleu",R.drawable.ic_launcher_background, R.drawable.ic_launcher_background, 809, "Поделись, какой факт запомнился?)", 48),
            Post("timur.tleu",R.drawable.ic_launcher_background, R.drawable.ic_launcher_background, 809, "Поделись, какой факт запомнился?)", 48),
            Post("timur.tleu",R.drawable.ic_launcher_background, R.drawable.ic_launcher_background, 809, "Поделись, какой факт запомнился?)", 48),
            Post("timur.tleu",R.drawable.ic_launcher_background, R.drawable.ic_launcher_background, 809, "Поделись, какой факт запомнился?)", 48),
            Post("timur.tleu",R.drawable.ic_launcher_background, R.drawable.ic_launcher_background, 809, "Поделись, какой факт запомнился?)", 48),
            Post("timur.tleu",R.drawable.ic_launcher_background, R.drawable.ic_launcher_background, 809, "Поделись, какой факт запомнился?)", 48),
            Post("timur.tleu",R.drawable.ic_launcher_background, R.drawable.ic_launcher_background, 809, "Поделись, какой факт запомнился?)", 48),
            Post("timur.tleu",R.drawable.ic_launcher_background, R.drawable.ic_launcher_background, 809, "Поделись, какой факт запомнился?)", 48),
            Post("timur.tleu",R.drawable.ic_launcher_background, R.drawable.ic_launcher_background, 809, "Поделись, какой факт запомнился?)", 48)

            )
        recyclerViewForSearchPost.adapter = SearchPostAdapter(applicationContext, searchPosts)
    }

    private fun setNavigationBar() {
        val bottomNavigationView: BottomNavigationView = findViewById(R.id.bottom_navigation_bar)

        bottomNavigationView.setSelectedItemId(R.id.search)

        bottomNavigationView.setOnNavigationItemSelectedListener(BottomNavigationView.OnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.search -> return@OnNavigationItemSelectedListener true

                R.id.home -> {
                    startActivity(Intent(applicationContext, MainActivity::class.java))
                    overridePendingTransition(0, 0)
                    return@OnNavigationItemSelectedListener true
                }
            }
            false
        })
    }
}