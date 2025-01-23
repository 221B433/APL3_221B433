class child extends another {
    @Override void move()
    { // move method from Base class is overriden in this
      // method
        System.out.println("Dog is running.");
    }
    void bark() { System.out.println("Dog is barking"); }
}