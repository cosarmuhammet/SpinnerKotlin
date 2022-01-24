package com.example.spinnerkullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val renkler = arrayOf(" ", "Kırmızı", "Lila", "Mavi", "Sarı", "Siyah", "Yeşil")
        val adapter = ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line,renkler)

        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line)
        spinner.adapter = adapter
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {

                yazi.text =" Seçilen renk: "+ parent?.getItemAtPosition(position).toString()
                Toast.makeText(this@MainActivity,"Seçilen renk:"+renkler[position],Toast.LENGTH_LONG).show()
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }
    }
}