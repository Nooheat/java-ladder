package domain;

public enum Ladder {
    EMPTY("     "),
    HYPHEN("-----");

    private String name;

    Ladder(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
