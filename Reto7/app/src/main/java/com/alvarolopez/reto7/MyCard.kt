package com.alvarolopez.reto7

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import com.alvarolopez.reto7.databinding.ViewMyCardBinding


class MyCard @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
    ) : LinearLayout(context, attrs, defStyleAttr){

    fun setOnActionClickListener(listener: () -> Unit){
        binding.boton.setOnClickListener {
            listener()
        }
    }

        private val binding = ViewMyCardBinding.inflate(
            LayoutInflater.from(context),
            this,
            true
        )
}