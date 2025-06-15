//DEMONSTRATING CLASSES

// Defines a class named 'Dog'
// class Program3 {
//     // Instance variables (data members)
//     String name;
//     String breed;
//     int age;

//     // Constructor to initialize the object
//     public Program3(String name, String breed, int age) {
//         this.name = name;
//         this.breed = breed;
//         this.age = age;
//     }

//     // Method to display dog's information
//     public void displayInfo() {
//         System.out.println("Name: " + name);
//         System.out.println("Breed: " + breed);
//         System.out.println("Age: " + age);
//     }

//     // Method to simulate barking
//     public void bark() {
//         System.out.println("Woof!");
//     }
// }

// // Main class to demonstrate the Dog class
// public class Main {
//     public static void main(String[] args) {
//         // Creating objects of the Dog class
//        Program3 dog1 = new Program3("Buddy", "Golden Retriever", 3);
//        Program3 dog2 = new Program3("Bella", "Labrador", 5);

//         // Calling methods on the objects
//         System.out.println("Dog 1 Information:");
//         dog1.displayInfo();
//         dog1.bark();

//         System.out.println("\nDog 2 Information:");
//         dog2.displayInfo();
//         dog2.bark();
//     }
// }


//INHERITANCE



// Java program to illustrate the
// concept of inheritance

// base class
// class Program3  {
//     // the Bicycle class has two fields
//     public int gear;
//     public int speed;

//     // the Bicycle class has one constructor
//     public Program3 (int gear, int speed)
//     {
//         this.gear = gear;
//         this.speed = speed;
//     }

//     // the Bicycle class has three methods
//     public void applyBrake(int decrement)
//     {
//         speed -= decrement;
//     }

//     public void speedUp(int increment)
//     {
//         speed += increment;
//     }

//     // toString() method to print info of Bicycle
//     public String toString()
//     {
//         return ("No of gears are " + gear + "\n"
//                 + "speed of bicycle is " + speed);
//     }
// }

// // derived class
// class MountainBike extends Program3  {

//     // the MountainBike subclass adds one more field
//     public int seatHeight;

//     // the MountainBike subclass has one constructor
//     public MountainBike(int gear, int speed,
//                         int startHeight)
//     {
//         // invoking base-class(Bicycle) constructor
//         super(gear, speed);
//         seatHeight = startHeight;
//     }

//     // the MountainBike subclass adds one more method
//     public void setHeight(int newValue)
//     {
//         seatHeight = newValue;
//     }

//     // overriding toString() method
//     // of Bicycle to print more info
//     @Override public String toString()
//     {
//         return (super.toString() + "\nseat height is "
//                 + seatHeight);
//     }
// }

// // driver class
// public class Test {
//     public static void main(String args[])
//     {

//         MountainBike mb = new MountainBike(3, 100, 25);
//         System.out.println(mb.toString());
//     }
// }


//OVERRIDING

// Example of Overriding in Java
class Animal {
    // Base class
    void move() { System.out.println(
      "Animal is moving."); }
    void eat() { System.out.println(
      "Animal is eating."); }
}

class Dog extends Animal {
    @Override void move()
    { // move method from Base class is overriden in this
      // method
        System.out.println("Dog is running.");
    }
    void bark() { System.out.println("Dog is barking."); }
}

public class Program3 {
    public static void main(String[] args)
    {
        Dog d = new Dog();
        d.move(); // Output: Dog is running.
        d.eat(); // Output: Animal is eating.
        d.bark(); // Output: Dog is barking.
    }
}

