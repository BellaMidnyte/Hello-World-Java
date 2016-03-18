/*
 * File Name: LearnClass And Object
 * Aurhor: Boyeno Kun
 * Course: Youtube, Java For Beginners
 */
package Chapt9;

import java.util.*;

/**
 *Exercise 1): A car has a certain fuel efficiency or mileage and a certain amount of fuel in the gas tank; initial fuel level is 0.
 *Simulate the action driving a real life care for a certain distance, which will reduce the amount of gasoline in cars fuel tank.
 *Find the current fuel level in the car's gas tank and fill the cars gas tank. Be sure to take into consideration the car's mileage.
 * @author Boyenoh
 */
public class LearnClassesAndObject {
        public static void main (String[] args){
            //Car myCar;
            //myCar = new Car();
           //myCar.fuelCapacity = 20;
            //myCar.amountOfFuel=12;
            //myCar.addGass(2000);
            //System.out.println("There is " +myCar.amountOfFuel+ " liters of gas in your tank." );
            //myCar.mileage = 32;
            //myCar.drive(30);
            System.out.println("How many games would you like to play?");
            System.out.println("You may choose to play upto 5 times, please enter any number from 1 to 5.");
            System.out.println("Program will terminate after the second invalid entry.");
            Scanner input = new Scanner (System.in);
            int answer = input.nextInt();
            int limit1 = 1; int limit2 = 5;
            Person girl = new Person("vivz", "R2D2", false);
            girl.inputTest(answer, limit1, limit2);
            girl.display();
            Person boy = new Person("vic", "R2D2", false);
            boy.display();  
        }
}
class Person {
    String firstName;
    String lastName;
    int age;
    boolean test;
    
    Person(String f, String l, boolean t){
        //System.out.println("Constructor was called");   
        firstName=f; lastName = l; test = t;
    }
    
    public void display(){
        int number = 0;
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(age);
        System.out.println(test);
        if (firstName != null){
            System.out.println(firstName.length());
        }
    }

    public void inputTest(int a, int i, int j){
        int k = 0;
        while (a < i || a > j){
            System.out.println("Error, you're entry exceeds the play limit of " +j+ " .");
            System.out.println("Please try again.");
            Scanner input = new Scanner (System.in);
            a = input.nextInt();
            k++;
            if(k > 1){
                System.out.println("Program terminated. Goodbye!");
                System.exit(0);
            }
        }
        return;
    }
    //instance variable are accessible inside every method except static methods    
    //standard local variable are accessible withing the method in which they are delcared
    
    public void test(){
        System.out.println(firstName);
    }
    
}
class Car {
    double mileage;
    double amountOfFuel;
    double fuelCapacity;
        
    //After user is prompted for desired distance car will drive; the required fuel for trip is calculated
    //If current fuel level is sufficient, the trip allowed to proceed and the amount of fuel in car's tank 
    //is reduced accordingly. If current fuel level is insufficient the user is instructed to nearest gas station
    // and is  provided with amount of fuel required to complete the trip.
    public void drive(double distance){
            double fuelNeeded = distance/ mileage; //mileage is kilometers per liters
            if (amountOfFuel >= fuelNeeded){
                amountOfFuel = amountOfFuel - fuelNeeded;
                System.out.println("You travelled " +distance+ " kilometers");
            }
            else {
                System.out.println("Gas is not sufficient to complete the trip");
            }
    }
        
        //Car's initial fuel level is 10L, it's fuel capacity is 15L.
        // method finds the remaining capacity in car's fuel tank and determines if amount of 
        //fuel being addded exceeds the car's fuel tank capacity. If no fill the car's fuel tank 
        //with the amount specified, if yes fill only the amount to necessary to fill the car's fuel tank.
    public void addGass(double amount){
        double emptySpace = fuelCapacity - amountOfFuel;
        if (amount < emptySpace){
            amountOfFuel = amountOfFuel + amount; // 25liters, 10 liters
            System.out.println(amount+ "liters of gas was added successfully!");
        }
        else {
            amountOfFuel = fuelCapacity;
            System.out.println("Your gas tank is now full!");
        }
    }
       
    public double getFuelLevel(){  
        return amountOfFuel;
    }
}

