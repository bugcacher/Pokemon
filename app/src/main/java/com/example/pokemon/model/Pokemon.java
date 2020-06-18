package com.example.pokemon.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import io.reactivex.rxjava3.schedulers.Schedulers;

/**
 * Created by Abhinav Singh on 17,June,2020
 */
@Entity(tableName = "favorite_table")
public class Pokemon {

    @PrimaryKey(autoGenerate = true)
    private int id;
    private String name;

    private String url;

    public Pokemon(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
