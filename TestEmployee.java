package Week2.Day7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TestEmployee {
    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter number of Employees to be created .");
            int numOfEmployee = Integer.parseInt(bufferedReader.readLine());

            Employee[] empArray = new Employee[numOfEmployee * 3];

            int k = 0;
            for (int i = 0; i < numOfEmployee; i++) {
                System.out.println("Enter the details for WageEmployee :: ");
                System.out.print("\nEnter the Id of WageEmployee :: ");
                int wId = Integer.parseInt(bufferedReader.readLine());

                System.out.print("\nEnter the name for WageEmployee :: ");
                String wname = bufferedReader.readLine();

                System.out.print("\nEnter the address of WageEmployee :: ");
                String wAddress = bufferedReader.readLine();

                System.out.print("\nEnter the hours of WageEmployee :: ");
                int hours = Integer.parseInt(bufferedReader.readLine());

                System.out.print("\nEnter the rate of WageEmployee :: ");
                int rate = Integer.parseInt(bufferedReader.readLine());

                WageEmployee wageEmployee = new WageEmployee(wId, wname, wAddress, hours, rate);
                empArray[k] = wageEmployee; // storing wage employee into empArray
                k++;

                System.out.println("Enter the details for Salesperson :: ");
                System.out.println("Enter the Id of Salesperson :: ");
                int sId = Integer.parseInt(bufferedReader.readLine());

                System.out.print("\nEnter the name for Salesperson :: ");
                String sname = bufferedReader.readLine();

                System.out.print("\nEnter the address of Salesperson :: ");
                String sAddress = bufferedReader.readLine();

                System.out.print("\nEnter the sales of Salesperson :: ");
                int sales =Integer.parseInt(bufferedReader.readLine());

                System.out.print("\nEnter the commission of Salesperson :: ");
                int commision = Integer.parseInt(bufferedReader.readLine());

                SalesPerson salesPerson = new SalesPerson(sId, sname, sAddress, sales, commision);
                empArray[k] = salesPerson;
                k++;

                System.out.println("Enter the details for Manager :: ");
                System.out.println("Enter the Id of Manager :: ");
                int mId = Integer.parseInt(bufferedReader.readLine());

                System.out.print("\nEnter the name for Manager :: ");

                String mname = bufferedReader.readLine();
                System.out.print("\nEnter the address of Manager :: ");
                String mAddress = bufferedReader.readLine();
//
                System.out.print("\nEnter the salary of Manager :: ");
                int salary = Integer.parseInt(bufferedReader.readLine());

                System.out.print("\nEnter the incentives of Manager :: ");
                int incentives = Integer.parseInt(bufferedReader.readLine());

                Manager manager = new Manager(mId, mname, mAddress, salary, incentives);
                empArray[k] = manager;
                k++;

            }

            for (Employee e : empArray) {
                System.out.println(e);
            }
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}

/*

Enter number of Employees to be created .
2
Enter the details for WageEmployee ::

Enter the Id of WageEmployee :: 101
Enter the name for WageEmployee :: Alex
Enter the address of WageEmployee :: Pune
Enter the hours of WageEmployee :: 100
Enter the rate of WageEmployee :: 20

Enter the details for Salesperson ::
Enter the Id of Salesperson ::
102
Enter the name for Salesperson :: Eoin
Enter the address of Salesperson :: Pune
Enter the sales of Salesperson :: 290
Enter the commission of Salesperson :: 30

Enter the details for Manager ::
Enter the Id of Manager ::
103
Enter the name for Manager :: Chris
Enter the address of Manager :: Jalgaon
Enter the salary of Manager :: 50000
Enter the incentives of Manager :: 2000


Enter the details for WageEmployee ::
Enter the Id of WageEmployee :: 104
Enter the name for WageEmployee :: Sam
Enter the address of WageEmployee :: Mumbai
Enter the hours of WageEmployee :: 100
Enter the rate of WageEmployee :: 20


Enter the details for Salesperson ::
Enter the Id of Salesperson ::
105
Enter the name for Salesperson :: Tom
Enter the address of Salesperson :: Pune
Enter the sales of Salesperson :: 210
Enter the commission of Salesperson :: 20


Enter the details for Manager ::
Enter the Id of Manager ::
106
Enter the name for Manager :: Moin
Enter the address of Manager :: Pune
Enter the salary of Manager :: 20000
Enter the incentives of Manager :: 1200



*********************************************
WageEmployee Details : Name : Alex
Id : 101
Address : Pune
Salary is :: 2000

Salesperson Details : Name : Eoin
Id : 102
Address : Pune
Salary is :: 8700

Manager Details : Name : Chris
Id : 103
Address : Jalgaon
Salary is :: 52000

WageEmployee Details : Name : Sam
Id : 104
Address : Mumbai
Salary is :: 2000

Salesperson Details : Name : Tom
Id : 105
Address : Pune
Salary is :: 4200

Manager Details : Name : Moin
Id : 106
Address : Pune
Salary is :: 21200


* */