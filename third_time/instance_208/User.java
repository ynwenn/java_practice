public class User {
    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public boolean isAdult() {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }
}
