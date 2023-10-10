package application;

public class Employee {
    String firstName;
    String lastName;
    int id;
    final Department dept1;

    public Employee(String firstName, String lastName, int id, Department dept1) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.dept1 = dept1;
    }

    public Employee() {
        firstName = "Max ";
        lastName = "Mustermann";
        id = 123;
        dept1 = new Department();
    }

    public void print() {
        System.out.println("Der Mitarbeiter " + firstName + lastName + " arbeitet in " +
                "der Abteilung " + dept1.name + " in " + dept1.city);
    }

    public boolean isEquals(Employee other) {
        return id == other.id;
    }

    public boolean equals(Object obj){
        if (obj == null){
            return false;
        }
        if (this == obj){
            return true;
        }
        if (getClass() != obj.getClass()){
            return false;
        }
        Employee other = (Employee) obj;
        return firstName == other.firstName;
    }
}
