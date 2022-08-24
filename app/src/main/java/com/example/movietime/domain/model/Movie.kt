package com.example.movietime.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.movietime.util.Components.MOVIE_TABLE_NAME
import com.google.gson.annotations.SerializedName

@Entity(tableName = MOVIE_TABLE_NAME)
data class Movie(

    @PrimaryKey(autoGenerate = false)
    @SerializedName("id")
    val id: Long,
    @SerializedName("title")
    val title: String,
    @SerializedName("overview")
    val overview: String,
    @SerializedName("poster_path")
    val posterPath: String,
    @SerializedName("backdrop_path")
    val backdropPath: String?,
    @SerializedName("vote_average")
    val rating: Float,
    @SerializedName("release_date")
    val releaseDate: String


)
