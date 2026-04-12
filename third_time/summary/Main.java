import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Laptop", 5000));
        items.add(new Item("Smartphone", 4000));
        items.add(new Item("Headphones", 2000));
        for (Item item : items) {
            if (item.isExpensive()) {
                System.out.println("高い商品：" + item.name);
            }
        }
        for (Item item : items) {
            int discountedPrice = item.getDiscountPrice();
            System.out.println("割引後価格：" + item.name + " - " + discountedPrice);
        }
    }
}