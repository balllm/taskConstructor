public class Worker extends Human{
    public Worker(String name, String surname, int age, String jobTitle, int salary) {
        super(name, surname, age);
        this.jobTitle = jobTitle;
        this.salary = salary;
    }
    private String jobTitle;
    private int salary;

    public String getJobTitle() {
        return jobTitle;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public void work() {
        System.out.println(getName() + " пошел работать");
    }

    @Override
    public String toString() {
        return super.toString() + " " +
                jobTitle + " " +
                salary;
    }
}
