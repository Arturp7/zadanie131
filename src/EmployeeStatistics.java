public class EmployeeStatistics {

    double avgSalary(Employyes[] employees) {
        double k = 0;
        double result = 0;

        for (int i = 0; i < employees.length; i++) {
            double j = employees[i].getSalary();
            k = k + j;
            result = k / employees.length;

        }
        return result;
    }

    double minSalary(Employyes[] employyes) {
        double[] salary = new double[employyes.length];
        int j = 0;
        int k = 0;
        for (int i = 0; i < employyes.length; i++) {
            salary[j] = employyes[i].getSalary();
            j++;
        }
        double result = salary[0];
        for (k = 1; k < salary.length; k++) {
            if (result > salary[k]) {
                result = salary[k];
            }
        }
        return result;

    }

    double maxSalary(Employyes[] employyes) {
        double[] salary = new double[employyes.length];
        int j = 0;
        int k = 0;
        for (int i = 0; i < employyes.length; i++) {
            salary[j] = employyes[i].getSalary();
            j++;
        }
        double result = salary[0];
        for (k = 1; k < salary.length; k++) {
            if (result < salary[k]) {
                result = salary[k];
            }
        }
        return result;
    }

    double employeesQuantity(Employyes[] employyes) {
        return employyes.length;
    }

    int employeesInDepartament(Employyes[] employyes, String department) {
        int i = 0;
        int k = 0;
        for (int j = 0; j < employyes.length; j++) {
            if ((employyes[j].getDepartment()).equals(department)) {
                k++;

            }
        }
        return k;


    }


}



