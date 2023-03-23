public class Main {
    public static void main(String[] args) {
        Account Acc = new Account();
        Acc = new Account(532,1000);
        Acc.setAnnualInterestRate(3.9);
        Acc.withdraw(2500);
        System.out.println(Acc.getBalance());
        Acc.deposit(3000);
        System.out.println(Acc.isDataCreated());
        System.out.println(Acc.getMonthlyInterest());
    }
}