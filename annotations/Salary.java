package annotations;

public class Salary {

    @SalaryInfo(min = 40000.0, max = 150000.0)
    private double amount;

    public Salary(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

   
}
