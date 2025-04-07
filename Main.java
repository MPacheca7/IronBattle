public class Main {
    public static void main(String[] args) {
        // Players
        Warrior player1 = new Warrior("Aragorn",150, 100, 70);
        Wizard player2 = new Wizard("Gandalf",150, 100, 70);

        //Battle
        Battle battle = new Battle(player1, player2);

        battle.StartingBattle(); // Llama a la ronda 1
    }
}
