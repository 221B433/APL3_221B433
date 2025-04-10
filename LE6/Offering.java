abstract class Offering{
    abstract int getPrice();
    abstract string getName();
}
class coffee extends Offerring{
    int getPrice(){
        return 30;
    }
    string getName(){
        return Offering.getPrice() +55;
    }
}