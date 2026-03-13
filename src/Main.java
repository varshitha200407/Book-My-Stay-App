/**
 * Book My Stay - Hotel Booking Management System
 *
 * This class represents the entry point of the application.
 * It demonstrates how a Java program starts execution using
 * the main() method and prints a welcome message to the console.
 *
 * @author Student
 * @version 1.0
 */
public class UseCase1HotelBookingApp {

    /**
     * Main method – Entry point of the Java application.
     * The JVM invokes this method when the program starts.
     *
     * @param args Command line arguments (not used in this example)
     */
    public static void main(String[] args) {

        // Display welcome message
        System.out.println("=================================");
        System.out.println("   Welcome to Book My Stay App   ");
        System.out.println("   Hotel Booking System v1.0     ");
        System.out.println("=================================");

        // Inform user that application has started successfully
        System.out.println("Application started successfully.");
        System.out.println("Thank you for using Book My Stay!");

    }
}
/**
 * Abstract Room class representing common properties of all rooms.
 *
 * @author Student
 * @version 2.0
 */
public abstract class Room {

    protected String roomType;
    protected int numberOfBeds;
    protected int size;
    protected double price;

    /**
     * Constructor to initialize common room attributes
     */
    public Room(String roomType, int numberOfBeds, int size, double price) {
        this.roomType = roomType;
        this.numberOfBeds = numberOfBeds;
        this.size = size;
        this.price = price;
    }

    /**
     * Method to display room details
     */
    public void displayRoomDetails() {
        System.out.println("Room Type: " + roomType);
        System.out.println("Beds: " + numberOfBeds);
        System.out.println("Size: " + size + " sq.ft");
        System.out.println("Price per Night: $" + price);
    }
}
/**
 * Represents a Single Room type.
 *
 * @author Student
 * @version 2.0
 */
public class SingleRoom extends Room {

    public SingleRoom() {
        super("Single Room", 1, 200, 100.0);
    }
}
/**
 * Represents a Double Room type.
 *
 * @author Student
 * @version 2.0
 */
public class DoubleRoom extends Room {

    public DoubleRoom() {
        super("Double Room", 2, 350, 180.0);
    }
}
/**
 * Represents a Suite Room type.
 *
 * @author Student
 * @version 2.0
 */
public class SuiteRoom extends Room {

    public SuiteRoom() {
        super("Suite Room", 3, 500, 300.0);
    }
}
/**
 * Book My Stay App
 * Demonstrates initialization of room types and static availability.
 *
 * @author Student
 * @version 2.1
 */
public class UseCase2RoomInitialization {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println("     Book My Stay - Version 2.1      ");
        System.out.println("  Room Types & Static Availability   ");
        System.out.println("=====================================");

        // Creating room objects (Polymorphism)
        Room singleRoom = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suiteRoom = new SuiteRoom();

        // Static availability variables
        int singleRoomAvailable = 5;
        int doubleRoomAvailable = 3;
        int suiteRoomAvailable = 2;

        System.out.println("\n--- Room Details ---");

        singleRoom.displayRoomDetails();
        System.out.println("Available Rooms: " + singleRoomAvailable);
        System.out.println();

        doubleRoom.displayRoomDetails();
        System.out.println("Available Rooms: " + doubleRoomAvailable);
        System.out.println();

        suiteRoom.displayRoomDetails();
        System.out.println("Available Rooms: " + suiteRoomAvailable);

        System.out.println("\nApplication terminated successfully.");
    }
}