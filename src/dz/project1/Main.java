package dz.project1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Database newDb = new Database();
        System.out.print(":: ");
        String command = in.next();
        while (!command.equals("exit")) {
            switch (command){
                case "insert":
                    try {
                        System.out.print("Input employee's id: ");
                        int id = in.nextInt();
                        System.out.print("Input employee's name: ");
                        String name = in.next();
                        System.out.print("Input employee's surname: ");
                        String surname = in.next();
                        System.out.print("Input employee's year of birth: ");
                        int yearOfBirth = in.nextInt();
                        System.out.print("Input employee's place of birth: ");
                        String placeOfBirth = in.next();
                        System.out.print("Input employee's salary: ");
                        int salary = in.nextInt();
                        Employee newEmployee = new Employee(id, name, surname, yearOfBirth, placeOfBirth, salary);
                        newDb.appendNewEmployee(newEmployee);
                        break;
                    } catch (InputMismatchException e){
                        System.out.println("Wrong argument typed");
                        break;
                    }
                case "get":
                    System.out.print("Input required employee's id: ");
                    int employeeId = in.nextInt();
                    Employee foundEmployee = newDb.getById(employeeId);
                    System.out.println(foundEmployee);
                    break;
                case "search":
                    System.out.print("Input employee's name: ");
                    String requiredName = in.next();
                    ArrayList<Employee> foundEmployees = newDb.searchByName(requiredName);
                    System.out.println(foundEmployees);
                    break;
                case "countsalaries":
                    int allSalariesCount = newDb.countSalaries();
                    System.out.println(allSalariesCount);
                    break;
                case "update":
                    try {
                        System.out.print("Input employee's id: ");
                        int updateId = in.nextInt();
                        System.out.print("Input employee's name: ");
                        String updateName = in.next();
                        System.out.print("Input employee's surname: ");
                        String updateSurname = in.next();
                        System.out.print("Input employee's year of birth: ");
                        int updateYearOfBirth = in.nextInt();
                        System.out.print("Input employee's place of birth: ");
                        String updatePlaceOfBirth = in.next();
                        System.out.print("Input employee's salary: ");
                        int updateSalary = in.nextInt();
                        newDb.updateInformation(updateId, updateName, updateSurname, updateYearOfBirth, updatePlaceOfBirth, updateSalary);
                        break;
                    } catch (InputMismatchException e){
                        System.out.println("Wrong arguments typed");
                        break;
                    }
                default:
                    System.out.println("I don't this command :_(");
                    break;
            }
            System.out.print(":: ");
            command = in.next();
        }
    }
}

class Database {
    Employee[] array = new Employee[100];
    private int currentEmployees = 0;

    public Employee getById(int id) {
        for (Employee emp : array) {
            if (emp.getId() == id) {
                return emp;
            }
        }
        return null;
    }

    public void appendNewEmployee(Employee new_employee) {
        if (currentEmployees < array.length && checkInsertionID(new_employee.getId())) {
            array[currentEmployees] = new_employee;
            currentEmployees += 1;
        }
    }

    public ArrayList<Employee> searchByName(String name) {
        ArrayList<Employee> result = new ArrayList<>();
        for (Employee emp : array) {
            if (emp != null) {
                if (emp.getName().equals(name)) {
                    result.add(emp);
                }
            }
        }
        return result;
    }

    private boolean checkInsertionID(int id){
        for (Employee emp:array){
            if (emp != null) {
                if (emp.getId() == id) {
                    return false;
                }
            }
        }
        return true;
    }

    public int countSalaries(){
        int counter = 0;
        for (Employee emp: array){
            if (emp != null){
                counter += emp.getSalary();
            }
        }
        return counter;
    }

    public void updateInformation(int employeeId, String name, String surname, int yearOfBirth, String placeOfBirth, int salary){
        Employee foundEmployee = getById(employeeId);
        if (foundEmployee != null){
            foundEmployee.setId(employeeId);
            foundEmployee.setName(name);
            foundEmployee.setSurname(surname);
            foundEmployee.setYearOfBirth(yearOfBirth);
            foundEmployee.setPlaceOfBirth(placeOfBirth);
            foundEmployee.setSalary(salary);
        }
    }

}