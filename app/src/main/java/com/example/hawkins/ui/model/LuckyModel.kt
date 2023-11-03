package com.example.hawkins.ui.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class LuckyModel (
    @DrawableRes val image:Int, //El @drawable y demás en ambos hacen que asegures que solo le mandas un drawable de verdad,
                                // y se tiene que meter en model de ui por este motivo y no un provider en la capa de data.
    @StringRes val text:Int
)