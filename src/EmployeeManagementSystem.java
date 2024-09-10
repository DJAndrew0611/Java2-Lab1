import java.util.*;

public class EmployeeManagementSystem {
    private Map<String, Integer> employees;

    public EmployeeManagementSystem() {
        employees = new HashMap<>();
    }


    public void addEmployee(String name, int age) {
        employees.put(name, age);
    }


    public void deleteEmployee(String name) {
        employees.remove(name);
    }


    public void printAllEmployees() {
        List<String> names = new ArrayList<>(employees.keySet());
        Collections.sort(names);
        for (String name : names) {
            System.out.println("Name: " + name + ", Age: " + employees.get(name));
        }
    }


    public static void main(String[] args) {
        EmployeeManagementSystem system = new EmployeeManagementSystem();

        system.addEmployee("A", 30);
        system.addEmployee("B", 25);
        system.addEmployee("C", 35);

        system.deleteEmployee("B");

        system.addEmployee("A", 30);
        system.addEmployee("D", 40);

        system.printAllEmployees();
    }
}