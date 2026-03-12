package rpg.characters;
public class Wand {
    private String name;
    private double power;
}
public String getName { return this.name; }
public void setName(String name) {
    if (name == null || name.length() < 3) {
        throw new IllegalArgumentException("名前が短すぎます。");
    }
    this.name = name;
}
public double getPower() { return this.power; }
public void setPower(double power) {
    if (power < 0.5 || power > 100.0) {
        throw new IllegalArgumentException("増幅率が基準値の範囲外です。");
    }
    this.power = power;
}
