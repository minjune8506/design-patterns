package behavioral.factorymethod.code.cross_platform.factory;

import behavioral.factorymethod.code.cross_platform.buttons.Button;
import behavioral.factorymethod.code.cross_platform.buttons.HtmlButton;

public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
