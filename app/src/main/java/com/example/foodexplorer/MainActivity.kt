package com.example.foodexplorer

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        WindowInsetsControllerCompat(window, window.decorView).isAppearanceLightStatusBars = true

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnRecipes: Button = findViewById(R.id.btnRecipes)
        val btnHealthy: Button = findViewById(R.id.btnHealthy)

        btnRecipes.setOnClickListener {
            openWebView("Discover Recipes", "https://www.bbcgoodfood.com/")
        }

        btnHealthy.setOnClickListener {
            openWebView("Healthy Food", "https://www.eatingwell.com/")
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.menu_home -> {
                Toast.makeText(this, "Home selected", Toast.LENGTH_SHORT).show()
                true
            }

            R.id.menu_recipes -> {
                openWebView("Discover Recipes", "https://www.bbcgoodfood.com/")
                true
            }

            R.id.menu_healthy -> {
                openWebView("Healthy Food", "https://www.eatingwell.com/")
                true
            }

            R.id.menu_about -> {
                AlertDialog.Builder(this)
                    .setTitle("About Food Explorer")
                    .setMessage("Discover delicious recipes and explore healthy food ideas.")
                    .setPositiveButton("OK", null)
                    .show()
                true
            }

            R.id.menu_exit -> {
                finish()
                true
            }

            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun openWebView(title: String, url: String) {
        val intent = Intent(this, WebViewActivity::class.java).apply {
            putExtra("pageTitle", title)
            putExtra("pageUrl", url)
        }
        startActivity(intent)
    }
}
