package structural.decorator.example.notifier;

public class Main {

    public static void main(String[] args) {
        // user request
        boolean useFacebook = true;
        boolean useSlack = true;
        boolean useSMS = true;

        Notifier notifier = new DefaultNotifier();
        if (useFacebook) {
            notifier = new FacebookNotifier(notifier);
        }
        if (useSlack) {
            notifier = new SlackNotifier(notifier);
        }
        if (useSMS) {
            notifier = new SMSNotifier(notifier);
        }

        notifier.send("Hi");
    }
}
