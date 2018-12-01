package com.example.leonardo.customlistvew

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView


class MyListAdapter(var mCtx:Context , var resource:Int,var items:List<Model>)
    :ArrayAdapter<Model>( mCtx , resource , items ){

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val layoutInflater :LayoutInflater = LayoutInflater.from(mCtx)

        val view : View = layoutInflater.inflate(resource , null )
        val imageView :ImageView = view.findViewById(R.id.escudo)
        var textView : TextView = view.findViewById(R.id.titulo)
        var textView1 : TextView = view.findViewById(R.id.descricao)


        var time : Model = items[position]

        imageView.setImageDrawable(mCtx.resources.getDrawable(time.imagem))
        textView.text = time.titulo
        textView1.text = time.descricao


        return view
    }

}