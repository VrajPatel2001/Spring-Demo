package org.demo.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


//@Component
//@Scope(value="prototype")
public class ClassB {

    //If we have more than one bean of autowired class, then we can use @Qualifier annotation to specify bean.
    //we can also use Inject from javax library instead of Autowired. Inject also inject the dependencies that defined other than spring.
   @Autowired
   @Qualifier("A2")
    ClassA a;


 //@Value("Vraj")
    String name;

    public ClassB(ClassA a, String name) {
        this.a = a;
        this.name = name;
    }


    public ClassA getA() {
        return a;
    }

    public void setA(ClassA a) {
        this.a = a;
    }

    public String getName() {
        return name;
    }

    @Required //Name must be set.
    public void setName(String name) {
        this.name = name;
    }

//    public ClassB(ClassA a, String name) {
//        this.a = a;
//        this.name = name;
//    }

    @Override
    public String toString() {
        return "ClassB{" +
                "a=" + a +
                ", name='" + name + '\'' +
                '}';
    }

    @PostConstruct
    public void init()
    {
        System.out.println("ClassB init method.");
    }

    @PreDestroy
    public void destroy()
    {
        System.out.println("ClassB destroy method.");
    }



}
