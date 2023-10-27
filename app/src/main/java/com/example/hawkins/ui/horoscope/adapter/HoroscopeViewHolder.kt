package com.example.hawkins.ui.horoscope.adapter

import android.content.ClipData.Item
import android.content.Context
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.hawkins.databinding.ItemHoroscopeBinding
import com.example.hawkins.domain.model.HoroscopeInfo

class HoroscopeViewHolder(view: View):RecyclerView.ViewHolder(view) {

    private val binding = ItemHoroscopeBinding.bind(view)


    fun render(horoscopeInfo: HoroscopeInfo){
        val context: Context = binding.tvTitle.context
        binding.ivHoroscope.setImageResource(horoscopeInfo.img)
        binding.tvTitle.text = context.getString(horoscopeInfo.name)
    }
}