package Records;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Lucas ", 19);
        System.out.println(person.name() + person.age());
        person.name = "João"; // Records é uma classe imutável
    }

}
