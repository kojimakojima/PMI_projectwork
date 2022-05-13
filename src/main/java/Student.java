
public class Student {
    private int s_num;
    private String s_name;
    private int grade;

    Student(int s_num, String s_name, int grade) {
        this.s_num = s_num;
        this.s_name = s_name;
        this.grade = grade;
    }

    public int get_s_num() {
        return s_num;
    }

    public String get_s_name() {
        return s_name;
    }

    public int get_grade() {
        return grade;
    }

    public String toString() { // Concatenating student information
        return s_num + " " + s_name + " " + grade;
    }
}
