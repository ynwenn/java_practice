import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("たろう", 16));
        people.add(new Person("はなこ", 22));
        people.add(new Person("じろう", 23));
        for (Person person : people) {
            if (person.isAdult()) {
                person.introduce();
            }
        }
        double ageSum = 0;
        for (Person person : people) {
            ageSum +=person.age;
        }
        double ageAverage = ageSum / people.size();
        System.out.println("平均年齢：" + ageAverage);

    }
}
