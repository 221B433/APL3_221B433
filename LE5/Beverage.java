class Beverage {
    void pour(int qty) {
        System.out.println("Add "qty" ml of beverage");
    }
     protected void addCondiment()
     
     protected void stir() {} //hook
     private void serve() {
         System.out.println("serve through water");
     }
     public void templateMethod (int qty) {
         pour(qty);
         addCondiment();
         stir();
         serve();
     }
}