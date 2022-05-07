package compass;
import java.util.Arrays;

public class Main {
    private static Employee[] employee = new Employee[4];
    private static int salary() {
        int sum = 0;
        for (int i = 0; i < employee.length; i++) {
            sum = sum + employee[i].getSalary();
        }
        return sum;
    }


    private static Employee minSalary(){
        Employee employeeWithMinSalary = employee[0];
        for (int j = 0; j < employee.length; j++){
            if (employee[j].getSalary() < employeeWithMinSalary.getSalary())
                employeeWithMinSalary = employee[j];
        }
        return employeeWithMinSalary;

    }


    private static Employee maxSalary(){
        Employee employeeWithMaxSalary = employee[0];
        for (int j = 0; j < employee.length; j++){
            if (employee[j].getSalary() > employeeWithMaxSalary.getSalary())
                employeeWithMaxSalary = employee[j];
        }
        return employeeWithMaxSalary;
    }


    private static double averageSalary(){
        double average = 0;
        if (employee.length>0){
            double sum1 = salary();
            average = sum1 / employee.length;
        }
        return average;
    }
    private static void list(){
        for (int a = 0; a < employee.length; a++) {
            System.out.println(employee[a].getFirstName()+ " " +employee[a].getMiddleName()+ " " +employee[a].getLastName());
        }
    }

    public static void main(String[] args) {
        employee[0] = new Employee("Ivan", "Ivanovich", "Ivanov", 1,
                10_000);
        employee[1] =  new Employee("Maksim", "Petrovich", "Sorokin", 2,
                20_000);
        employee[2] = new Employee("Olga", "Nikolaevna","Sysova", 3, 30_000);
        employee[3]= new Employee("Kolya","Andreevich","Lisin", 4,40_000);

        System.out.println("symm zarplat " + salary());
        System.out.println("min zarplata " + minSalary());
        System.out.println("max zarplata " + maxSalary());
        System.out.println("srednya zarplata " + averageSalary());
        list();
        System.out.println(Arrays.toString(employee));
    }
}