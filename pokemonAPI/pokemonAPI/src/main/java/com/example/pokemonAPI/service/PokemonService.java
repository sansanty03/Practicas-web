package com.example.pokemonAPI.service;

import com.example.pokemonAPI.model.Pokemon;
import com.example.pokemonAPI.repository.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PokemonService {

    @Autowired
    private PokemonRepository pokemonRepository;

    public List<Pokemon> obtenerTodos(){

        return pokemonRepository.findAll();
    }

    public Pokemon obtenerPorId(Long id){
        return pokemonRepository.findById(id).orElse(null);

    }

    public Pokemon crear(Pokemon pokemom){
        return pokemonRepository.save(pokemom);
    }
}
