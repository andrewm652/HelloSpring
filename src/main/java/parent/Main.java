package parent;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("Beans3.xml");

        A a = context.getBean("a", A.class);
        B b = context.getBean("b", B.class);

        System.out.println(b.getMethod1());
        System.out.println(b.getMethod2());
        System.out.println(b.getMethod3());
    }
}
