package Chapter1.Main;

import org.springframework.stereotype.Component;

@Component
public class Parrot {
    String name;
    public Parrot(String name) {
        this.name = name;
    }
    String getName() {
        return this.name;
    }
}
