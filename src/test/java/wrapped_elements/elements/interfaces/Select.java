package wrapped_elements.elements.interfaces;


import org.openqa.selenium.WebElement;

import java.util.List;

public interface Select extends Element {

    boolean isMultiple();

    List<WebElement> getOptions();

    List<WebElement> getAllSelectedOptions();

    WebElement getFirstSelectedOption();

    boolean hasSelectedOption();

    void selectByVisibleText(String text);

    void selectByIndex(int index);

    void selectByValue(String value);

    void deselectAll();

    void deselectByValue(String value);

    void deselectByIndex(int index);

    void deselectByVisibleText(String text);
}
