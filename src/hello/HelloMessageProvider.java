package hello;

public class HelloMessageProvider implements MessageProvider{

    @Override
    public String getMessage() {
        return "Hello, world!";
    }
}
