public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount a = new BankAccount();
        a.deposit(500.0);
        System.out.println(a.displayBalance());
        a.deposit(200.0);
        a.withdraw(300);
        System.out.println(a.displayBalance());
        a.withdraw(501);
    }
}
