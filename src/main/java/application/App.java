package application;

import java.util.Scanner;

public class App {
    private static int generateId() {
        return (int) (1000 * Math.random());
    }

    static Scanner scanner = new Scanner(System.in);

    static int deptCounter = 0;
    static int empCounter = 0;

    //////////////////////////////////////////////////////////////////////////// MAIN
    public static void main(String[] args) {

        Department musterDepartment = new Department();
        Employee musterEmployee = new Employee();

        Department department1 = new Department("Codersbay", generateId(), "Österreich", "Linz");
        Department department2 = new Department("Magna", generateId(), "Österreich", "Steyr");
        Department department3 = new Department("NXP", generateId(), "Österreich", "Graz");

        Employee employee1 = new Employee("Franz ", "Mayer", generateId(), musterDepartment);
        Employee employee2 = new Employee("Hans ", "Mayer", generateId(), department1);
        Employee employee3 = new Employee("Willi ", "Mayer", generateId(), department1);
        Employee employee4 = new Employee("Willi ", "Mayer", generateId(), department1);

        musterEmployee.print();
        employee1.print();
        employee2.print();

//        System.out.println("Department ist " + department1.isEquals(department3));
//        System.out.println("Employee ist " + employee1.isEquals(employee2));

        System.out.println("Bitte legen Sie eine Abteilung an.");
        System.out.print("Name: ");
        String inputDept = scanner.nextLine();
        System.out.print("Land: ");
        String inputLand = scanner.nextLine();
        System.out.print("Stadt: ");
        String inputCity = scanner.nextLine();

        Department[] deptArray = new Department[1000];
        deptArray[deptCounter] = new Department(inputDept, generateId(), inputLand, inputCity);

        char inputRepeat;
        Employee[] empArray = new Employee[1000];
        do {
            System.out.println(" Bitte legen Sie einen Mitarbeiter an.");
            System.out.print("Vorname: ");
            String inputFirstName = scanner.nextLine();
            System.out.print("Nachname: ");
            String inputLastName = scanner.nextLine();


            empArray[empCounter] = new Employee(inputFirstName, inputLastName, generateId(), deptArray[deptCounter]);


            System.out.println("Sie haben folgenden Mitarbeiter angelegt: ");

            System.out.println("Der Mitarbeiter " + empArray[empCounter].id + " " + empArray[empCounter].firstName + " "
                    + empArray[empCounter].lastName + " arbeitet in der Abteilung " + deptArray[deptCounter].name
                    + " in " + deptArray[deptCounter].city);

            empCounter++;

            System.out.println("Möchten Sie noch einen Mitarbeiter anlegen?");
            System.out.println("j für ja und n für beenden");
            inputRepeat = scanner.nextLine().charAt(0);
        } while (inputRepeat == 'j');

        System.out.println("Folgende Mitarbeiter wurden angelegt:");
        for(int i = 0; i< empCounter; i++){
            System.out.println(empArray[i].id + " "+ empArray[i].firstName + " " + empArray[i].lastName);
        }
        System.out.println("Auf Wiedersehen.");

    }

    /*
     * for the bonus task
     *
     * private static int generateID() {}
     *
     */

    /*
     * for the console application
     *
     * private static void application() {}
     *
     */
}
