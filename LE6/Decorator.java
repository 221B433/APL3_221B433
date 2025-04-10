abstract class Decorator extends Offering{
    Rum(Offering offering){
        this.offering = offering;
    }
    string getName() {
        return offering.getName()+"with Rum";
    }
    int getPrice() {
        return offering.getPrice() + 55;
    }
}