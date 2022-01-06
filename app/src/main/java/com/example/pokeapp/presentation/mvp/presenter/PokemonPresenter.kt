package com.example.pokeapp.presentation.mvp.presenter

import com.example.pokeapp.presentation.mvp.contract.PokemonContract
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.schedulers.Schedulers

class PokemonPresenter(private val model: PokemonContract.Model, private val view: PokemonContract.View): PokemonContract.Presenter {

    override fun showNewPokemon() {
        view.showLoader()
        model.getPokemon()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe ({ data ->
                view.hideLoader()
                view.showNewPokemon(data.name)
            }, {
                view.hideLoader()
                view.showError()
        })
    }
}