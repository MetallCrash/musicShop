package by.tms.musicshop.entity.product.instrument.guitar;

public enum BassGuitarBodyType {
    OCTAVIA("octavia"),
    SALVUS("salvus"),
    MORBUS("morbus"),
    GOLIATH("goliath"),
    KING_V("king v"),
    TJ("tj");

    private final String displayName;

    BassGuitarBodyType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
