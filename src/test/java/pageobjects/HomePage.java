package pageobjects;


import wrapped_elements.elements.interfaces.TextInput;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = ".//*[@id='lst-ib']")
    TextInput searchField;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public ResultPage searchFor(String term) {
        searchField.sendKeys(term);
        return new ResultPage(driver);
    }

}
