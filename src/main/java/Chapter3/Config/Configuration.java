package Chapter3.Config;

import Chapter3.Main.Parrot;
import Chapter3.Main.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;

@Qualifier
@org.springframework.context.annotation.Configuration
@ComponentScan(basePackages = "Chapter3.Main")
public class Configuration {
//    @Bean
//    public Person person( @Qualifier("parrot2") Parrot parrot2) {
//        Person p = new Person();
//        p.setName("carl");
//        p.setParrot(parrot2);
//        return p;
//    }
    @Bean
    public Parrot parrot1() {
        Parrot p = new Parrot();
        p.setName("Joseph");
        return p;
    }
    @Bean
    public Parrot parrot2() {
        Parrot p = new Parrot();
        p.setName("AAA AA");
        return p;
    }



}
