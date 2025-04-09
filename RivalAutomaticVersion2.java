public class RivalAutomaticVersion2 {

    /*
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
     */
}
