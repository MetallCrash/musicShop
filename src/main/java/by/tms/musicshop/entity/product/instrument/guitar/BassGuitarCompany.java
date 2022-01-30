package by.tms.musicshop.entity.product.instrument.guitar;

public enum BassGuitarCompany {
    IBANEZ("ibanez"),
    HOFNER("hofner"),
    YAMAHA("yamaha"),
    FENDER("fender"),
    RICKENBACKER("rickenbacker");

    private final String displayName;

    BassGuitarCompany(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
