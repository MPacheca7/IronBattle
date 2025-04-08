import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Random;

public class AutomaticBattle {
    public static Character getPlayer() throws IOException {
      newRandomRivals();

      Character randomPlayer = null;
      File automaticBattleChar = new File("automatic-battle.csv");
      Scanner scanner = new Scanner(automaticBattleChar);

      String randomLine = scanner.nextLine();
      if (!randomLine.isEmpty() && scanner.hasNextLine()) {
          String[] fields = randomLine.split(", ");
          String type = fields[0];
          String name = fields[1];
          System.out.println(type);
          System.out.println(name);
          randomPlayer = CharacterFactory.createCharacter(type, name);
      }
      scanner.close();
      return randomPlayer;
    }

    public static void newRandomRivals() throws IOException {
        FileWriter randomAttackersFile = new FileWriter("automatic-battle.csv");
        String randomType;
        String randomName;

        for (int i=0; i<10; i++) {
            randomType = randomizeType();
            randomName = randomizeName();
            randomAttackersFile.write(randomType + ", " + randomName + "\n");
        }
        randomAttackersFile.close();
    }

    private static String randomizeName() {
        Random random = new Random();
        String[] names= {"Elden", "Aragorn", "Thor", "Thrall", "Lunnaris", "Galadriel", "Gandalf"};
        return names[random.nextInt(names.length)];
    }

    private static String randomizeType() {
        Random random = new Random();
        String[] types= {"Warrior", "Wizard"};
        return types[random.nextInt(types.length)];
    }
}
