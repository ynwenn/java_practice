public class Main {
    public static void main(String[] args) {
        int number = 3;
        if (number >= 10) {
            System.out.println("OK");
        } else {
            System.out.println("NG");
        }
    
        if (number % 2 == 0) {
            System.out.println("偶数");
        } else {
            System.out.println("奇数");
        }

        if (number % 2 == 0 && number % 3 == 0) {
            System.out.println("6の倍数");
        } else {
            System.out.println("6の倍数ではない");
        }

        if (number >= 10) {
            System.out.println("大きい");
        } else if (number >= 5) {
            System.out.println("普通");
        } else {
            System.out.println("小さい");
        }


        int score = 75;
        if (score >= 60) {
            System.out.println("合格");
        } else {
            System.out.println("不合格");
        }


        int age = 25;
        if (age >= 18) {
            System.out.println("成人");
        } else {
            System.out.println("未成年");
        }
    }
}
