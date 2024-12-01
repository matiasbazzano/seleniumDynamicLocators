package enums;

public enum ElementType {
    CHECKBOX(1, "checkbox"),
    DIV(2, "div"),
    INPUT(3, "input"),
    BUTTON(4, "button"),
    RADIO(5, "radio"),
    TEXTAREA(6, "textarea"),
    SELECT(7, "select"),
    SPAN(8, "span"),
    LABEL(9, "label");

    private final int id;
    private final String elementTag;

    ElementType(int id, String elementTag) {
        this.id = id;
        this.elementTag = elementTag;
    }

    public int getId() {
        return id;
    }

    public String getElementTag() {
        return elementTag;
    }
}
