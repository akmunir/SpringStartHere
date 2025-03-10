package Chapter2.Main;

import Chapter2.Config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
//        Parrot p = context.getBean(Parrot.class);
//        System.out.println(p);
//        System.out.println(p.getName());

        Parrot x = new Parrot();
        x.setName("Jimmy");
        Supplier<Parrot> parrotSupplier = () -> x;
        context.registerBean("parrot1", Parrot.class, parrotSupplier);
//      context .registerBean("parrot1", Parrot.class, parrotSupplier, bc -> bc.setPrimary(true)); will set the bean to primary
        Parrot p = context.getBean("parrot1", Parrot.class);


    }
}


