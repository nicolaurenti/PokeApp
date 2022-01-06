package com.example.pokeapp.data.services.response

import com.google.gson.annotations.SerializedName

data class PokemonSpeciesResponse(
    @SerializedName("name") val name: String
)

