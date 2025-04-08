import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Players
        Warrior player1 = new Warrior("Aragorn");
        Wizard player2 = new Wizard("Gandalf");

        System.out.println(player1.getName() + " vs " + player2.getName());
        System.out.println("The Warrior " + player1.getName() + " is " + player1.getHp() + "HP, " +  player1.getStamina() + " of Stamina, and " + player1.getStrength() + " Strength");
        System.out.println("The Wizard " + player2.getName() + " is " + player2.getHp() + "HP, " +  player2.getMana() + " of Mana, and " + player2.getIntelligence() + " Intelligence");
        //Battle
        Battle battle = new Battle(player1, player2);

        battle.StartingBattle(); // Llama a la ronda 1

        //con scanner
        var myScanner = new Scanner(System.in);
        //para el tipo
        System.out.println("To start the battle, first choose your warrior type. To select a wizard, write 1; if you want to be a warrior, write 2: ");
        //no me está dejando hacer %n para añadir línea
        if (myScanner.nextInt() == 1) {
            String chosenType = "Wizard";
        } else if (myScanner.nextInt() == 2) {
            String chosenType = "Warrior";
        } else {
            System.out.println("Please, select between option 1 or option 2");
        }
        String chosenType = myScanner.nextLine();

        //para el nombre
        System.out.println("Choose a name for your new " + chosenType + ": ");
        String chosenName = myScanner.nextLine();
        System.out.println("Hi " + chosenName + ", welcome");

    }
}
