package com.example.pokemon.repository;

import androidx.lifecycle.LiveData;

import com.example.pokemon.db.PokeDao;
import com.example.pokemon.model.Pokemon;
import com.example.pokemon.model.PokemonResponse;
import com.example.pokemon.network.PokeApiService;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.rxjava3.core.Observable;

/**
 * Created by Abhinav Singh on 17,June,2020
 */

public class Repository {

    private PokeDao pokeDao;
    private PokeApiService apiService;

    @Inject
    public Repository(PokeDao pokeDao, PokeApiService apiService) {
        this.pokeDao = pokeDao;
        this.apiService = apiService;
    }


    public Observable<PokemonResponse> getPokemons(){
        return apiService.getPokemons();
    }

    public void insertPokemon(Pokemon pokemon){
        pokeDao.insertPokemon(pokemon);
    }

    public void deletePokemon(String pokemonName){
        pokeDao.deletePokemon(pokemonName);
    }

    public void deleteAll(){
        pokeDao.deleteAll();
    }

    public LiveData<List<Pokemon>> getFavoritePokemon(){
        return pokeDao.getFavoritePokemons();
    }
}
