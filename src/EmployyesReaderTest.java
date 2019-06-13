import java.io.FileNotFoundException;

public class EmployyesReaderTest {
    public static void main(String[] args) throws FileNotFoundException {
        EmployeeReader employeeReader = new EmployeeReader();


        try {
            Employyes[] employees = employeeReader.readEmployyes("Employees.csv");
            EmployeeStatistics stat1 = new EmployeeStatistics();

            System.out.println(stat1.avgSalary(employees));
            System.out.println(stat1.minSalary(employees));
            System.out.println(stat1.maxSalary(employees));
            System.out.println(stat1.employeesQuantity(employees));
            System.out.println(stat1.employeesInDepartament(employees,"it"));
            System.out.println(stat1.employeesInDepartament(employees,"Managment"));
            System.out.println(stat1.employeesInDepartament(employees,"Support"));

        } catch (FileNotFoundException e) {
            System.out.println("Nie ma takiego pliku");

        }

    }
}
