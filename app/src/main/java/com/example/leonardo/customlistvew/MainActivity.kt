package com.example.leonardo.customlistvew

import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var listView : ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        listView = findViewById(R.id.listView)
        var list = mutableListOf<Model>()

        list.add(Model("1°",   "Real Madrid - 13 Campeonatos.",   R.drawable.realmadrid ))
        list.add(Model("2°",   "AC Milan - 7 Campeonatos.",   R.drawable.milan))
        list.add(Model("3°",   "Bayern de Munique - 5 Campeonatos.",   R.drawable.bayer))
        list.add(Model("4°",   "Liverpool - 5 Campeonatos.",   R.drawable.liverpool))
        list.add(Model("5°",   "Barcelona - 5 Campeonatos.",   R.drawable.barcelona))
        list.add(Model("6°",   "Ajax - 4 Campeonatos.",   R.drawable.ajax))
        list.add(Model("7°",   "Manchester United - 3 Campeonatos.",   R.drawable.manchesteruntd))
        list.add(Model("8°",   "Inter de Milão - 3 Campeonatos.",   R.drawable.interdemilao))
        list.add(Model("9°",   "Benfica - 2 Campeonatos.",   R.drawable.benfica))
        list.add(Model("10°",  "Juventus - 2 Campeonatos.",   R.drawable.juventus))

        listView.adapter = MyListAdapter(this,R.layout.row,list)


        val mp = MediaPlayer.create (this, R.raw.hinochamphions)
        mp.start ()


        listView.setOnItemClickListener{parent, view, position, id ->

            if (position != 0) {
                mp.stop()
            }

            if (position == 0) {
                val intent = Intent(applicationContext, ActivityTime1::class.java)
                //   intent.putExtra( "Position :$position\nItem Value : $itemValue", Toast.LENGTH_LONG)
                startActivity(intent)
            }
            if (position == 1) {
                val intent = Intent(applicationContext, ActivityTime2::class.java)
                //   intent.putExtra( "Position :$position\nItem Value : $itemValue", Toast.LENGTH_LONG)
                startActivity(intent)
            }
            if (position == 2) {
                val intent = Intent(applicationContext, ActivityTime3::class.java)
                //   intent.putExtra( "Position :$position\nItem Value : $itemValue", Toast.LENGTH_LONG)
                startActivity(intent)
            }
            if (position == 3) {
                val intent = Intent(applicationContext, ActivityTime4::class.java)
                //   intent.putExtra( "Position :$position\nItem Value : $itemValue", Toast.LENGTH_LONG)
                startActivity(intent)
            }
            if (position == 4) {
                val intent = Intent(applicationContext, ActivityTime5::class.java)
                //   intent.putExtra( "Position :$position\nItem Value : $itemValue", Toast.LENGTH_LONG)
                startActivity(intent)
            }
            if (position == 5) {
                val intent = Intent(applicationContext, ActivityTime6::class.java)
                //   intent.putExtra( "Position :$position\nItem Value : $itemValue", Toast.LENGTH_LONG)
                startActivity(intent)
            }
            if (position == 6) {
                val intent = Intent(applicationContext, ActivityTime7::class.java)
                //   intent.putExtra( "Position :$position\nItem Value : $itemValue", Toast.LENGTH_LONG)
                startActivity(intent)
            }
            if (position == 7) {
                val intent = Intent(applicationContext, ActivityTime8::class.java)
                //   intent.putExtra( "Position :$position\nItem Value : $itemValue", Toast.LENGTH_LONG)
                startActivity(intent)
            }
            if (position == 8) {
                val intent = Intent(applicationContext, ActivityTime9::class.java)
                //   intent.putExtra( "Position :$position\nItem Value : $itemValue", Toast.LENGTH_LONG)
                startActivity(intent)
            }
            if (position ==9) {
                val intent = Intent(applicationContext, ActivityTime10::class.java)
                //   intent.putExtra( "Position :$position\nItem Value : $itemValue", Toast.LENGTH_LONG)
                startActivity(intent)
            }


        }

    }
}