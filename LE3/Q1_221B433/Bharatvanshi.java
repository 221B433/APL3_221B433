// Abstract base class Bharatvanshi
abstract class Bharatvanshi {
    
    // Abstract method: Every Bharatvanshi is a fighter, so we define fight here.
    public abstract void fight();
    
    // Non-abstract method: Obey, we can provide a default behavior
    public void obey() {
        System.out.println("Bharatvanshi is obeying");
    }

    // Non-abstract method: Kindness, but can be overridden
    public void kind() {
        System.out.println("Bharatvanshi is kind");
    }
}