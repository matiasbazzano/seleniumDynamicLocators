package enums;

public enum ElementType {
    CHECKBOX(1),
    DIV(2),
    INPUT(3),
    BUTTON(4),
    RADIO(5),
    TEXTAREA(6),
    SELECT(7);

    private final int id;

    ElementType(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}