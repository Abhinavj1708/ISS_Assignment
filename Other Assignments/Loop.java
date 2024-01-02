import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        // Demonstrating if-else statement
        int value = 10;

        if (value > 0)
            System.out.println("The number is positive.");
        else if (value < 0)
            System.out.println("The number is negative.");
        else
            System.out.println("The number is zero.");

        System.out.println();

        // Demonstrating while loop with a different range
        int num = 5;
        System.out.println("Counting from 5 to 10 using a while loop:");
        while (num <= 10) {
            System.out.println(num);
            num++;
        }

        System.out.println();

        // Demonstrating for loop with a different range
        System.out.println("Counting from 5 - 10 using for loop:");
        for (int i = 5; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println();

        // Customizing use case statements
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number representing a month (1-12): ");
        int monthNum = scanner.nextInt();

        String month;
        switch (monthNum) {
            case 1:
                month = "January: Winter";
                break;
            case 2:
                month = "February: Winter";
                break;
            case 3:
                month = "March: Spring";
                break;
            case 4:
                month = "April: Spring";
                break;
            case 5:
                month = "May: Spring";
                break;
            case 6:
                month = "June: Summer";
                break;
            case 7:
                month = "July: Summer";
                break;
            case 8:
                month = "August: Summer";
                break;
            case 9:
                month = "September: Fall";
                break;
            case 10:
                month = "October: Fall";
                break;
            case 11:
                month = "November: Fall";
                break;
            case 12:
                month = "December: Winter";
                break;
            default:
                month = "Invalid month number";
        }

        System.out.println("Month: " + month);

        scanner.close();
    }
}
