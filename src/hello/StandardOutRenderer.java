package hello;

public class StandardOutRenderer implements MessageRenderer {

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
}
