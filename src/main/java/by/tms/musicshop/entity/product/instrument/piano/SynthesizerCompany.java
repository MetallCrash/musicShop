package by.tms.musicshop.entity.product.instrument.piano;

public enum SynthesizerCompany {
    YAMAHA("yamaha"),
    KORG("korg"),
    BEHRINGER("behringer"),
    ROLAND("roland"),
    STUDIOLOGIC("studiologic");

    private final String displayName;

    SynthesizerCompany(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
