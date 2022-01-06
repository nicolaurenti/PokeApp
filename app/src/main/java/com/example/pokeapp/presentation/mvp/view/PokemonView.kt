package com.example.pokeapp.presentation.mvp.view

import android.app.Activity
import android.view.View
import android.widget.Toast
import com.example.pokeapp.databinding.ActivityMainBinding
import com.example.pokeapp.presentation.mvp.contract.PokemonContract
import java.util.*

class PokemonView(activity: Activity, private var binding: ActivityMainBinding): ActivityView(activity), PokemonContract.View {
    override fun showNewPokemon(pokemon: String) {
        binding.pokemonName.text = pokemon.replaceFirstChar {
            if (it.isLowerCase()) it.titlecase(
                Locale.getDefault()
            ) else it.toString()
        }
    }

    override fun showError() {
        Toast.makeText(context, "Error", Toast.LENGTH_SHORT).show()
    }

    override fun showLoader() {
        binding.progressBar.visibility = View.VISIBLE
    }

    override fun hideLoader() {
        binding.progressBar.visibility = View.GONE
    }
}