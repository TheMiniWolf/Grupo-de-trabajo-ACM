package org.example.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PokemonResponse {
    private List<PokemonBasic> results;

    public List<PokemonBasic> getResults() { return results; }
    public void setResults(List<PokemonBasic> results) { this.results = results; }
}