import java.util.List;

public class PokemonTrainer {
    private String name;
    private List<Pokemon> pokemons;

    public PokemonTrainer(String userA, List<Pokemon> Pokemons) {
        this.name = userA;
        this.pokemons = Pokemons;
    }

    public String getName() {
        return name;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }
}
