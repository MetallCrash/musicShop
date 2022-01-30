package by.tms.musicshop.entity.product.instrument.guitar;

public enum AcousticGuitarCompany {
    TAYLOR("taylor"),
    MARTIN("martin"),
    FENDER("fender"),
    GIBSON("gibson"),
    YAMAHA("yamaha");

    private final String displayName;

    AcousticGuitarCompany(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
