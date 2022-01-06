package com.example.pokeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pokeapp.data.services.PokemonService
import com.example.pokeapp.databinding.ActivityMainBinding
import com.example.pokeapp.presentation.mvp.contract.PokemonContract
import com.example.pokeapp.presentation.mvp.model.PokemonModel
import com.example.pokeapp.presentation.mvp.presenter.PokemonPresenter
import com.example.pokeapp.presentation.mvp.view.PokemonView

class MainActivity : AppCompatActivity() {

    private lateinit var presenter: PokemonContract.Presenter
    private lateinit var  binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        presenter = PokemonPresenter(PokemonModel(PokemonService()),PokemonView(this, binding))
        binding.generateName.setOnClickListener {
            presenter.showNewPokemon()
        }
    }
}