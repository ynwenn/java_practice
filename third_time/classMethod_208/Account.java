public class Account {
    int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    public void deposit(int amount) {
        this.balance += amount;
    }
    public void withdraw(int amount) {
        this.balance -= amount;
    }
    public void showBalance() {
        System.out.println(this.balance);
    }
}
