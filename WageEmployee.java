package Week2.Day7;

public class WageEmployee extends Employee{
    private int hrs;
    private int rate;

    public WageEmployee() {

    }
    public WageEmployee(int empId, String empName, String empAddress, int hrs, int rate) {
        super(empId, empName, empAddress);
        this.hrs = hrs;
        this.rate = rate;
    }

    public WageEmployee(int empId, String empName, String empAddress) {
        super(empId, empName, empAddress);
    }

    public WageEmployee(int hrs, int rate) {
        this.hrs = hrs;
        this.rate = rate;
    }

    public int getHrs() {
        return hrs;
    }

    public void setHrs(int hrs) {
        this.hrs = hrs;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "WageEmployee Details : " +
                "Name : "+getEmpName()+"\n" +
                "Id : "+getEmpId()+"\n" +
                "Address : "+getEmpAddress()+"\n" +
                "Salary is :: "+this.computeSalary();
    }

    public int computeSalary() {
        return rate * hrs;
    }


}
