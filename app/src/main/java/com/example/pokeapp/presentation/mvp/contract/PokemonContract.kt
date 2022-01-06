package com.example.pokeapp.presentation.mvp.contract

import com.example.pokeapp.data.entity.PokemonSpecies
import io.reactivex.rxjava3.core.Observable

interface PokemonContract {

    interface Model {
        fun getPokemon(): Observable<PokemonSpecies>
    }

    interface View {
        fun showNewPokemon(pokemon: String)
        fun showError()
        fun showLoader()
        fun hideLoader()
    }

    interface Presenter {
        fun showNewPokemon()
    }
}
