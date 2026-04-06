public class Book {
    String title;
    int price;
    
    public Book(String title, int price) {
        this.title = title;
        this.price = price;
    }
    public void showInfo() {
        System.out.println(title + "は" + price + "円です");
    }
}
