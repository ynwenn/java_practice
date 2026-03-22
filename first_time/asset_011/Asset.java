package asset_11;
public abstract class Asset {
    String name;
    int price;
    // コンストラクタ
    publir Asset(String name, int price) {
        this.name = name;
        this.price = price;
    }
    // メソッド
    public String getName() { return this.name; }
    public int getPrice() { return this.price; }
}
