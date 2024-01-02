// Define a simple class named "StaffMember"
class StaffMember {
    // Instance variables (state)
    String staffName;
    int staffID;

    // Constructor method
    public StaffMember(String name, int id) {
        this.staffName = name;
        this.staffID = id;
    }

    // Method to display information about the Staff Member
    public void showInfo() {
        System.out.println("Staff Member Information:");
        System.out.println("Name: " + staffName);
        System.out.println("ID: " + staffID);
    }
}

// Basic class to test the StaffMember class
public class Basic {
    public static void main(String[] args) {
        // Creating an object of the StaffMember class
        StaffMember staffInfo = new StaffMember("Abhinav", 12345);

        // Displaying information
        staffInfo.showInfo();
    }
}
