public class Application{
    public static void main(String args[]){
        
        Crow crow = new IndianCrow();
        CrowAdapter.crowadapter=new CrowAdpater(crow);
        client(CrowAdapter);
    }
    public static void client(swan swan){
        swan.eat();
        swan.swim();
        swan.sing();
    }
}