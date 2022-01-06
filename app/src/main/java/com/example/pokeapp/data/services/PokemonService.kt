package com.example.pokeapp.data.services

import io.reactivex.rxjava3.core.Observable
import com.example.pokeapp.data.entity.PokemonSpecies
import com.example.pokeapp.data.mapper.PokemonMapper
import com.example.pokeapp.data.services.request.generator.PokemonRequestGenerator

class PokemonService {
    private val api = PokemonRequestGenerator()
    private val mapper = PokemonMapper()

    fun getPokemonName(id: Int): Observable<PokemonSpecies> {
        return Observable.create { subscriber ->
            val callResponse = api.createService(PokemonApi::class.java).getPokemonName(id)
            val response = callResponse.execute()
            if (response.isSuccessful) {
                response.body()?.name?.let { subscriber.onNext(mapper.transform(it)) }
            } else {
                subscriber.onError(Throwable(response.message()))
            }
        }
    }
}