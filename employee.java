public class employee extends emp {
    private String employeeID;
    private double salary;

    // Constructor for Employee
    public employee(String name, int age, String employeeID, double salary) {
        // Initialize Person attributes using the superclass constructor
        super(name, age);
        this.employeeID = employeeID;
        this.salary = salary;
    }

    // Getter for employeeID
    public String getEmployeeID() {
        return employeeID;
    }

    // Setter for employeeID
    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }

    // Setter for salary
    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        // Use the superclass toString() method and add Employee-specific attributes
        return super.toString() + ", Employee ID: " + employeeID + ", Salary: " + salary;
    }
}

