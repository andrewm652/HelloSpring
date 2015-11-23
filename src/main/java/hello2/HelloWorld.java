package hello2;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class HelloWorld implements InitializingBean, DisposableBean {
    {
        System.out.println("init instance");
    }

    private String message;

    public String getMessage() {
        System.out.println("Your message: " + message);
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("bean initialized");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("bean destroyed");
    }

    public void shutdown() {
        System.out.println("shutdown");
    }

    public void init() {
        System.out.println("init");
    }
}
