import java.util.Arrays;
import java.util.List;
public class ElectricPokemon extends Pokemon {

    List<String> attacks = Arrays.asList("thunderPunch", "electroBall", "voltTackle", "thunder");
    boolean isPlayer = true;
    public ElectricPokemon(String name, int level, int hp, String food, String sound, String type) {
        super(name, level, hp, food, sound, type);
    }

    @Override
    public List<String> getAttacks() {
        return attacks;
    }

    public void trainerPokemon(Pokemon pokemon, Pokemon enemy, int damage) {

        int temp = enemy.getHp();

        switch (enemy.getType()) {
            case ("water"): {

                temp = (int) (damage * 1.5);
                Math.round(temp);
                System.out.println(enemy.getName() + " loses " + temp + "hp.");
                enemy.setHp(enemy.getHp() - temp);
                System.out.println(enemy.getName() + " has " + enemy.getHp() + "hp left");
                break;
            }
            case ("grass"): {
                temp = (int) (damage * 1.1);
                Math.round(temp);
                System.out.println(enemy.getName() + " loses " + temp + "hp.");
                enemy.setHp(enemy.getHp() - temp);
                System.out.println(enemy.getName() + " has " + enemy.getHp() + "hp left");
                break;
            }
            case ("fire"): {
                temp = (int) (damage * 0.8);
                Math.round(temp);
                System.out.println(enemy.getName() + " loses " + temp + "hp.");
                enemy.setHp(enemy.getHp() - temp);
                System.out.println(enemy.getName() + " has " + enemy.getHp() + "hp left");
                break;
            }
            case ("electric"): {
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
            case ("water"): {
                temp = (int) (damage * 1.5);
                Math.round(temp);
                System.out.println(pokemon.getName() + " loses " + temp + "hp.");
                pokemon.setHp(pokemon.getHp() - temp);
                System.out.println(pokemon.getName() + " has " + pokemon.getHp() + "hp left");
                break;
            }
            case ("grass"): {
                temp = (int) (damage * 1.1);
                Math.round(temp);
                System.out.println(pokemon.getName() + " loses " + temp + "hp.");
                pokemon.setHp(pokemon.getHp() - temp);
                System.out.println(pokemon.getName() + " has " + pokemon.getHp() + "hp left");
                break;
            }
            case ("fire"): {
                temp = (int) (damage * 0.8);
                Math.round(temp);
                System.out.println(pokemon.getName() + " loses " + temp + "hp.");
                pokemon.setHp(pokemon.getHp() - temp);
                System.out.println(pokemon.getName() + " has " + pokemon.getHp() + "hp left");
                break;
            }
            case ("electric"): {
                temp = (int) (damage * 0.5);
                Math.round(temp);
                System.out.println(pokemon.getName() + " loses " + temp + "hp.");
                pokemon.setHp(pokemon.getHp() - temp);
                System.out.println(pokemon.getName() + " has " + pokemon.getHp() + "hp left");
                break;
            }
        }
    }

    public void thunderPunch(Pokemon pokemon, Pokemon enemy) {
        int damage = (int) (Math.random() * (50 - 30) + 30);

        if (isPlayer) {
            System.out.println(pokemon.getName() + " attacks " + enemy.getName() + " with thunderpunch.");
            trainerPokemon(pokemon, enemy, damage);
            isPlayer = false;
        }
        else {
            System.out.println(enemy.getName() + " attacks " + pokemon.getName() + " with thunderpunch.");
            enemyPokemon(enemy, pokemon, damage);
            isPlayer = true;
        }
    }

    public void electroBall(Pokemon pokemon, Pokemon enemy) {
        int damage = (int) (Math.random() * (80 - 10) + 10);

        if (isPlayer) {
            System.out.println(pokemon.getName() + " attacks " + enemy.getName() + " with electroball.");
            trainerPokemon(pokemon, enemy, damage);
            isPlayer = false;
        }
        else {
            System.out.println(enemy.getName() + " attacks " + pokemon.getName() + " with electroball.");
            enemyPokemon(enemy, pokemon, damage);
            isPlayer = true;
        }
    }


    public  void voltTackle(Pokemon pokemon, Pokemon enemy) {
        int damage = (int) (Math.random() * (0) + 0);

        if (isPlayer == true) {
            System.out.println(pokemon.getName() + " attacks " + enemy.getName() + " with volttackle.");
            if (enemy.getType() == "electric") {
                enemy.setHp(+10);
            }
            else if (pokemon.getType() == "electric"){
                pokemon.setHp(+10);
            }

            else {            }
            trainerPokemon(pokemon, enemy, damage);
            isPlayer = false;
        }
        else {
            System.out.println(enemy.getName() + " attacks " + pokemon.getName() + " with volttackle.");
            if (enemy.getType() == "electric") {
                enemy.setHp(+10);
            }
            else if (pokemon.getType() == "electric") {
                pokemon.setHp(+10);
            }
            else {}
            enemyPokemon(enemy, pokemon, damage);
            isPlayer = true;

        }
    }
    public void thunder (Pokemon pokemon, Pokemon enemy){
        int damage = (int) (Math.random() * (30 - 20) + 20);

        if (isPlayer) {
            System.out.println(pokemon.getName() + " attacks " + enemy.getName() + " with thunder.");
            trainerPokemon(pokemon, enemy, damage);
            isPlayer = false;
        }
        else {
            System.out.println(enemy.getName() + " attacks " + pokemon.getName() + " with thunder.");
            enemyPokemon(enemy, pokemon, damage);
            isPlayer = true;

        }
    }



}
