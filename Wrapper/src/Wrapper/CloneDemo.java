package Wrapper;

public class CloneDemo {

    public static void main(String[] args) {

        try {

            // Original object
            Employee emp1 = new Employee(101, "Devi", 50000);

            // Clone object
            Employee emp2 = (Employee) emp1.clone();

            // Change original object values
            emp1.empId = 102;
            emp1.empName = "Swarupa";
            emp1.salary = 60000;

            System.out.println("Original Employee Details:");
            emp1.display();

            System.out.println("\nCloned Employee Details:");
            emp2.display();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}