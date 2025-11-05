package LLD.Solid.Example1.ProblematicCode;

public class Employee {
    
    private int id;
    private String name;
    private String address;

    public Employee(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public void printPerformanceReport() {
        // Logic to print performance report
        System.out.println("Printing performance report for " + name);
    }

    public double computeSalary() {
        // Logic to compute salary
        return 50000.0; // Example fixed salary
    }

    public void updateEmployeeData() {
        // Logic to update employee data
        System.out.println("Updated data for " + name);
    }

    public void fetchEmployeeData() {
        // Logic to fetch employee data
        System.out.println("Fetched data for " + name);
    }
}


// Problems with this design:
// - handling multiple responsibilities such as performance report, salary computation.