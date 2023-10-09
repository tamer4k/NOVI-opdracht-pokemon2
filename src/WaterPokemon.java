import java.util.Arrays;
import java.util.List;


public class WaterPokemon extends Pokemon{

    List<String> attacks = Arrays.asList("surf", "hydroPump", "rainDance", "hydroCanon");
    boolean isPlayer = true;
    public WaterPokemon(String name, int level, int hp, String food, String sound, String type) {
        super(name, level, hp, food, sound, type);
    }


    @Override
    public List<String> getAttacks() {
        return attacks;
    }

    public void trainerPokemon(Pokemon pokemon, Pokemon enemy, int damage) {

        int temp = enemy.getHp();

        switch (enemy.getType()) {
            case ("fire"): {

                temp = (int) (damage * 1.5);
                Math.round(temp);
                System.out.println(enemy.getName() + " loses " + temp + "hp.");
                enemy.setHp(enemy.getHp() - temp);
                System.out.println(enemy.getName() + " has " + enemy.getHp() + "hp left");
                break;
            }
            case ("electric"): {
                temp = (int) (damage * 1.1);
                Math.round(temp);
                System.out.println(enemy.getName() + " loses " + temp + "hp.");
                enemy.setHp(enemy.getHp() - temp);
                System.out.println(enemy.getName() + " has " + enemy.getHp() + "hp left");
                break;
            }
            case ("grass"): {
                temp = (int) (damage * 0.8);
                Math.round(temp);
                System.out.println(enemy.getName() + " loses " + temp + "hp.");
                enemy.setHp(enemy.getHp() - temp);
                System.out.println(enemy.getName() + " has " + enemy.getHp() + "hp left");
                break;
            }
            case ("water"): {
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
            case ("fire"): {
                temp = (int) (damage * 1.5);
                Math.round(temp);
                System.out.println(pokemon.getName() + " loses " + temp + "hp.");
                pokemon.setHp(pokemon.getHp() - temp);
                System.out.println(pokemon.getName() + " has " + pokemon.getHp() + "hp left");
                break;
            }
            case ("electric"): {
                temp = (int) (damage * 1.1);
                Math.round(temp);
                System.out.println(pokemon.getName() + " loses " + temp + "hp.");
                pokemon.setHp(pokemon.getHp() - temp);
                System.out.println(pokemon.getName() + " has " + pokemon.getHp() + "hp left");
                break;
            }
            case ("grass"): {
                temp = (int) (damage * 0.8);
                Math.round(temp);
                System.out.println(pokemon.getName() + " loses " + temp + "hp.");
                pokemon.setHp(pokemon.getHp() - temp);
                System.out.println(pokemon.getName() + " has " + pokemon.getHp() + "hp left");
                break;
            }
            case ("water"): {
                temp = (int) (damage * 0.5);
                Math.round(temp);
                System.out.println(pokemon.getName() + " loses " + temp + "hp.");
                pokemon.setHp(pokemon.getHp() - temp);
                System.out.println(pokemon.getName() + " has " + pokemon.getHp() + "hp left");
                break;
            }
        }
    }

    public void surf(Pokemon pokemon, Pokemon enemy) {
        int damage = (int) (Math.random() * (50 - 30) + 30);

        if (isPlayer) {
            System.out.println(pokemon.getName() + " attacks " + enemy.getName() + " with surf.");
            trainerPokemon(pokemon, enemy, damage);
            isPlayer = false;
        } else {
            System.out.println(enemy.getName() + " attacks " + pokemon.getName() + " with surf.");
            enemyPokemon(enemy, pokemon, damage);
            isPlayer = true;
        }
    }

    public void hydroPump(Pokemon pokemon, Pokemon enemy) {
        int damage = (int) (Math.random() * (80 - 10) + 10);

        if (isPlayer) {
            System.out.println(pokemon.getName() + " attacks " + enemy.getName() + " with hydropump.");
            trainerPokemon(pokemon, enemy, damage);
            isPlayer = false;
        } else {
            System.out.println(enemy.getName() + " attacks " + pokemon.getName() + " with hydropump.");
            enemyPokemon(enemy, pokemon, damage);
            isPlayer = true;
        }
    }


    public  void rainDance(Pokemon pokemon, Pokemon enemy) {
        int damage = (int) (Math.random() * (10 - 5) + 5);

        if (isPlayer == true) {
            System.out.println(pokemon.getName() + " attacks " + enemy.getName() + " with raindance.");
            if (enemy.getType() == "grass") {
                enemy.setHp(+10);
            }
            else if (enemy.getType() == "electric") {
                System.out.println("Raindance has no effect on" + enemy.getName());
            }
            else {
                trainerPokemon(pokemon, enemy, damage);}
            isPlayer = false;

        }
        else {
            System.out.println(enemy.getName() + " attacks " + pokemon.getName() + " with raindance.");
            if (enemy.getType() == "grass") {
                enemy.setHp(+10);
            }
            else if (enemy.getType() == "electric") {
                System.out.println("Raindance has no effect on" + pokemon.getName());

            }
            else {
                enemyPokemon(enemy, pokemon, damage);}
            isPlayer = true;

        }
    }
    public void hydroCanon (Pokemon pokemon, Pokemon enemy){
        int damage = (int) (Math.random() * (30 - 20) + 20);

        if (isPlayer) {
            System.out.println(pokemon.getName() + " attacks " + enemy.getName() + " with hydrocanon.");
            trainerPokemon(pokemon, enemy, damage);
            isPlayer = false;
        } else {
            System.out.println(enemy.getName() + " attacks " + pokemon.getName() + " with hydrocanon.");
            enemyPokemon(enemy, pokemon, damage);
            isPlayer = true;

        }
    }
}
