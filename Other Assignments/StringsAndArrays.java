public class StringsAndArrays {
    public static void main(String[] args) {
        // String manipulation
        String salutation = "Hello, World!";

        // Length of the string
        int salutationLength = salutation.length();
        System.out.println("Length of the string: " + salutationLength);

        // Concatenation
        String personName = "Alice";
        String personalizedMessage = salutation + " My name is " + personName;
        System.out.println("Concatenated String: " + personalizedMessage);

        // Substring
        String substringSalutation = salutation.substring(0, 5);
        System.out.println("Substring: " + substringSalutation);

        // Uppercase and lowercase
        String uppercaseSalutation = salutation.toUpperCase();
        String lowercaseSalutation = salutation.toLowerCase();
        System.out.println("Uppercase: " + uppercaseSalutation);
        System.out.println("Lowercase: " + lowercaseSalutation);

        // Array example
        int[] integers = {1, 2, 3, 4, 5};

        // Accessing elements
        System.out.println("Element at index 2: " + integers[2]);

        // Modifying elements
        integers[3] = 10;
        System.out.println("Modified element at index 3: " + integers[3]);

        // Length of the array
        int arrayLength = integers.length;
        System.out.println("Length of the array: " + arrayLength);

        // Looping through the array
        System.out.println("Array elements:");
        for (int i = 0; i < arrayLength; i++) {
            System.out.print(integers[i] + " ");
        }
        System.out.println();
    }
}
