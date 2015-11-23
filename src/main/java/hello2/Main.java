package hello2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("start");

        AbstractApplicationContext context =
                new ClassPathXmlApplicationContext("Beans2.xml");

        context.registerShutdownHook();

        System.out.println("context init");
        System.out.println("getting bean..");
        HelloWorld hw = context.getBean("helloWorld", HelloWorld.class);
        System.out.println("got bean");
        hw.setMessage("Hi there!");
        hw.getMessage();

        HelloWorld hw2 = (HelloWorld) context.getBean("helloWorld");

        hw2.getMessage();
    }
}
