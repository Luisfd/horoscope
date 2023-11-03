package com.example.hawkins.ui.providers

import com.example.hawkins.R
import com.example.hawkins.ui.model.LuckyModel
import javax.inject.Inject
import kotlin.random.Random

class RandomCardProvider @Inject constructor() {
    fun getLucky():LuckyModel?{
        return when(Random.nextInt(0,32)){
            0 -> LuckyModel(R.drawable.card_fool, R.string.luck_0)
            1 -> LuckyModel(R.drawable.card_moon, R.string.luck_1)
            2 -> LuckyModel(R.drawable.card_hermit, R.string.luck_2)
            3 -> LuckyModel(R.drawable.card_star, R.string.luck_3)
            4 -> LuckyModel(R.drawable.card_sun, R.string.luck_4)
            5 -> LuckyModel(R.drawable.card_sword, R.string.luck_5)
            6 -> LuckyModel(R.drawable.card_chariot, R.string.luck_6)
            7 -> LuckyModel(R.drawable.card_death, R.string.luck_7)
            8 -> LuckyModel(R.drawable.card_devil, R.string.luck_8)
            9 -> LuckyModel(R.drawable.card_empress, R.string.luck_9)
            10 -> LuckyModel(R.drawable.card_hierophant, R.string.luck_10)
            11 -> LuckyModel(R.drawable.card_ace_pentacles, R.string.luck_11)
            12 -> LuckyModel(R.drawable.card_judgement, R.string.luck_12)
            13 -> LuckyModel(R.drawable.card_world, R.string.luck_13)
            14 -> LuckyModel(R.drawable.card_wheel_fortune, R.string.luck_14)
            15 -> LuckyModel(R.drawable.card_tower, R.string.luck_15)
            16 -> LuckyModel(R.drawable.card_fool, R.string.luck_16)
            17 -> LuckyModel(R.drawable.card_moon, R.string.luck_17)
            18 -> LuckyModel(R.drawable.card_fool, R.string.luck_18)
            19 -> LuckyModel(R.drawable.card_moon, R.string.luck_19)
            20 -> LuckyModel(R.drawable.card_fool, R.string.luck_20)
            21 -> LuckyModel(R.drawable.card_moon, R.string.luck_21)
            22 -> LuckyModel(R.drawable.card_fool, R.string.luck_22)
            23 -> LuckyModel(R.drawable.card_moon, R.string.luck_23)
            24 -> LuckyModel(R.drawable.card_fool, R.string.luck_24)
            25 -> LuckyModel(R.drawable.card_moon, R.string.luck_25)
            26 -> LuckyModel(R.drawable.card_fool, R.string.luck_26)
            27 -> LuckyModel(R.drawable.card_moon, R.string.luck_27)
            28 -> LuckyModel(R.drawable.card_fool, R.string.luck_28)
            29 -> LuckyModel(R.drawable.card_moon, R.string.luck_29)
            30 -> LuckyModel(R.drawable.card_fool, R.string.luck_30)
            31 -> LuckyModel(R.drawable.card_moon, R.string.luck_31)
            else -> null
        }
    }
}