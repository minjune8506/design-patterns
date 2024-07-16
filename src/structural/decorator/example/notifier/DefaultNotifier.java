package structural.decorator.example.notifier;

public class DefaultNotifier implements Notifier {

    @Override
    public void send(String message) {
        System.out.println("default notification");
    }
}
