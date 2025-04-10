public class Main{
    public static void main(string[] args) {
        Offering offering = new Coffee();
        offering = new Gin(offering);
        offering = new Gin(offering);
        
        System.out.println("Offering:" offering.getName()+offering.getPrice());
        System.out.println("Offering:" offering.getName()+offering.getPrice());
}