package com.example.dictapp.feature_dictionary.domain.model

import com.example.dictapp.feature_dictionary.data.remote.dto.MeaningDto

data class WordInfo(
    val meanings: List<Meaning>,
    val phonetic: String,
    val word: String
)
