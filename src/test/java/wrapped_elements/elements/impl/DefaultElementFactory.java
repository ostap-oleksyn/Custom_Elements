package wrapped_elements.elements.impl;

import org.openqa.selenium.WebElement;
import wrapped_elements.elements.interfaces.Element;
import wrapped_elements.elements.factory.ElementFactory;

import java.lang.reflect.InvocationTargetException;

import static java.text.MessageFormat.format;

public final class DefaultElementFactory implements ElementFactory {

    @Override
    public <E extends Element> E create(final Class<E> elementClass, final WebElement wrappedElement) {
        try {
            return findImplementationFor(elementClass)
                    .getDeclaredConstructor(WebElement.class)
                    .newInstance(wrappedElement);
        } catch (InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    private <E extends Element> Class<? extends E> findImplementationFor(final Class<E> elementClass) {
        try {
            return (Class<? extends E>) Class.forName(format("{0}.{1}Impl", getClass().getPackage().getName(), elementClass.getSimpleName()));
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
