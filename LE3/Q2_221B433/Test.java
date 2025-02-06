interface Testable {
    void display();  // Method declaration in interface
}

class Test implements Testable {
    // Implementing the display() method
    @Override
    public void display() {
        System.out.println("Display method in Test class.");
    }

    public static void main(String[] args) {
        Test t = new Test();  // Creating an object of the Test class
        t.display();          // Calling the display method
    }
}
