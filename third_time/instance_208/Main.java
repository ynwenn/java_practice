public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("Java入門", 3000);
        Book b2 = new Book("Python入門", 2500);
        b1.showInfo();
        b2.showInfo();

        Item i = new Item("イヤホン", 4000);
        System.out.println(i.isExpensive());

        User u = new User("ひろし", 61);
        System.out.println(u.isAdult());
    }
}
