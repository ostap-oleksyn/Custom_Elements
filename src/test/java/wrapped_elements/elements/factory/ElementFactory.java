package wrapped_elements.elements.factory;


import org.openqa.selenium.WebElement;
import wrapped_elements.elements.interfaces.Element;

public interface ElementFactory {

    <E extends Element> E create(Class<E> elementClass, WebElement wrappedElement);

}
