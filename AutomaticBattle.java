import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;

public class AutomaticBattle {
    public static void main(String[] args) throws IOException {

        //aqui escribimos tipos y nombres aleatorios en el cvs

        FileWriter randomAttackers = new FileWriter("automatic-battle.cvs", true);
        String randomType;
        String randomName;

        for (int i=0; i<20; i++) {
            randomType = "random";
            randomName = "random";
            randomAttackers.write("\""+ randomType+"\""+ "\""+ randomName+"\"\n");
        }

        //Choose battle (esto hay que integrar con Irene en main
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write A for automatic battle");

        String gameMode = scanner.nextLine() ;
        if (gameMode.equals("A")) {
            System.out.println("You choose automatic battle mode. Selecting random attackers... Battle will start soon, please wait.");
        }

        //Leer del archivo csv

        File automaticBattleChar = new File("automatic-battle.cvs");
        scanner = new Scanner(automaticBattleChar);

        while(scanner.hasNextLine()){
            scanner.nextLine();
            //recuperar typo y nombre por separado
        }

        //cerramos los scanners
        randomAttackers.close();
        scanner.close();

//        while (fileReader.hasNextLine()) {
//            String line = fileReader.nextLine();
//            if (!line.isEmpty() && !line.startsWith("\"Index\"") && !line.startsWith("<")) {
//                String[] fields = line.split(",");
//                year = fields[1];
//                age = fields[2];
//                name = fields[3];
//                movie = fields[4];
//
//                MoviesData.write(
//                        "Name: " + name +
//                                "\nYear: " + year +
//                                "\nAge: " + age +
//                                "\nMovie: " + movie +
//                                "\n==============\n");
//                System.out.println("Pelicula impresa");
//            }
//        }
    }
}
