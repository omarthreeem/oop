import java.time.LocalDate;

public class Account {
    private int id;
    private double balance;
    private static double annualInterestRate = 0;
    private LocalDate dateCreated;

    Account() {
    }

    Account(int id, double balance) {
        this.id = id;
        this.dateCreated = LocalDate.now();
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public int getId() {
        return id;
    }

    public void setBalance(double balance) {

        this.balance = balance;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate / 100.0;
    }

    public LocalDate isDataCreated() {
        return dateCreated;
    }
    public double getMonthlyInterestRate(){
        return (getAnnualInterestRate()/12.00);
    }
    public double getMonthlyInterest(){
        return (getMonthlyInterestRate()/100)*getBalance();
    }
    public void withdraw(double Money){
        this.balance-=Money;
    }
    public void deposit(double Monee){
        this.balance+=Monee;
    }

}