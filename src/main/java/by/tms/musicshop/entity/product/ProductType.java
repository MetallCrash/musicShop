package by.tms.musicshop.entity.product;

public enum ProductType {
    ELECTRIC_GUITAR("electric guitar"),
    ACOUSTIC_GUITAR("acoustic guitar"),
    BASS_GUITAR("bass guitar"),
    SYNTHESIZER("synthesizer"),
    DRUMS("drums"),
    MICROPHONE("microphone"),
    HEADPHONES("headphones");

    private final String displayName;

    ProductType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
