public class Battle {
    private Character p1;
    private Character p2;

    public Battle(Character p1, Character p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public void StartingBattle() {
        int round = 1;

        while(true){
            System.out.println("Round: " + round);

            int countDamage1 = IAttacker.damage1; // Usamos el ataque aleatorio de la interfaz
            int countDamage2 = IAttacker.damage2;

            System.out.println(p1.getName() + " attacks, and does " + countDamage1 + " of damage"); // nos dice cuanto ataque tiene
            System.out.println(p2.getName() + " attacks, and does " + countDamage2 + " of damage");

            p1.setHp(p1.getHp() - countDamage1); // Resta el ataque - vida
            p2.setHp(p2.getHp() - countDamage2);

            System.out.println(p1.getName() + " has " + p1.getHp() + " of HP");
            System.out.println(p2.getName() + " has " + p2.getHp() + " of HP");
            break;

        }

    }
}
