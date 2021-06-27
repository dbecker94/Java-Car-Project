/**
Final Project App
@authoror Daniel Becker
@date 4/30/2020
*/
import java.util.Scanner;
public class CarApplication
{ //Start class
   public static void main(String args[])
	{//Start Main
   //local variables 
    int year = 0;
    double price = 0.0;
    double salary = 0.0;
    String brand = "";
    String color = "";
    String model = "";
    char cont = ' ';
    int count = 1;
    
    Scanner kb = new Scanner(System.in);
    
    do {
     System.out.println("Enter Your Salary: ");
     salary = kb.nextDouble();
     kb.nextLine();  
     System.out.println("Enter Car Price: ");
     price = kb.nextDouble();
     kb.nextLine();
     System.out.println("Enter The Brand: ");
     brand = kb.nextLine();
     System.out.println("Enter The Model: ");
     model = kb.nextLine();
     System.out.println("Enter The Color: ");
     color = kb.nextLine();
     System.out.println("Enter Your Year: ");
     year = kb.nextInt();
     kb.nextLine();

   //Instanatiate Objects
   Car Car1;
   Car Car2;
   //default constructor
   Car1 = new Car();
   //overloaded constructor
   Car2 = new Car("Toyota", "Red", "Rav4", 2018, 28500.0);

   //Setters and getters to modify
   Car1.setBrand(brand);
   Car1.setColor(color);
   Car1.setModel(model);
   Car1.setYear(year);
   Car1.setPrice(price);
   
   //display on screen
   System.out.println("-----------");
   System.out.println("Vehicle " + count);
   Car1.printCarData(); // call printCarData()
   calcAffordCar(salary, Car1); //call calcAffordCar
   Car1.newCar(); //cal newCar()
   System.out.println("------------");
   
   // Determine if user has another car to enter
   System.out.println("Another Car? ");
   cont = kb.nextLine().toUpperCase().charAt(0);
   count = count + 1;
   }while(cont =='Y'); //end of do while
  
   }//End Main
   
 public static void calcAffordCar(double asalary, Car carN)
   { //Start calcAffordCar()
    double affordable = 0.0;
    double price = 0.0;
    affordable = asalary / 2; // calculate affordable
    price = carN.getPrice();
    if (price <= affordable)
    System.out.println("You Can Afford The Car");
    else
    System.out.println("You Cannot Afford The Car");
   } //end calcAffordCar()

}//End Class