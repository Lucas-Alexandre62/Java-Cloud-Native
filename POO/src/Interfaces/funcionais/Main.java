package Interfaces.funcionais;

import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        List<User> users = List.of(new User("Lucas", 19), new User("Joao", 18));

        printStringvalue(user -> String.valueOf(user.age), users);
    }

    private static void printStringvalue(Function<User, String> callback, List<User> users){
        users.forEach(u -> System.out.println(callback.apply(u)));
    }
}
