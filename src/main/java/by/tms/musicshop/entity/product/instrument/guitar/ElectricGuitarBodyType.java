package by.tms.musicshop.entity.product.instrument.guitar;

public enum ElectricGuitarBodyType {
    STRATOCASTER("stratocaster"),
    SUPER_STRAT("super strat"),
    TELECASTER("telecaster"),
    LES_PAUL("les paul"),
    FLYING_V("flying v");

    private final String displayName;

    ElectricGuitarBodyType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
