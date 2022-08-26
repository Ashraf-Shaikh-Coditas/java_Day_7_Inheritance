package Week2.Day7;

public class Manager extends Employee {
    private int fixedSalary;
    private int incentives;

    public Manager() {

    }
    public Manager(int empId, String empName, String empAddress, int fixedSalary, int incentives) {
        super(empId, empName, empAddress);
        this.fixedSalary = fixedSalary;
        this.incentives = incentives;
    }

    public Manager(int fixedSalary, int incentives) {
        this.fixedSalary = fixedSalary;
        this.incentives = incentives;
    }

    public int getFixedSalary() {
        return fixedSalary;
    }

    public void setFixedSalary(int fixedSalary) {
        this.fixedSalary = fixedSalary;
    }

    public int getIncentives() {
        return incentives;
    }

    public void setIncentives(int incentives) {
        this.incentives = incentives;
    }

    public int computeSalary() {
        return this.getFixedSalary()+this.getIncentives();
    }

    @Override
    public String toString() {
        return "Manager Details : " +
                "Name : "+getEmpName()+"\n" +
                "Id : "+getEmpId()+"\n" +
                "Address : "+getEmpAddress()+"\n" +
                "Salary is :: "+this.computeSalary();
    }

}
