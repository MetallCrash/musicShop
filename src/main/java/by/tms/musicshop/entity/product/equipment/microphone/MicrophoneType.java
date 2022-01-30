package by.tms.musicshop.entity.product.equipment.microphone;

public enum MicrophoneType {
    DYNAMIC("dynamic"),
    LARGE_CONDENSER("large condenser"),
    SMALL_CONDENSER("small condenser"),
    RIBBON("ribbon");

    private final String displayName;

    MicrophoneType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
