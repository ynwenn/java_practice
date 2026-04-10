public class Main {
    public static void main(String[] args) {
        Car c = new Car("トヨタ", 2000000);
        c.showInfo();

        Student s = new Student("たなか", 80);
        System.out.println(s.isPass());

        Rectangle r = new Rectangle(5, 10);
        System.out.println(r.getArea());
    }
}
