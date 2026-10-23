package com.example.pokemonAPI.controller;

import com.example.pokemonAPI.model.Pokemon;
import com.example.pokemonAPI.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/pokemones")
public class PokemonController {

    @Autowired
    private PokemonService pokemonService;

    @GetMapping
    public List<Pokemon> listar(){
        return pokemonService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public Pokemon listar(@PathVariable  Long id){
        return  pokemonService.obtenerPorId(id);
    }

    @PostMapping()
    public Pokemon pokemonCrear(@RequestBody Pokemon pokemon){
        return pokemonService.crear(pokemon);
    }
}
