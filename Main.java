//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

        public static void main(String[] args) {
            emp person = new emp("Alice", 30);
            employee employee = new employee("Bob", 25, "E123", 50000.00);

            System.out.println(person);   // Output: Name: Alice, Age: 30
            System.out.println(employee); // Output: Name: Bob, Age: 25, Employee ID: E123, Salary: 50000.0
        }
    }
