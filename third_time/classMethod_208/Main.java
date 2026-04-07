public class Main {
    public static void main(String[] args) {
        Dog d = new Dog("ポチ");
        d.bark();

        Calculator c = new Calculator();
        System.out.println(c.add(3,5));

        Account a = new Account(35000);
        a.deposit(8000);
        a.showBalance();
    }
}
