package puzzle;

public class Number {
    private final int value;
    private final Number parent;

    public Number(int value, Number parent) {
        this.value = value;
        this.parent = parent;
    }
    public int getValue() {
        return value;
    }

    public Number getParent() {
        return parent;
    }
}

