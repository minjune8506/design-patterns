package behavioral.factorymethod.code.cross_platform;

import behavioral.factorymethod.code.cross_platform.factory.Dialog;
import behavioral.factorymethod.code.cross_platform.factory.HtmlDialog;
import behavioral.factorymethod.code.cross_platform.factory.WindowsDialog;

public class Main {

    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    private static void configure() {
        if (System.getProperty("os.name").toLowerCase().contains("windows")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    private static void runBusinessLogic() {
        dialog.renderWindow();
    }
}
