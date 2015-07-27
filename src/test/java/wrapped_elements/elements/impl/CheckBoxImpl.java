package wrapped_elements.elements.impl;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import wrapped_elements.elements.AbstractElementWrapper;
import wrapped_elements.elements.interfaces.CheckBox;

import java.util.NoSuchElementException;

public final class CheckBoxImpl extends AbstractElementWrapper implements CheckBox {

    public CheckBoxImpl(WebElement wrappedElement) {
        super(wrappedElement);
    }

    public WebElement getLabel() {
        try {
            return getWrappedElement().findElement(By.xpath("following-sibling::label"));
        } catch (NoSuchElementException e) {
            return null;
        }
    }

    public String getLabelText() {
        WebElement label = getLabel();
        return label == null ? null : label.getText();
    }

    public String getText() {
        return getLabelText();
    }

    public void select() {
        if (!isSelected()) {
            getWrappedElement().click();
        }
    }

    public void deselect() {
        if (isSelected()) {
            getWrappedElement().click();
        }
    }

    public void set(boolean value) {
        if (value) {
            select();
        } else {
            deselect();
        }
    }

    public boolean isSelected() {
        return getWrappedElement().isSelected();
    }
}
