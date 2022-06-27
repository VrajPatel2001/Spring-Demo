package org.demo.java;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("org.demo.java")
public class Config {
    //IF you do not want to use @Component, we can use @Bean in this file.
    @Bean("A1")
    @Scope(value="prototype")
    @Lazy //This will not be created until we do not call in main class.
    public ClassA classA()
    {
        return new ClassA();
    }

    @Bean("A2")
    @Scope(value="prototype")
    public ClassA classAnotherA()
    {
        return new ClassA(20);
    }

    @Bean("BestBean")
    @Scope(value="prototype")
    public ClassB classB()
    {
        return new ClassB(classA(),"Patel");
    }

    @Bean("BetterBean")
    @Scope(value="prototype")
    public ClassB classAnotherB()
    {
        return new ClassB(classA(),"Vraj");
    }

}
