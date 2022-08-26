package Week2.Day7;

public class SalesPerson extends WageEmployee {
    private int sales;
    private int commission;

    public SalesPerson() {

    }

    public SalesPerson(int sales, int commission) {
        this.sales = sales;
        this.commission = commission;
    }

    public SalesPerson(int empId, String empName, String empAddress, int sales, int commission) {
        super(empId, empName, empAddress);
        this.sales = sales;
        this.commission = commission;
    }

    public int getSales() {
        return sales;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }

    public int getCommission() {
        return commission;
    }

    public void setCommission(int commission) {
        this.commission = commission;
    }

    public int computeSalary() {
        return this.getSales()*this.getCommission();
    }

    @Override
    public String toString() {
        return "Salesperson Details : " +
                "Name : "+getEmpName()+"\n" +
                "Id : "+getEmpId()+"\n" +
                "Address : "+getEmpAddress()+"\n" +
                "Salary is :: "+this.computeSalary();
    }
}
