
public static void main(String args[])
{
One obj1 = new One("Varsha");
/* passing the object as an argument for the constructor 
* this will invoke the copy constructor
*/
One obj2 = new One(obj1);
System.out.println("Printing obj1 - ");
obj1.display();
System.out.println("Printing obj2 - ");
obj2.display();
}