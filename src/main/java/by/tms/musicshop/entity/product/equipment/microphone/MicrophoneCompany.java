package by.tms.musicshop.entity.product.equipment.microphone;

public enum MicrophoneCompany {
    RODE("rode"),
    AUDIO_TECHNICA("audio technica"),
    AKG("akg"),
    SENNHEISER("sennheiser"),
    BEHRINGER("behringer");

    private final String displayName;

    MicrophoneCompany(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
