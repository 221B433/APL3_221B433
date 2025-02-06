public class Main {

    public static void demonstrate(Bharatvanshi character) {
        character.fight();
        character.obey();
        character.kind();
    }

    public static void main(String[] args) {

        // Create instances
        Bharatvanshi arjun = new Arjun();
        Bharatvanshi bheem = new Bheem();
        Bharatvanshi vikarn = new Vikarn();

        // Demonstrate the behaviors
        System.out.println("Arjun:");
        demonstrate(arjun);

        System.out.println("\nBheem:");
        demonstrate(bheem);

        System.out.println("\nVikarn:");
        demonstrate(vikarn);
    }
}
