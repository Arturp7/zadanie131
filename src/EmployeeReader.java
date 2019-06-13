import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EmployeeReader {

    Employyes[] readEmployyes(String fileName) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(fileName));
        int i = 0;
        int lines = countLines(fileName);
        Employyes[] employyes = new Employyes[lines];
        while (scanner.hasNextLine()) {
            String nextLine = scanner.nextLine();
            String[] split = nextLine.split(";");
            employyes[i] = new Employyes(split[0], split[1], split[2], split[3], Double.valueOf(split[4]));
            i++;

        }
        return employyes;

    }

    int countLines(String fileName) throws FileNotFoundException {
        int nooOfLines = 0;

        Scanner scanner = new Scanner(new File(fileName));
        while (scanner.hasNextLine()) {
            nooOfLines++;
            scanner.nextLine();

        }
        scanner.close();
        return nooOfLines;


    }

}
