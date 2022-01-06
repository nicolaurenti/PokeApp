package com.example.pokeapp.data.services

import com.example.pokeapp.data.services.response.PokemonSpeciesResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface PokemonApi {

    @GET("pokemon/{id}")
    fun getPokemonName(
    @Path("id") id: Int): Call<PokemonSpeciesResponse>
}
