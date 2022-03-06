import java.util.Scanner;
import javax.swing.JOptionPane;

public class practice {
    public static void main(String[] args) {
        System.out.print("Hello"); // prints line
        System.out.println("World"); // prints line with line break(\n)
        System.out.println("Hello \t World"); // prints line with tab
        System.out.println("\"World\""); // prints string with double quotes

        int x; // declaration
        x = 5; // assignment
        int y = 10; // initialization
        double symbol = 3.14; // decimal numbers
        boolean b = true; // boolean (true or false)
        char c = 'a'; // character (single quotes)
        String s = "Hello"; // string (double quotes)
        System.out.println(x + "\n" + y + "\n" + symbol + "\n" + b + "\n" + x + "\n" + c + "\n" + s); // prints all
                                                                                                      // variables

        // Swap 2 variables
        int x1 = 5;
        int y1 = 10;
        int temp;
        temp = x1;
        x1 = y1;
        y1 = temp;
        System.out.println("x1: " + x1 + "\ny1: " + y1);

        // Take input from user

        /*
         * Scanner scanner = new Scanner(System.in);
         * System.out.println("Enter your name : ");
         * String name = scanner.nextLine();
         * System.out.println("Hello " + name);
         * 
         * System.out.println("Enter your age : ");
         * int age = scanner.nextInt();
         * System.out.println("You are " + age + " years old");
         * 
         * scanner.nextLine(); // clear buffer(/n)
         * 
         * System.out.println("Enter your favourite food : ");
         * String food = scanner.nextLine();
         * 
         * System.out.println("Your favourite food is " + food);
         */
        // Expressions

        int a = 10;
        a = a + 5;
        System.out.println(a);

        a = a / 3;
        System.out.println(a);

        a = a % 3;
        System.out.println(a);

        // GUI

        String name2 = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello " + name2);

        int age2 = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: "));
        JOptionPane.showMessageDialog(null, "You are " + age2 + " years old");

        // Math class

        double x3 = 10;
        double z1 = Math.sqrt(x3);
        double z2 = Math.max(x3, z1);
        double z3 = Math.abs(-10);
        // Other - Math.pow(x,y), Math.random(), Math.ceil(), Math.floor(), Math.round()

        
    }
}
