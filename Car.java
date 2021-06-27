/**
Final Project Class
@author Daniel Becker
@date 4/30/2020
*/
public class Car
{
 //-----private attribute-----
private String brand;
private String color;
private String model;
private int year;
private double price;
 //-----------methods---------
  //default constructor
public Car()
   {
    brand = "";
    color = "";
    model = "";
    year = 0;
    price = 0.0;
   }
   //overloaded constructor
public Car(String abrand, String acolor, String amodel, int ayear, double aprice)
   {
   brand = abrand;
   color = acolor;
   model = amodel;
   final int CURRENT_YEAR = 2020;
   final double MAX_PRICE = 1500000;
   if (ayear >= 1884 && ayear <= CURRENT_YEAR) 
    year = ayear;
   else {
    year = 0;
    System.out.println("Year must be within the range of 1884 and 2020");
    }

   if (aprice >= 1000 && aprice <= MAX_PRICE)
     price = aprice;
   else
    {
    price = 0;
    System.out.println("Price must be in the Range of 1000-1500000");
    }
   }
   //-----getters and setters----------
   public String getBrand()
   {
   return brand;
   }
   public String getColor()
   {
   return color;
   }
   public String getModel()
   {
   return model;
   }
   public int getYear()
   {
   return year;
   }
   public double getPrice()
   {
   return price;
   }
   public void setBrand(String abrand)
   {
   brand = abrand;
   }
   public void setColor(String acolor)
   {
   color = acolor;
   }
   public void setModel(String amodel)
   {
   model = amodel;
   }
   public void setYear(int ayear)
   {
    final int CURRENT_YEAR = 2020;
    if (ayear >= 1884 && ayear <= CURRENT_YEAR) 
     year = ayear;
    else
    {
     year = 0;
     System.out.println("Year must be within the range of 1884 and 2020");
    }
   }
   public void setPrice(double aprice)
   {
   final double MAX_PRICE = 1500000;
   if (aprice >= 1000 && aprice <= MAX_PRICE)
    price = aprice;
   else {
    price = 0;
    System.out.println("Price must be in the Range of 1000-1500000");
   }
   }
   
   public void newCar() 
   {//start newCar()
    final int CURRENT_YEAR = 2020;
    if(year == CURRENT_YEAR)
     System.out.println("The Car is New");
    else
     System.out.println("The Car is Not New");
   }//end newCar()
   
  public void printCarData()
  { //Start printCarData()
   System.out.println("Brand: " + brand);
   System.out.println("Color: " + color);
   System.out.println("Model: " + model);
   System.out.println("Year of Car: " + year);
   System.out.println("Price: " + "$" + price);
  } //end printCarData
} // end class
