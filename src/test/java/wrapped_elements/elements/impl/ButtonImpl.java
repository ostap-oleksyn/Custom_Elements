package wrapped_elements.elements.impl;


import org.openqa.selenium.WebElement;
import wrapped_elements.elements.interfaces.Button;
import wrapped_elements.elements.AbstractElementWrapper;

public final class ButtonImpl extends AbstractElementWrapper implements Button {

    public ButtonImpl(final WebElement wrappedElement) {
        super(wrappedElement);
    }

    @Override
    public void click(){
        getWrappedElement().click();
    }
}
