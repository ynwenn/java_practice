package bankAccount_14;
public class Account {
    private String accountNumber;
    private int balance;

    public String toString() {
        return "¥¥" + this.balance + "(口座番号：" + this.accountNumber + ")";
    }
    public boolean equals(Object o) {
        if (this == o) { return true; }
        if (o instanceof Account a) {
            String a1 = this.accountNumber.trim();
            String a2 = a.accountNumber.trim();
            if (a1.equals(a2)) {
                return true;
            }
        }
        return false;
    }
}
