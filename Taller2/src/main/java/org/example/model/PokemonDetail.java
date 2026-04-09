package org.example.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PokemonDetail {
    private String name;
    private int height;
    private int weight;
    private List<TypeWrapper> types;
    private List<AbilityWrapper> abilities;

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class TypeWrapper {
        public TypeDetail type;
        public static class TypeDetail { public String name; }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class AbilityWrapper {
        public AbilityDetail ability;
        public static class AbilityDetail { public String name; }
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getHeight() { return height; }
    public int getWeight() { return weight; }
    public List<TypeWrapper> getTypes() { return types; }
    public List<AbilityWrapper> getAbilities() { return abilities; }
}