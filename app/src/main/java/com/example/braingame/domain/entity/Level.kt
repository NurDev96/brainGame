package com.example.braingame.domain.entity

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
enum class Level : Parcelable {
    TEST, NORMAL, EASY, HARD
}
