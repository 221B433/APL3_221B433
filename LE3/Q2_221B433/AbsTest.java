abstract class AbsTest implements Testable {
    // Abstract class does not provide an implementation of the display() method
    // It just implements the Testable interface
}

class ConcreteTest extends AbsTest {
    // Providing the implementation for the display() method
    @Override
    public void display() {
        System.out.println("Display method in ConcreteTest class.");
    }

    public static void main(String[] args) {
        ConcreteTest ct = new ConcreteTest();  // Creating an object of ConcreteTest
        ct.display();  // Calling the display method
    }
}
