package com.tiara.recyclerviewkotlin

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Supermakan (
    var nameSupermakan: String? = null,
    var imgSupermakan: Int=0
) : Parcelable