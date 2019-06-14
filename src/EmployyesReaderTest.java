import java.io.FileNotFoundException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EmployyesReaderTest {
    public static void main(String[] args) throws FileNotFoundException {
        EmployeeReader employeeReader = new EmployeeReader();
        String fileName = "companyStatistic.txt";


        try(
                var fileWriter = new FileWriter(fileName);
                var writer = new BufferedWriter(fileWriter);
                ) {
            Employyes[] employees = employeeReader.readEmployyes("Employees.csv");
            EmployeeStatistics stat1 = new EmployeeStatistics();
            writer.write("Srednia wypłata :" +stat1.avgSalary(employees) );
            writer.newLine();
            writer.write("Najmniejsza wypłata :" + stat1.minSalary(employees));
            writer.newLine();
            writer.write("Największa wypłata :" +stat1.maxSalary(employees) );
            writer.newLine();
            writer.write("Łączna liczba pracowników :" + stat1.employeesQuantity(employees));
            writer.newLine();
            writer.write("Liczba pracowników w dziale IT :" + stat1.employeesInDepartament(employees,"it"));
            writer.newLine();
            writer.write("Liczba pracowników w dziale Managment :" + stat1.employeesInDepartament(employees,"Managment"));
            writer.newLine();
            writer.write("Liczba pracowników w dziale Support :" + stat1.employeesInDepartament(employees,"Support"));
            writer.newLine();

        } catch (FileNotFoundException e) {
            System.out.println("Nie ma takiego pliku");


        }
        catch (IOException e) {
            System.out.println("Nie udało się zapisać pliku" + fileName);
        }

    }
}
