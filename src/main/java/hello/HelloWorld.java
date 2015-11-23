package hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorld {

    public static void main(String[] args) {
//        MessageRenderer renderer = MessageSupportFactory.getInstance().getRenderer();
//        MessageProvider provider = MessageSupportFactory.getInstance().getProvider();
//        renderer.setMessageProvider(provider);
//        renderer.render();
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        MessageRenderer renderer = context.getBean("renderer", MessageRenderer.class);

        renderer.render();
    }

}
