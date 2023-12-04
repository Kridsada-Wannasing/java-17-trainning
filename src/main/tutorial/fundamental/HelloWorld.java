package tutorial.fundamental;

import java.util.Optional;

public class HelloWorld {

    public static void main(String[] args) {
        Optional<Integer> a = Optional.of(1);
        a.ifPresent(System.out::println);
    }
}
