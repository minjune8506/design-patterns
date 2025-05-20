package behavioral.factorymethod.code.cross_platform.factory;

import behavioral.factorymethod.code.cross_platform.buttons.Button;

public abstract class Dialog {

    public void renderWindow() {
        var okButton = createButton();
        okButton.render();
    }

    public abstract Button createButton();

}
