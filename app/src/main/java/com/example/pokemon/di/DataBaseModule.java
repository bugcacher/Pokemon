package com.example.pokemon.di;

import android.app.Application;

import androidx.room.Room;

import com.example.pokemon.db.PokeDao;
import com.example.pokemon.db.PokemonDB;
import com.example.pokemon.network.PokeApiService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ApplicationComponent;

/**
 * Created by Abhinav Singh on 17,June,2020
 */

@Module
@InstallIn(ApplicationComponent.class)
public class DataBaseModule {

    @Provides
    @Singleton
    public static PokemonDB providePokemonDB(Application application){
         return Room.databaseBuilder(application,PokemonDB.class,"Favorite Database")
                 .fallbackToDestructiveMigration()
                 .allowMainThreadQueries()
                 .build();
    }

    @Provides
    @Singleton
    public static PokeDao providePokeDao(PokemonDB pokemonDB){
        return pokemonDB.pokeDao();
    }
}
