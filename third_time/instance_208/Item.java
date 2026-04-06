public class Item {
    String name;
    int price;
    
    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }
    public boolean isExpensive() {
        if (price >= 3000) {
            return true;
        } else {
            return false;
        }
    }
}
