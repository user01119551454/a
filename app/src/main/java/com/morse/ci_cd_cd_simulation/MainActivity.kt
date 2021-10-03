package com.morse.ci_cd_cd_simulation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    val currentBranchName by lazy { findViewById<TextView>(R.id.currentBranch) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        currentBranchName.text = BuildConfig.MESSAGE
    }
}