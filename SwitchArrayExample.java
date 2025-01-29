import java.util.Scanner;

public class SwitchArrayExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        // Input: Array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Menu for array operations
        System.out.println("\nChoose an operation:");
        System.out.println("1: Find the sum of the array");
        System.out.println("2: Find the maximum value in the array");
        System.out.println("3: Reverse the array");
        System.out.println("4: Exit");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        // Perform the chosen operation
        switch (choice) {
            case 1 -> {
                // Find the sum
                int sum = 0;
                for (int num : array) {
                    sum += num;
                }
                System.out.println("The sum of the array is: " + sum);
            }

            case 2 -> {
                // Find the maximum value
                int max = array[0];
                for (int num : array) {
                    if (num > max) {
                        max = num;
                    }
                }
                System.out.println("The maximum value in the array is: " + max);
            }

            case 3 -> {
                // Reverse the array
                System.out.println("The reversed array is:");
                for (int i = size - 1; i >= 0; i--) {
                    System.out.print(array[i] + " ");
                }
                System.out.println();
            }

            case 4 -> // Exit
                System.out.println("Exiting the program. Goodbye!");

            default -> System.out.println("Invalid choice! Please choose a valid option.");
        }

        scanner.close();
    }
}
