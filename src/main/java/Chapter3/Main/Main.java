package Chapter3.Main;

import Chapter3.Config.Configuration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Configuration.class);
        Person person = context.getBean(Person.class);
        System.out.println("Person's name is " + person.getName());
        System.out.println("Person's Parrot is " + person.getParrot());

    }
}
