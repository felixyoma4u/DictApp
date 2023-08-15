package com.example.dictapp.feature_dictionary.data.remote.dto

import com.example.dictapp.feature_dictionary.domain.model.License

data class LicenseDto(
    val name: String,
    val url: String
){
    fun toLicense(): License {
        return License(
            name = name
        )
    }
}