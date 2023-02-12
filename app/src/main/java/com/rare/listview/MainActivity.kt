package com.rare.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.core.content.ContentProviderCompat.requireContext

class MainActivity : AppCompatActivity() {

    lateinit var lv : ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lv = findViewById(R.id.lv)

        val arrayAdapter : ArrayAdapter<*>
        val list = arrayOf("ram", "shan")

        arrayAdapter = ArrayAdapter(requireContext(),android.R.layout.simple_list_item_1, list)

        lv.adapter= arrayAdapter
    }
}