import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws IOException {

    Character player1 = CharacterFactory.createPlayer1();
    Character player2 = AutomaticBattle.getRival(); //player2, es el rival automático

    Scanner myScanner = new Scanner(System.in);
    System.out.println("The battle is about to begin. Please, press any key and press enter");
    myScanner.nextLine();

    /*Warrior player1 = new Warrior("Aragorn");
    Wizard player2 = new Wizard("Gandalf");*/
    Battle battle = new Battle(player1, player2); // Conecta con la clase Battle
        battle.StartingBattle();
    }
}
