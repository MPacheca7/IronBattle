public class Main {
    public static void main(String[] args) {
        // Players
        Warrior player1 = new Warrior("Aragorn");
        Wizard player2 = new Wizard("Gandalf");

        Battle battle = new Battle(player1, player2); // Conecta con la clase Battle
        battle.StartingBattle();
    }
}
