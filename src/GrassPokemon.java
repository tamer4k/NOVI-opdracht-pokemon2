import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon{

    List<String> attacks = Arrays.asList("leafStorm", "solarBeam", "leechSeed", "leaveBlade");
    boolean isPlayer = true;
    public GrassPokemon(String name, int level, int hp, String food, String sound, String type) {
        super(name, level, hp, food, sound, type);
    }


    @Override
    public List<String> getAttacks() {
        return attacks;
    }

    public void trainerPokemon(Pokemon pokemon, Pokemon enemy, int damage) {
        int temp = enemy.getHp();

        switch (enemy.getType()) {
            case ("electric"): {

                temp = (int) (damage * 1.5);
                Math.round(temp);
                System.out.println(enemy.getName() + " loses " + temp + "hp.");
                enemy.setHp(enemy.getHp() - temp);
                System.out.println(enemy.getName() + " has " + enemy.getHp() + "hp left");
                break;
            }
            case ("fire"): {
                temp = (int) (damage * 1.1);
                Math.round(temp);
                System.out.println(enemy.getName() + " loses " + temp + "hp.");
                enemy.setHp(enemy.getHp() - temp);
                System.out.println(enemy.getName() + " has " + enemy.getHp() + "hp left");
                break;
            }
            case ("water"): {
                temp = (int) (damage * 0.8);
                Math.round(temp);
                System.out.println(enemy.getName() + " loses " + temp + "hp.");
                enemy.setHp(enemy.getHp() - temp);
                System.out.println(enemy.getName() + " has " + enemy.getHp() + "hp left");
                break;
            }
            case ("grass"): {
                temp = (int) (damage * 0.5);
                Math.round(temp);
                System.out.println(enemy.getName() + " loses " + temp + "hp.");
                enemy.setHp(enemy.getHp() - temp);
                System.out.println(enemy.getName() + " has " + enemy.getHp() + "hp left");
                break;
            }
        }
    }

    public void enemyPokemon(Pokemon pokemon, Pokemon enemy, int damage) {

        int temp = pokemon.getHp();

        switch (pokemon.getType()) {
            case ("electric"): {
                temp = (int) (damage * 1.5);
                Math.round(temp);
                System.out.println(pokemon.getName() + " loses " + temp + "hp.");
                pokemon.setHp(pokemon.getHp() - temp);
                System.out.println(pokemon.getName() + " has " + pokemon.getHp() + "hp left");
                break;
            }
            case ("fire"): {
                temp = (int) (damage * 1.1);
                Math.round(temp);
                System.out.println(pokemon.getName() + " loses " + temp + "hp.");
                pokemon.setHp(pokemon.getHp() - temp);
                System.out.println(pokemon.getName() + " has " + pokemon.getHp() + "hp left");
                break;
            }
            case ("water"): {
                temp = (int) (damage * 0.8);
                Math.round(temp);
                System.out.println(pokemon.getName() + " loses " + temp + "hp.");
                pokemon.setHp(pokemon.getHp() - temp);
                System.out.println(pokemon.getName() + " has " + pokemon.getHp() + "hp left");
                break;
            }
            case ("grass"): {
                temp = (int) (damage * 0.5);
                Math.round(temp);
                System.out.println(pokemon.getName() + " loses " + temp + "hp.");
                pokemon.setHp(pokemon.getHp() - temp);
                System.out.println(pokemon.getName() + " has " + pokemon.getHp() + "hp left");
                break;
            }
        }
    }

    public void leafStorm(Pokemon pokemon, Pokemon enemy) {
        int damage = (int) (Math.random() * (50 - 30) + 30);

        if (isPlayer) {
            System.out.println(pokemon.getName() + " attacks " + enemy.getName() + " with leafstorm.");
            trainerPokemon(pokemon, enemy, damage);
            isPlayer = false;
        } else {
            System.out.println(enemy.getName() + " attacks " + pokemon.getName() + " with leafstorm.");
            enemyPokemon(enemy, pokemon, damage);
            isPlayer = true;
        }
    }

    public void solarBeam(Pokemon pokemon, Pokemon enemy) {
        int damage = (int) (Math.random() * (80 - 10) + 10);

        if (isPlayer) {
            System.out.println(pokemon.getName() + " attacks " + enemy.getName() + " with solarbeam.");
            trainerPokemon(pokemon, enemy, damage);
            isPlayer = false;
        } else {
            System.out.println(enemy.getName() + " attacks " + pokemon.getName() + " with solarbeam.");
            enemyPokemon(enemy, pokemon, damage);
            isPlayer = true;
        }
    }


    public void leechSeed(Pokemon pokemon, Pokemon enemy) {
        int damage = (int) (Math.random() * (30 - 5) + 5);

        if (isPlayer == true) {
            System.out.println(pokemon.getName() + " attacks " + enemy.getName() + " with leechseed.");
            System.out.println(pokemon.getName() + " got " + damage + "hp from " + enemy.getName());
            pokemon.setHp(pokemon.getHp() + damage);
            enemy.setHp(enemy.getHp() - damage);
            System.out.println(pokemon.getName() + " now has " + pokemon.getHp() + "hp");
            System.out.println(enemy.getName() + "has now " + enemy.getHp() + "hp");

            trainerPokemon(pokemon, enemy, damage);
            isPlayer = false;


        } else {
            System.out.println(enemy.getName() + " attacks " + pokemon.getName() + " with leechseed.");
            System.out.println(enemy.getName() + " got " + damage + "hp from " + pokemon.getName());
            pokemon.setHp(enemy.getHp() + damage);
            pokemon.setHp(pokemon.getHp() - damage);
            System.out.println(enemy.getName() + " now has " + enemy.getHp() + "hp");
            System.out.println(pokemon.getName() + "has now " + pokemon.getHp() + "hp");
            isPlayer = true;

        }
    }

    public void leaveBlade(Pokemon pokemon, Pokemon enemy) {
        int damage = (int) (Math.random() * (30 - 20) + 20);

        if (isPlayer) {
            System.out.println(pokemon.getName() + " attacks " + enemy.getName() + " with leaveblade.");
            trainerPokemon(pokemon, enemy, damage);
            isPlayer = false;
        } else {
            System.out.println(enemy.getName() + " attacks " + pokemon.getName() + " with leaveblade.");
            enemyPokemon(enemy, pokemon, damage);
            isPlayer = true;

        }
    }
}
