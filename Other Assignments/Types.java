// Define a class named "Employee"
public class Types {
    // Instance variables (fields)
    String name;
    int age;
    final String gender; // Final variable

    // Static variable
    static int totalEmployees = 0;

    // Constructor with parameters
    public Types(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        totalEmployees++;
    }

    // Method to display information about the employee
    public void displayInfo() {
        System.out.println("Employee Information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }

    // Static method to display total employees
    public static void displayTotalEmployees() {
        System.out.println("Total number of Employees = " + totalEmployees);
    }

    // Main method
    public static void main(String[] args) {
        // Creating objects of the Employee class
        Types employee1 = new Types("Abhinav", 21, "Male");
        Types employee2 = new Types("Shreya", 21, "Female");

        // Displaying information about each employee
        employee1.displayInfo();
        System.out.println();
        employee2.displayInfo();
        System.out.println();
        // Displaying total employees using the static method
        Types.displayTotalEmployees();
    }
}
