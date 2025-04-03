public class Warrior extends Character {
    private int stamina;
    private int strength;

    public Warrior(String name, int hp, int strength, int stamina) {
        super(name, hp);
        this.strength = strength;
        this.stamina = stamina;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
//Method that overload attack() implemented in the Attacker interface
    public void attack( Character character) {
         int rivalHealth = character.hp - strength;
    }

 }
