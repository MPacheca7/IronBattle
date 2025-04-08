import java.util.concurrent.ThreadLocalRandom;

public class Warrior extends Character {
    private int stamina;
    private int strength;

    public Warrior(String name) {
        super(name, ThreadLocalRandom.current().nextInt(100, 201));
        setStamina();
        setStrength();
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina() {
        this.stamina = ThreadLocalRandom.current().nextInt(10, 51);
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength() {
        this.strength = ThreadLocalRandom.current().nextInt(1, 11);
    }
//Method that overload attack() implemented in the Attacker interface
    public void attack( Character character) {
        int rivalHealth = character.getHp(); //hay que revisar que esta vida se reste a la vida del personaje en la variable original ¿static?
        String chosenAttack = randomAttack();
        if (chosenAttack.equals("heavy attack") && stamina >= 5) {
            //HEAVY ATTACK
            rivalHealth -= strength;
            stamina -=5;
            System.out.println("Warrior attack his opponent and reduce his health in "+ strength + "points. HEAVY ATTACK. ");
        } else if (chosenAttack.equals("weak attack") && stamina > 0) {
            //WEAK ATTACK
            rivalHealth -= strength/2;
            stamina +=1;
            System.out.println("Warrior attack his opponent and reduce his health in "+ strength/2 + "points. WEAK ATTACK. ");
        } else {
            //NO ATTACK
            stamina += 2;
            System.out.println("Warrior has no enough stamina so he can´t attack this round.");
        }
    }

    private String randomAttack (){
        String[] attacks = {"heavy attack", "weak attack"};
        return attacks[ThreadLocalRandom.current().nextInt(attacks.length)];
    }
 }
