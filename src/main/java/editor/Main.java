package editor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("Beans4.xml");
        TextEditor te = context.getBean("editor", TextEditor.class);
        te.spellCheck();
    }
}
