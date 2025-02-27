public class Singleton{
    private static Singleton unique Instance;
    private Singleton() {}
    
    public static Singleton getUniqueInstance(){
        if(uniqueInstance ==  null){
            uniqueInstance = new Singleton();
            
        }
    }
}
    