public class App {
    public static void main(String[] args) {
        Student student = new Student("Abdullah", 99, 4.0);

        System.out.println(student);

        student.setGpa(3.5);
        System.out.println(student.getGpaStatus());
        student.setGpa(-10);

    }
}
