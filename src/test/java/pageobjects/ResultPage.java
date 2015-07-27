package pageobjects;


import wrapped_elements.elements.interfaces.Button;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import wrapped_elements.elements.interfaces.Image;
import wrapped_elements.elements.interfaces.Link;

public class ResultPage extends BasePage {

    @FindBy(xpath = ".//*[@class='lsb']")
    Button searchButton;

    @FindBy(xpath = "(.//*[@class='srg']//a)[1]")
    Link resultLink;

    @FindBy(xpath = "(.//*[@id='res']//img)[1]")
    Image resultImage;

    public ResultPage(WebDriver driver) {
        super(driver);
    }

    public void clickSearchButton(){
        searchButton.click();
    }

    public String getLinkRef(){
        return resultLink.getReference();
    }

    public Image getImage(){
        return this.resultImage;
    }

    public void clickFirstLink(){
        resultLink.click();
    }
}
