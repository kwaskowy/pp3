public class BankAccount{
   double balance=0.0d;

    public void deposit(double amount){
        balance= balance+amount;
    }
    public String displayBalance(){
        return String.format("Saldo twojego konta wynosi: %.2f", balance);

    }
    public void withdraw(double amount){
        if (balance>=amount && amount<=500.0f){
            balance-=amount;
            System.out.println(String.format("Wihdrawed %.2f\nCurrent balance: %.2f", amount,balance));
            
        } else{
            System.out.println(String.format("Brak srodkow. Na konice masz: %.2f\nProbujesz wyplacic: %.2f",balance,amount));
        }
    }
}