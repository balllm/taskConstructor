public class Student extends Human{
    public Student(String name, String surname, int age, int course, String major) {
        super(name, surname, age);
        this.course = course;
        this.major = major;
    }
    private int course;
    private String major;

    public int getCourse() {
        return course;
    }

    public String getMajor() {
        return major;
    }
    @Override
    public void work() {
        System.out.println(getName() + " нельзя на работу");
    }

    @Override
    public String toString() {
        return super.toString() + " " +
                course + " " +
                major;
    }
}
