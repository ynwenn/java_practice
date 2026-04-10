import java.util.List;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("たろう");
        names.add("はなこ");
        names.add("じろう");
        for (String n : names) {
            System.out.println(n);
        }

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }

        List<Integer> sumNumbers = new ArrayList<>();
        sumNumbers.add(1);
        sumNumbers.add(2);
        sumNumbers.add(3);
        sumNumbers.add(4);
        sumNumbers.add(5);
        int sum = 0;
        for (int sn : sumNumbers) {
            sum += sn;
            System.out.println(sum);
        }


        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
    }
}
