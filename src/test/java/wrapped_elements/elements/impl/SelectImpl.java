package wrapped_elements.elements.impl;


import org.openqa.selenium.WebElement;
import wrapped_elements.elements.AbstractElementWrapper;
import wrapped_elements.elements.interfaces.Select;

import java.util.List;

public final class SelectImpl extends AbstractElementWrapper implements Select {

    public SelectImpl(WebElement wrappedElement) {
        super(wrappedElement);
    }

    private org.openqa.selenium.support.ui.Select getSelect() {
        return new org.openqa.selenium.support.ui.Select(getWrappedElement());
    }

    public boolean isMultiple() {
        return getSelect().isMultiple();
    }

    public List<WebElement> getOptions() {
        return getSelect().getOptions();
    }

    public List<WebElement> getAllSelectedOptions() {
        return getSelect().getAllSelectedOptions();
    }

    public WebElement getFirstSelectedOption() {
        return getSelect().getFirstSelectedOption();
    }

    public boolean hasSelectedOption() {
        for (WebElement option : getOptions()) {
            if (option.isSelected()) {
                return true;
            }
        }

        return false;
    }

    public void selectByVisibleText(String text) {
        getSelect().selectByVisibleText(text);
    }

    public void selectByIndex(int index) {
        getSelect().selectByIndex(index);
    }

    public void selectByValue(String value) {
        getSelect().selectByValue(value);
    }

    public void deselectAll() {
        getSelect().deselectAll();
    }

    public void deselectByValue(String value) {
        getSelect().deselectByValue(value);
    }

    public void deselectByIndex(int index) {
        getSelect().deselectByIndex(index);
    }

    public void deselectByVisibleText(String text) {
        getSelect().deselectByVisibleText(text);
    }
}
