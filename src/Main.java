public class Main {
    public static void main(String[] args) {
        Human human = new Human("Masha", "Masha", 22);
        Worker worker = new Worker("Tom", "Tom", 21, "beginner", 1000);
        Student student = new Student("Jessy", "Jessy", 19, 1, "engineer");

        // проверка метода work
        human.work();
        worker.work();
        student.work();

        // проверка
        System.out.println(human.toString());
        System.out.println(worker.toString());
        System.out.println(student.toString());
    }
}