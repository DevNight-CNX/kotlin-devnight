package com.jedsada.workshopkoltincnx.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class MovieModel(@SerializedName("results") val listMovie: List<MovieDetailModel>? = listOf())
    : Parcelable

@Parcelize
data class MovieDetailModel(@SerializedName("title") val title: String? = null,
                            @SerializedName("image_url") val imageUrl: String? = null,
                            @SerializedName("overview") val overview: String? = null) : Parcelable