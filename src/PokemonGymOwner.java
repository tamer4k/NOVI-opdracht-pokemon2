import java.util.List;

public class PokemonGymOwner extends PokemonTrainer{
    private String town;
    private String gymOwner;
    private List<Pokemon> gymPokemon;
    private int Hp;
    public PokemonGymOwner(String name, String city, List<Pokemon> pokemons) {
        super(name, pokemons);
        this.gymOwner = name;
        this.town = city;
        this.gymPokemon = pokemons;


    }

    public String getName() {
        return gymOwner;
    }

    public String getTown() {
        return town;
    }
    public List<Pokemon> getPokemons() {
        return gymPokemon;
    }
}
