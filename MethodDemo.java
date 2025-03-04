public class MethodDemo {
    
    // Method to greet
    public static void greet() {
        System.out.println("Hello from the greet method!"); 
    }

    // Method to print a message
    public static void printMessage(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {
        // Calling methods
        greet();
        printMessage("This is my message!");
    }
}
