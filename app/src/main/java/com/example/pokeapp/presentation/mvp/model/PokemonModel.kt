package com.example.pokeapp.presentation.mvp.model

import com.example.pokeapp.data.entity.PokemonSpecies
import com.example.pokeapp.data.services.PokemonService
import com.example.pokeapp.presentation.mvp.contract.PokemonContract
import io.reactivex.rxjava3.core.Observable

class PokemonModel(private val pokemonService: PokemonService): PokemonContract.Model {
    override fun getPokemon(): Observable<PokemonSpecies> =
        pokemonService.getPokemonName((0 until 898).random())
}