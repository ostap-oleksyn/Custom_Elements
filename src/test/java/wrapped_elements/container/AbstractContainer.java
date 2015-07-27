package wrapped_elements.container;

import org.openqa.selenium.WebElement;


public abstract class AbstractContainer implements Container{


        private WebElement wrappedElement;

        @Override
        public final void init(final WebElement wrappedElement) {
            this.wrappedElement = wrappedElement;
        }


        public boolean isDisplayed() {
            return wrappedElement.isDisplayed();
        }
}
