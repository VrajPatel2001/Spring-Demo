package org.demo.java;

//@Component("A")
//@Scope(value="prototype")
public class ClassA {
    //@Value("5")
    private int a;

    public ClassA() {
    }

    public ClassA(int a) {
        this.a = a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "ClassA{" +
                "a=" + a +
                '}';
    }

    public int getA() {
        return a;
    }
}
