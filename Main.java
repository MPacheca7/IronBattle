import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Players
        /*Warrior player1 = new Warrior("Aragorn");
        Wizard player2 = new Wizard("Gandalf");

        System.out.println(player1.getName() + " vs " + player2.getName());
        System.out.println("The Warrior " + player1.getName() + " is " + player1.getHp() + "HP, " + player1.getStamina() + " of Stamina, and " + player1.getStrength() + " Strength");
        System.out.println("The Wizard " + player2.getName() + " is " + player2.getHp() + "HP, " + player2.getMana() + " of Mana, and " + player2.getIntelligence() + " Intelligence");
        //Battle
        Battle battle = new Battle(player1, player2);

        //battle.StartingBattle(); // Llama a la ronda 1
        */


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

        //aquí importamos aleatoriamente un personaje del archivo csv
        ArrayList<String[]> rivalsList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("rivals.csv"))) {//actualizar, tener en cuenta que cada elemento tendrá que seguir un orden para el array, como Nombre, Tipo
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    rivalsList.add(parts);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading CSV: " + e.getMessage());
            return;
        }

        if (rivalsList.isEmpty()) {
            System.out.println("No rivals found in CSV.");
            return;
        }

        // Elegir rival aleatorio
        Random random = new Random();
        int index = random.nextInt(rivalsList.size());
        String[] rivalData = rivalsList.get(index);

        String rivalType = rivalData[0].trim();
        String rivalName = rivalData[1].trim();

        // Crear el rival según el tipo
        Character rival = null;
        if (rivalType.equalsIgnoreCase("Wizard")) {
            rival = new Wizard(rivalName);
            Wizard wiz = (Wizard) rival;
            System.out.println("Your rival is the Wizard " + wiz.getName() +
                    " with " + wiz.getHp() + "HP, " + wiz.getMana() + " Mana, " + wiz.getIntelligence() + " Intelligence.");
        } else if (rivalType.equalsIgnoreCase("Warrior")) {
            rival = new Warrior(rivalName);
            Warrior war = (Warrior) rival;
            System.out.println("Your rival is the Warrior " + war.getName() +
                    " with " + war.getHp() + "HP, " + war.getStamina() + " Stamina, " + war.getStrength() + " Strength.");
        } else {
            System.out.println("Unknown rival type: " + rivalType);
        }
        System.out.println("The battle is about to begin. Please, press any key and press enter");
        myScanner.nextLine();
        //Battle
        Battle battle = new Battle(player3, rival);

        //battle.StartingBattle(); // Llama a la ronda 1

    }
}
