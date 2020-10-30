package com.example.gitclient.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.gitclient.R
import com.example.gitclient.ui.fragment.ShowFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
                .replace(R.id.fr, ShowFragment.newInstance("",""))
                .commit();
    }
}
