/*
Local Class Accessing Local Variables:
Write a Java program to create a class called House with a method calculateArea().
Inside this method, define a local class Room with a method getArea()
that calculates and returns the area of the room (length * width). 
Instantiate the Room class and call the getArea() method from within calculateArea().
*/

// Class House
public class House {

    // Method calculateArea to calculate the area of a room
    public void calculateArea() {
        // Local variables for length and width of the room
        final double length = 12.5;
        final double width = 7.0;

        // Local class Room inside the calculateArea method
        class Room {

            // Method getArea to calculate and return the area of the room
            public double getArea() {
                return length * width;
            }
        }

        // Instantiating the local class Room
        Room room = new Room();
        
        // Calling the getArea method and printing the area
        double area = room.getArea();
        System.out.println("Area of the room: " + area);
    }

    // Main method to demonstrate the usage of local class
    public static void main(String[] args) {
        // Creating an instance of House and calling calculateArea method
        House house = new House();
        house.calculateArea();
    }
}
