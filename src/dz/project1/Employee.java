package dz.project1;

public class Employee {
    int id;
    String name;
    String surname;
    int yearOfBirth;
    String placeOfBirth;
    int salary;
    public Employee(int id, String name, String surname, int yearOfBirth, String placeOfBirth, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
        this.placeOfBirth = placeOfBirth;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString(){
        return String.format("(%d, %s, %s, %d, %s, %d)",
                id, name, surname, yearOfBirth, placeOfBirth, salary);
    }
}
