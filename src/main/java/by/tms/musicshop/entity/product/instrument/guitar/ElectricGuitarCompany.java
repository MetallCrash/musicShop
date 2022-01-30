package by.tms.musicshop.entity.product.instrument.guitar;

public enum ElectricGuitarCompany {
    IBANEZ("ibanez"),
    JACKSON("jackson"),
    GIBSON("gibson"),
    FENDER("fender"),
    YAMAHA("yamaha");

    private final String displayName;

    ElectricGuitarCompany(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
