public class Item {
    String name;
    int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }
    public boolean isExpensive() {
        return price >= 3000;
    }
    public int getDiscountPrice() {
        if (price >= 3000) {
            return (int) (price * 0.9);
        } else {
            return price;
        }
    }
}
