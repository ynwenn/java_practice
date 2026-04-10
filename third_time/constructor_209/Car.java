public class Car {
    String maker;
    int price;
    
    public Car(String maker, int price) {
        this.maker = maker;
        this.price = price;
    }
    public void showInfo() {
        System.out.println(maker + "の車で" + price + "円です");
    }
}
