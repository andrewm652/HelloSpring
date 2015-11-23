package hello;

import org.springframework.beans.factory.InitializingBean;

public class StandardOutRenderer implements MessageRenderer, InitializingBean {

    private MessageProvider provider;

    @Override
    public void render() {
        if (provider == null) {
            throw new RuntimeException("no provider");
        }
        System.out.println(provider.getMessage());
    }

    @Override
    public void setMessageProvider(MessageProvider provider) {
        this.provider = provider;
    }

    @Override
    public MessageProvider getMessageProvider() {
        return provider;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("props inited");
    }
}
