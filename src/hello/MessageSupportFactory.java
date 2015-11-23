package hello;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class MessageSupportFactory {

    private static MessageSupportFactory instance =
            new MessageSupportFactory();
    private MessageProvider provider;
    private MessageRenderer renderer;

    private MessageSupportFactory() {
        Properties props = new Properties();
        try {
            props.load(new FileInputStream("message.properties"));
            String rendererClassName = props.getProperty("renderer");
            String providerClassName = props.getProperty("provider");

            renderer = (MessageRenderer) Class.forName(rendererClassName).newInstance();
            provider = (MessageProvider) Class.forName(providerClassName).newInstance();
        } catch (IOException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public static MessageSupportFactory getInstance() {
        return instance;
    }

    public MessageProvider getProvider() {
        return provider;
    }

    public MessageRenderer getRenderer() {
        return renderer;
    }
}
