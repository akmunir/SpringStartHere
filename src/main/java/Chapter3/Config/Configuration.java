package Chapter3.Config;

import Chapter3.Main.Parrot;
import Chapter3.Main.Person;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean
    public Person person() {
        Person p = new Person();
        p.setParrot(parrot());
        p.setName("Carl");
        return p;
    }
    @Bean
    public Parrot parrot() {
        Parrot p = new Parrot();
        p.setName("Joseph");
        return p;
    }



}
