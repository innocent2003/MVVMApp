package com.example.testmvvm12.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

import com.google.gson.annotations.SerializedName

data class Source(
    val id: Any,
    val name: String
)