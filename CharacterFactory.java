import java.lang.Character;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class CharacterFactory {

    public static Character createPlayer1(){
        //con scanner
        var myScanner = new Scanner(System.in);
        //para el tipo
        System.out.println("To start the battle, first choose your character type. To select a wizard, write 1; if you want to be a warrior, write 2: ");
        //no me está dejando hacer %n para añadir línea
        var userInput = myScanner.nextInt();
        String chosenType;
        if (userInput == 1) {
            chosenType = "Wizard";
        } else if (userInput == 2) {
            chosenType = "Warrior";
        } else {
            chosenType = "Wizard";
            System.out.println("You choosed wrong, so you were asigned a wizard character randomly");//refactorizar a dowhile para volver a la pregunta
        }

        myScanner.nextLine();//para volver a introducir
        //para el nombre
        System.out.println("Choose a name for your new " + chosenType + ": ");
        String chosenName = myScanner.nextLine();
        System.out.println("Hi " + chosenName + ", welcome");

        Character player3;
        if (chosenType.equals("Wizard")) {
            player3 = new Wizard(chosenName);
            Wizard wizardPlayer = (Wizard) player3; //casting a esta clase
            System.out.println("You have " + wizardPlayer.getHp() + "HP, " + wizardPlayer.getMana() + " of Mana, and " + wizardPlayer.getIntelligence() + " Intelligence");
        } else {
            player3 = new Warrior(chosenName);
            Warrior warriorPlayer = (Warrior) player3;
            System.out.println("You have " + warriorPlayer.getHp() + "HP, " + warriorPlayer.getStamina() + " of Stamina, and " + warriorPlayer.getStrength() + " Strength");
        }
        System.out.println("To find a rival for the battle, please write any text in the console");
        myScanner.nextLine();
    }
    //este es el personaje 2, el rival, que se crea automático
    public static Character createPlayer2(String type, String name) {
        //Character rival = null;
        if (type.equals("Wizard")) {
            Wizard wizard = new Wizard(name);
            System.out.println("Your rival is the Wizard " + wizard.getName() +
                    " with " + wizard.getHp() + "HP, " + wizard.getMana() + " Mana, " + wizard.getIntelligence() + " Intelligence.");
            return wizard;
        }  else if (type.equals("Warrior")) {
            Warrior warrior = new Warrior(name);
            System.out.println("Your rival is the Warrior " + warrior.getName() +
                    " with " + warrior.getHp() + "HP, " + warrior.getStamina() + " Stamina, " + warrior.getStrength() + " Strength.");
            return warrior;
        }
        return null;
    }
}

