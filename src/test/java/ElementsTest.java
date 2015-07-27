import org.testng.annotations.Test;
import pageobjects.HomePage;
import pageobjects.ResultPage;

public class ElementsTest extends TestRunner {

    @Test
    public void testElements() {
        HomePage homePage = new HomePage(driver);

        ResultPage resultPage = homePage.searchFor("selenium grid");

        resultPage.clickSearchButton();

        System.out.println(resultPage.getLinkRef());

        System.out.println(resultPage.getImage().getAlt());

        System.out.println(resultPage.getImage().getSource());

        resultPage.clickFirstLink();
    }
}
