package Chapter2.Main;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

//stereotype annotation method

//@Component
//public class Parrot {
//    String name;
//    public Parrot() {
//        this.name = null;
//    }
//    @PostConstruct
//    public void setName() {
//        this.name = "Joe";
//    }
//    String getName() {
//        return this.name;
//    }
//}

public class Parrot {
    private String name;
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}