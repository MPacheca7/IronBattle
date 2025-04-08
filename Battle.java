public class Battle  {
    private Warrior player1;
    private Wizard player2;

    public Battle(Warrior player1, Wizard player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void StartingBattle () {

        System.out.println(player1.getName() + " \uD83D\uDD25vs\uD83D\uDD25 " + player2.getName() + ":");
        System.out.println("-The Warrior " + player1.getName() + " is " + player1.getHp() + "HP, " +  player1.getStamina() + " of Stamina, and " + player1.getStrength() + " Strength");
        System.out.println("-The Wizard " + player2.getName() + " is " + player2.getHp() + "HP, " +  player2.getMana() + " of Mana, and " + player2.getIntelligence() + " Intelligence");

        //Battle
        int round1 = 1;
        int round2 = 2;


        while(true){
            System.out.println("\nRound: " + round1);

            player1.attack(player2); //Ataca Warrior
            System.out.println("Wizard has: " + player2.getHp() + " health left\n"); //Imprime la vida de Wizard

            System.out.println("Wizard strike back ------");
            player2.attack(player1); // Ataca Wizard
            System.out.println("Warrior has: " + player1.getHp() + " health left\n"); // Imprime la vida de Warrior

            System.out.println("\nRound: " + round2);

            System.out.println("The characters starting the round second with: ");

            // Imprime la vida que les queda
            System.out.println(player1.getName() + " is " + player1.getHp() + " HP");
            System.out.println(player2.getName() + " is " + player2.getHp() + " HP\n");

            System.out.println("Start the round\uD83D\uDD25");

            player2.attack(player1); // Ataca Wizard
            System.out.println("Warrior has: " + player1.getHp() + " health left\n"); // Imprime la vida de Warrior

            player1.attack(player2); //Ataca Warrior
            System.out.println("Wizard has: " + player2.getHp() + " health left\n"); //Imprime la vida de Wizard

            int winner1 = player1.getHp();
            int winner2 = player2.getHp();

            if ((winner1 > winner2)) {
                System.out.println("\n🏆 ¡Ganador: " + player1.getName() + "!");
            } else if ((winner2 < winner2) ) {
                System.out.println("\n🏆 ¡Ganador: " + player2.getName() + "!");
            } else {
                System.out.println("Draw!");
            }

            break;
        }

    }



}
