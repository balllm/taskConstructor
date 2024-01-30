public class Human {
    private String name;
    private String surname;
    private int age;

    public Human(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        if(age >= 0){
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public void work(){
        System.out.println("Пусто");
    }

    @Override
    public String toString() {
        return name + " " +
                surname + " " +
                age;
    }
}
