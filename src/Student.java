public class Student {
    private String name;
    private int age;
    private double gpa;

    public Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        setGpa(gpa);
    }

    public String getGpaStatus() {
        if (gpa > 3) return "Excellent!";
        if (gpa >= 2) return "Good.";
        return "Needs Improvement.";
    }

    public void setGpa(double gpa) {
        if (gpa < 0. || gpa > 4.) {
            this.gpa = 0.;
            System.err.println("Invalid GPA");
            return;
        }
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gpa=" + gpa +
                '}';
    }
}
