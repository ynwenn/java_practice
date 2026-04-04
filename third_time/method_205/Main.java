public class Main {
    public static void main(String[] args) {
        greet("Chihiro");

        int result = add(3, 5);
        System.out.println(result);

        System.out.println(isEven(2));
        System.out.println(isEven(7));
    }
    
    public static void greet(String name) {
        System.out.println("Hello" + name);
    }
    
    public static int add(int a, int b) {
        return a + b;
    }

    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}