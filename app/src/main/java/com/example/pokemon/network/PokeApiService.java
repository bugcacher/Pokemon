package com.example.pokemon.network;

import com.example.pokemon.model.PokemonResponse;

import javax.annotation.Generated;

import io.reactivex.rxjava3.core.Observable;
import retrofit2.http.GET;

/**
 * Created by Abhinav Singh on 17,June,2020
 */
public interface PokeApiService {

    @GET("pokemon")
    Observable<PokemonResponse> getPokemons();
}
