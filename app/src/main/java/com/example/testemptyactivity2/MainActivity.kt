package com.example.testemptyactivity2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.ImageView
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {

    lateinit var drawerOpen:ImageView
    lateinit var navigationDrawer:NavigationView
    lateinit var drawerLayout: DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Fragment畫面切換
        //supportFragmentManager.beginTransaction().replace(R.id.fragment,CollectFragment()).commit()

        drawerOpen=findViewById(R.id.drawer_open)
        navigationDrawer=findViewById(R.id.navigation_drawer)
        drawerLayout=findViewById(R.id.drawer_layout)

        drawerOpen.setOnClickListener {
            drawerLayout.openDrawer(GravityCompat.START)

        }

        val navController:NavController= Navigation.findNavController(this,R.id.fragment)
        NavigationUI.setupWithNavController(navigationDrawer,navController)
    }
}