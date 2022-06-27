package org.demo.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {


    public static void main(String[] args) {

        try (AnnotationConfigApplicationContext con = new AnnotationConfigApplicationContext(Config.class)) {

            ClassA a = (ClassA) con.getBean("A2");
            System.out.println(a);


//            ClassB b = con.getBean(ClassB.class);
//            System.out.println(b);
//
//            a.setA(10);
//            b.setA(a);
//            System.out.println(b);
//
//            ClassB b1 = con.getBean(ClassB.class); //If you want multiple beans of one component, then @Scope(value="prototype") Annotation should be used.
//            System.out.println(b1);


            ClassB bestBean = (ClassB) con.getBean("BestBean");
            ClassB betterBean = (ClassB) con.getBean("BetterBean");
            System.out.println(bestBean);
            System.out.println(betterBean);

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }


    }

}

