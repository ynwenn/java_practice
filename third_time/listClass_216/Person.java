public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduce() {
        System.out.println("私は" + name + "で、" + age + "歳です");
    }
    public boolean isAdult() {
        return age >= 18;
    }
}
