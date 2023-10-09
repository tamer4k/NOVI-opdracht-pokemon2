import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon {

    private final List<String> attacks = Arrays.asList("fireLash", "flameThrower", "pyroBall", "inferno");
    boolean isPlayer = true;
    public FirePokemon(String name, int level, int hp, String food, String sound, String type) {
        super(name, level, hp, food, sound, type);
    }

    @Override
    public List<String> getAttacks() {
        return attacks;
    }
    public void trainerPokemon(Pokemon pokemon, Pokemon enemy, int damage) {

        int temp = enemy.getHp();

        switch (enemy.getType()) {
            case ("grass"): {

                temp = (int) (damage * 1.5);
                Math.round(temp);
                System.out.println(enemy.getName() + " loses " + temp + "hp.");
                enemy.setHp(enemy.getHp() - temp);
                System.out.println(enemy.getName() + " has " + enemy.getHp() + "hp left");
                break;
            }
            case ("water"): {
                temp = (int) (damage * 1.1);
                Math.round(temp);
                System.out.println(enemy.getName() + " loses " + temp + "hp.");
                enemy.setHp(enemy.getHp() - temp);
                System.out.println(enemy.getName() + " has " + enemy.getHp() + "hp left");
                break;
            }
            case ("electric"): {
                temp = (int) (damage * 0.8);
                Math.round(temp);
                System.out.println(enemy.getName() + " loses " + temp + "hp.");
                enemy.setHp(enemy.getHp() - temp);
                System.out.println(enemy.getName() + " has " + enemy.getHp() + "hp left");
                break;
            }
            case ("fire"): {
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
            case ("grass"): {
                temp = (int) (damage * 1.5);
                Math.round(temp);
                System.out.println(pokemon.getName() + " loses " + temp + "hp.");
                pokemon.setHp(pokemon.getHp() - temp);
                System.out.println(pokemon.getName() + " has " + pokemon.getHp() + "hp left");
                break;
            }
            case ("water"): {
                temp = (int) (damage * 1.1);
                Math.round(temp);
                System.out.println(pokemon.getName() + " loses " + temp + "hp.");
                pokemon.setHp(pokemon.getHp() - temp);
                System.out.println(pokemon.getName() + " has " + pokemon.getHp() + "hp left");
                break;
            }
            case ("electric"): {
                temp = (int) (damage * 0.8);
                Math.round(temp);
                System.out.println(pokemon.getName() + " loses " + temp + "hp.");
                pokemon.setHp(pokemon.getHp() - temp);
                System.out.println(pokemon.getName() + " has " + pokemon.getHp() + "hp left");
                break;
            }
            case ("fire"): {
                temp = (int) (damage * 0.5);
                Math.round(temp);
                System.out.println(pokemon.getName() + " loses " + temp + "hp.");
                pokemon.setHp(pokemon.getHp() - temp);
                System.out.println(pokemon.getName() + " has " + pokemon.getHp() + "hp left");
                break;
            }
        }
    }

    public void fireLash(Pokemon pokemon, Pokemon enemy) {
        int damage = (int) (Math.random() * (50 - 30) + 30);

        if (isPlayer) {
            System.out.println(pokemon.getName() + " attacks " + enemy.getName() + " with firelash.");
            trainerPokemon(pokemon, enemy, damage);
            isPlayer = false;
        } else {
            System.out.println(enemy.getName() + " attacks " + pokemon.getName() + " with firelash.");
            enemyPokemon(enemy, pokemon, damage);
            isPlayer = true;
        }
    }

    public void flameThrower(Pokemon pokemon, Pokemon enemy) {
        int damage = (int) (Math.random() * (80 - 10) + 10);

        if (isPlayer) {
            System.out.println(pokemon.getName() + " attacks " + enemy.getName() + " with flamethrower.");
            trainerPokemon(pokemon, enemy, damage);
            isPlayer = false;
        } else {
            System.out.println(enemy.getName() + " attacks " + pokemon.getName() + " with flamethrower.");
            enemyPokemon(enemy, pokemon, damage);
            isPlayer = true;
        }
    }


    public void pyroBall(Pokemon pokemon, Pokemon enemy) {
        int damage = (int) (Math.random() * (80 - 10) + 10);

        if (isPlayer) {
            System.out.println(pokemon.getName() + " attacks " + enemy.getName() + " with pyroball.");
            trainerPokemon(pokemon, enemy, damage);
            isPlayer = false;
        } else {
            System.out.println(enemy.getName() + " attacks " + pokemon.getName() + " with pyroball.");
            enemyPokemon(enemy, pokemon, damage);
            isPlayer = true;
        }
    }
    public void inferno(Pokemon pokemon, Pokemon enemy) {
        int damage = (int) (Math.random() * (30 - 20) + 20);

        if (isPlayer) {
            System.out.println(pokemon.getName() + " attacks " + enemy.getName() + " with inferno.");
            trainerPokemon(pokemon, enemy, damage);
            isPlayer = false;
        } else {
            System.out.println(enemy.getName() + " attacks " + pokemon.getName() + " with inferno.");
            enemyPokemon(enemy, pokemon, damage);
            isPlayer = true;

        }
    }
}
