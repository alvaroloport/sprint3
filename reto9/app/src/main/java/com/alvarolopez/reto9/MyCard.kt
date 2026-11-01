package com.alvarolopez.reto9

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import com.alvarolopez.reto9.databinding.ViewMyCardBinding


class MyCard @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
) : LinearLayout(context, attrs, defStyleAttr){

    private val binding = ViewMyCardBinding.inflate(
        LayoutInflater.from(context),
        this,
        true
    )

    var titulo : String
        get() = binding.titulo.text.toString()
        set(value){
            binding.titulo.text = value
        }

    var subtitulo : String
        get() = binding.subtitulo.text.toString()
        set(value){
            binding.subtitulo.text = value
        }

    var descripcion : String
        get() = binding.descripcion.text.toString()
        set(value){
            binding.descripcion.text = value
        }
}