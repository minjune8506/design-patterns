package behavioral.factorymethod.code.cross_platform.factory;

import behavioral.factorymethod.code.cross_platform.buttons.Button;
import behavioral.factorymethod.code.cross_platform.buttons.WindowsButton;

public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
