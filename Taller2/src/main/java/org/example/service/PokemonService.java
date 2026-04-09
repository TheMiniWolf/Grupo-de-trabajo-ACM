package org.example.service;

import org.example.model.PokemonBasic;
import org.example.model.PokemonDetail;
import org.example.model.PokemonResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PokemonService {

    private final RestTemplate restTemplate = new RestTemplate();

    public void consumirPokeApi() {
        String urlLista = "https://pokeapi.co/api/v2/pokemon?limit=5";

        PokemonResponse response = restTemplate.getForObject(urlLista, PokemonResponse.class);

        if (response != null && response.getResults() != null) {
            System.out.println("--- LISTADO DE POKÉMON ---");

            for (PokemonBasic base : response.getResults()) {
                PokemonDetail detalle = restTemplate.getForObject(base.getUrl(), PokemonDetail.class);

                imprimirInfo(detalle);
            }
        }
    }

    private void imprimirInfo(PokemonDetail p) {
        System.out.println("================================");
        System.out.println("POKÉMON: " + p.getName().toUpperCase());
        System.out.print("TIPOS: ");
        p.getTypes().forEach(t -> System.out.print("[" + t.type.name + "] "));
        System.out.println("\nALTURA: " + p.getHeight() + " | PESO: " + p.getWeight());
        System.out.print("HABILIDADES: ");
        p.getAbilities().forEach(a -> System.out.print(a.ability.name + " "));
        System.out.println("\n================================");
    }
}