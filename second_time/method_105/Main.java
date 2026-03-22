package second_time.method_105;
public class Main {
    public static void incArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i]++;
        }
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        incArray(array);
        for (int i : array) {
            System.out.println(i);
        }

        introduceOneself();

        email("昨日の件について", "aaa@bbcc.com", "午後2時に会議室へ来てください。");

        email("aaa@bbcc.com", "今日のお昼ご一緒にいかがですか。");

        System.out.println(calcTriangleArea(10.0, 5.0));

        System.out.println(calcCircleArea(5.0));
    }


    public static void introduceOneself() {
        String name = "湊雄輔";
        int age = 22;
        double height = 169.9;
        char zodiac = '辰';
        System.out.println("私の名前は" + name + "です。");
        System.out.println("歳は" + age + "歳です。");
        System.out.println("身長は" + height + "㎝です。");
        System.out.println("十二支は" + zodiac + "です。");
    }


    public static void email(String title, String address, String text) {
        System.out.println(address + "に、以下のメールを送信しました。");
        System.out.println("件名:" + title);
        System.out.println("本文:" + text);
    }


    public static void email(String address, String text) {
        System.out.println(address + "に、以下のメールを送信しました。");
        System.out.println("件名：無題");
        System.out.println("本文：" + text);
    }


    public static double calcTriangleArea(double bottom, double height) {
        double triangleArea = bottom * height * 0.5;
        return triangleArea;
    }

    public static double calcCircleArea(double radius) {
        double circleArea = radius * radius * 3.14;
        return circleArea;
    }
}
