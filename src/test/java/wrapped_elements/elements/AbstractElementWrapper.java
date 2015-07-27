package wrapped_elements.elements;


import org.openqa.selenium.WebElement;
import wrapped_elements.elements.interfaces.Element;

public abstract class AbstractElementWrapper implements Element {
    private final WebElement wrappedElement;

    public AbstractElementWrapper(final WebElement wrappedElement) {
        this.wrappedElement = wrappedElement;
    }


    protected WebElement getWrappedElement() {
        return wrappedElement;
    }

    public boolean isDisplayed() {
        return wrappedElement.isDisplayed();
    }

    public boolean isEnabled() {
        return wrappedElement.isEnabled();
    }

    public boolean isSelected() {
        return getWrappedElement().isSelected();
    }

}
