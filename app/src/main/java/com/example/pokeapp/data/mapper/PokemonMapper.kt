package com.example.pokeapp.data.mapper

import com.example.pokeapp.data.entity.PokemonSpecies
import com.example.pokeapp.data.services.response.PokemonSpeciesResponse

class PokemonMapper {

    fun transform(pokemonName: String): PokemonSpecies =
        PokemonSpecies(pokemonName)
}