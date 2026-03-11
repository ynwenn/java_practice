package asset_11;
public class TangibleAsset implements Thing, Asset {
    String color;
    double weight;
    // コンストラクタ
    public TangibleAsset(String name, int price, String color, double weight) {
        this.color = color;
        this.weight = weight;
    }
    // メソッド
    public String getColor() { return this.color; }
    public double getWeight() { return this.weight; }
    public void setWeight(double w) { this.weight = w; }
}
