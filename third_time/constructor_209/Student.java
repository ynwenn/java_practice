public class Student {
    String name;
    int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
    public boolean isPass() {
        return score >= 60;
    }
}