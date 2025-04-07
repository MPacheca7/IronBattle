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
    }
}
