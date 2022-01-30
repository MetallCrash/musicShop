package by.tms.musicshop.entity.product.instrument.drums;

public enum DrumsCompany {
    YAMAHA("yamaha"),
    TAMA("tama"),
    SONOR("sonor"),
    DW("dw"),
    PEARL("pearl");

    private final String displayName;

    DrumsCompany(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
