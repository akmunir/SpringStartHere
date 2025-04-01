package Chapter3.Main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name = "BBBB";
    private Parrot p;

    @Autowired
    public Person( @Qualifier("parrot2") Parrot parrot) {
        p = parrot;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Parrot getParrot() {
        return p;
    }

    public void setParrot(Parrot p) {
        this.p = p;
    }
}
