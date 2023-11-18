public class BankAccount{
    private double balance=0.0;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount){
        setBalance(balance+amount);
    }
    public String withdraw(double amount){
        if (balance>=amount && amount<=500){
            setBalance(balance-amount);
            return String.format("Wihdrawed %.2d\nCurrent balance: %.2d", amount,balance);
        } else{
            return String.format("Brak środków. Na konice masz: %.2d\nPróbujesz wypłacić: %.2d",balance,amount);
        }
    }

    public static void main(String[] args) {
        BankAccount a = new BankAccount();
        a.deposit(500.0);
        a.deposit(500.0);
        a.withdraw(400.5);
    }

}