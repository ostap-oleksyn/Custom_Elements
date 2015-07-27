package wrapped_elements.elements.impl;

import org.openqa.selenium.WebElement;
import wrapped_elements.elements.AbstractElementWrapper;
import wrapped_elements.elements.interfaces.Image;


public final class ImageImpl extends AbstractElementWrapper implements Image {

    public ImageImpl(WebElement wrappedElement) {
        super(wrappedElement);
    }

    @Override
    public void click() {
        getWrappedElement().click();
    }

    @Override
    public String getSource() {
        return getWrappedElement().getAttribute("src");
    }

    @Override
    public String getAlt() {
        return getWrappedElement().getAttribute("alt");
    }
}
