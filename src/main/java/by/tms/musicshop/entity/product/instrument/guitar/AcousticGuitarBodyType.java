package by.tms.musicshop.entity.product.instrument.guitar;

public enum AcousticGuitarBodyType {
    DREADNOUGHT("dreadnought"),
    ROUND_SHOULDER_DREADNOUGHT("round shoulder dreadnought"),
    PARLOUR("parlour"),
    JUMBO("jumbo"),
    AUDITORIUM("auditorium"),
    GRAND_AUDITORIUM("grand auditorium"),
    CLASSICAL_GUITAR("classical guitar");

    private final String displayName;

    AcousticGuitarBodyType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
