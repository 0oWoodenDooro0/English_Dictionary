package com.practice.dictionary

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface DictionaryApi {

    @GET("/api/v2/entries/en/{word}")
    suspend fun getDictionary(@Path("word") word: String): Response<List<Dictionary>>
}