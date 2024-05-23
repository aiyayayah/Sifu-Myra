
// This version of the program draws a square with show inside, showing all the stars//

// import java.util.Scanner;

// public class E1 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         while (true) {
//             // Prompt user for input
//             System.out.print("Enter a single integer value between 1 to 20 (or any other number to exit): ");
//             int size = scanner.nextInt();

//             // Check if input is out of range or illegal
//             if (size < 1 || size > 20) {
//                 System.out.println("Input value must be between 1 and 20. Exiting...");
//                 break;
//             }

//             // Draw square
//             drawSquare(size);
//         }

//         scanner.close();
//     }

//     // Method to draw square
//     public static void drawSquare(int size) {
//         for (int i = 0; i < size; i++) {
//             for (int j = 0; j < size; j++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }


// This version of the program draws a square with empty space inside, showing stars only on the sides. 
//Each side of the square consists of asterisks, while the interior is left blank. //

import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Prompt user for input
            System.out.print("Enter a single integer value between 1 to 20 (or any other number to exit): ");
            int size = scanner.nextInt();

            // Check if input is out of range or illegal
            if (size < 1 || size > 20) {
                System.out.println("Input value must be between 1 and 20. Exiting...");
                break;
            }
            fshdsfh
            gvygvhbknkm

            // Draw square
            drawSquare(size);
        }

        scanner.close();
    }

    // Method to draw square
    public static void drawSquare(int size) {
        // Print top side
        for (int i = 0; i < size; i++) {
            System.out.print("* ");
        }
        System.out.println();

        // Print sides
        for (int i = 0; i < size - 2; i++) {
            System.out.print("* ");
            for (int j = 0; j < size - 2; j++) {
                System.out.print("  ");
            }
            System.out.println("*");
        }

        // Print bottom side
        for (int i = 0; i < size; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}
//yujgh

