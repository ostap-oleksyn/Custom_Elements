package wrapped_elements.elements.impl;


import org.openqa.selenium.WebElement;
import wrapped_elements.elements.AbstractElementWrapper;
import wrapped_elements.elements.interfaces.TextInput;

public final class TextInputImpl extends AbstractElementWrapper implements TextInput {

    public TextInputImpl(final WebElement wrappedElement) {
        super(wrappedElement);
    }

    @Override
    public void clear() {
        getWrappedElement().clear();
    }

    @Override
    public void sendKeys(CharSequence...chars) {
        getWrappedElement().sendKeys(chars);
    }

    @Override
    public String getText() {
        if ("textarea".equals(getWrappedElement().getTagName())) {
            return getWrappedElement().getText();
        }

        String enteredText = getWrappedElement().getAttribute("value");
        if (enteredText == null) {
            return "";
        }
        return enteredText;
    }

}
