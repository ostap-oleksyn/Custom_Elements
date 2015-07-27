package wrapped_elements.elements.interfaces;


public interface TextInput extends Element {

    void clear();

    void sendKeys(CharSequence...chars);

    String getText();
}
