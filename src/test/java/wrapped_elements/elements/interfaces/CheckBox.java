package wrapped_elements.elements.interfaces;


import org.openqa.selenium.WebElement;

public interface CheckBox {

    WebElement getLabel();

    String getLabelText();

    String getText();

    void select();

    void deselect();

    void set(boolean value);

    boolean isSelected();

}
