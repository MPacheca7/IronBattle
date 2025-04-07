import java.sql.SQLOutput;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;


public class Wizard extends Character {
    private int mana;//random ente 10-50
    private int intelligence; //random entre 10-50

    public Wizard(String name, int hp, int mana, int intelligence) {
        super(name, hp);
        setMana();
        setIntelligence();
        }
    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = ThreadLocalRandom.current().nextInt(10, 51);
        //este método asignará un valor aleatorio
        //ThreadLocalRandom.current() genera nums aleatorios
        //nextInt(10, 51) esto es que los genera en el rango 10-50, 51 es exclusivo
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = ThreadLocalRandom.current().nextInt(10, 51);
    }
    //@Override
    public void attack(Character character) {
    //this reduces that character's health based on the intelligence spell
    }
    //mirar notas d realizar ataques random
    //primero crear ataque fireball y staff hit y luego atque aleatorio

}

public static void main(String[] args) {

}