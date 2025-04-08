public class CharacterFactory {
    public static Character createCharacter(String type, String name) {
        if (type.equals("Wizard")) {
            return new Wizard(name);
        }  else if (type.equals("Warrior")) {
            return new Wizard(name);
        }
        return null;
    }
}

