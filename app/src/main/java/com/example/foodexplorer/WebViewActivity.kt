package com.example.foodexplorer

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.ProgressBar
import android.widget.TextView
import androidx.activity.OnBackPressedCallback
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat

class WebViewActivity : AppCompatActivity() {

    private lateinit var webView: WebView
    private lateinit var progressBar: ProgressBar

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_web_view)

        // Make status bar icons white to contrast with the dark green header
        WindowInsetsControllerCompat(window, window.decorView).isAppearanceLightStatusBars = false

        val rootLayout: View = findViewById(R.id.webViewRoot)
        val titleView: TextView = findViewById(R.id.tvWebTitle)
        webView = findViewById(R.id.webView)
        progressBar = findViewById(R.id.progressBar)

        // Adjust header padding for top status bar insets and bottom navigation bar insets
        ViewCompat.setOnApplyWindowInsetsListener(rootLayout) { _, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())

            titleView.setPadding(
                titleView.paddingLeft,
                systemBars.top + 16,
                titleView.paddingRight,
                titleView.paddingBottom,
            )

            rootLayout.setPadding(
                rootLayout.paddingLeft,
                rootLayout.paddingTop,
                rootLayout.paddingRight,
                systemBars.bottom,
            )

            insets
        }

        val pageTitle = intent.getStringExtra("pageTitle")
            ?: "Discover Recipes"

        val pageUrl = intent.getStringExtra("pageUrl")
            ?: "https://www.bbcgoodfood.com/"

        titleView.text = pageTitle

        // Configure WebView
        webView.settings.javaScriptEnabled = true
        webView.settings.domStorageEnabled = true

        // Keep website navigation inside the app
        webView.webViewClient = WebViewClient()

        // Display loading progress
        webView.webChromeClient = object : WebChromeClient() {

            override fun onProgressChanged(
                view: WebView?,
                newProgress: Int,
            ) {
                progressBar.progress = newProgress

                progressBar.visibility =
                    if (newProgress < 100) View.VISIBLE
                    else View.GONE
            }
        }

        // Load the selected website
        webView.loadUrl(pageUrl)

        // Navigate backward through previously visited pages
        onBackPressedDispatcher.addCallback(
            this,
            object : OnBackPressedCallback(enabled = true) {

                override fun handleOnBackPressed() {
                    if (webView.canGoBack()) {
                        webView.goBack()
                    } else {
                        finish()
                    }
                }
            },
        )
    }

    override fun onDestroy() {
        webView.destroy()
        super.onDestroy()
    }
}
