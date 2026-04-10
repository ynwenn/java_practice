public class Main {
    public static void main(String[] args) {
        System.out.println(isEven(4));
        System.out.println(isEven(5));

        System.out.println(getMax(3, 7));

        System.out.println(getDiscountPrice(5000));
        System.out.println(getDiscountPrice(2000));
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
    
    public static int getMax(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static int getDiscountPrice(int price) {
        if (price >= 3000) {
            return (int) (price * 0.9);
        } else {
            return price;
        }
    }

    public static String getMessage(boolean isAdult) {
        if (isAdult) {
            return "成人です";
        } else {
            return "未成年です";
        }
    }
}
