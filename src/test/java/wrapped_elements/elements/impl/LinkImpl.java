package wrapped_elements.elements.impl;


import wrapped_elements.elements.AbstractElementWrapper;
import wrapped_elements.elements.interfaces.Link;
import org.openqa.selenium.WebElement;

public final class LinkImpl extends AbstractElementWrapper implements Link{

    public LinkImpl(final WebElement wrappedElement) {
        super(wrappedElement);
    }

    @Override
    public void click() {
        getWrappedElement().click();
    }

    @Override
    public String getReference() {
        return getWrappedElement().getAttribute("href");
    }

    @Override
    public String getText() {
        return getWrappedElement().getText();
    }
}
