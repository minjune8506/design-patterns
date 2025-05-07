package structural.decorator.code.notifier;

public abstract class NotifierDecorator implements Notifier {

    private final Notifier notifier;

    public NotifierDecorator(Notifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public void send(String message) {
        this.notifier.send(message);
    }
}
