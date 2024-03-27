package GUIA1.models;

public class Employee {
    private String name;
    private String surname;
    private String dni;
    private Double salary;

    public Employee(String name, String surname, String dni, Double salary) {
        this.name = name;
        this.surname = surname;
        this.dni = dni;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getDni() {
        return dni;
    }

    public Double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee[name= " + name +
                ", surname= " + surname +
                ", dni= " + dni +
                ", salary= " + salary + "]";
    }

    public Double anualSalary() {
        return salary * 12;
    }

    public void increaseSalary(Double percentage) {
        this.salary = this.salary * (1 + percentage / 100);
    }
}
