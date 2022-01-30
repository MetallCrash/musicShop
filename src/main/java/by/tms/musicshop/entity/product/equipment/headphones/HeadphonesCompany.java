package by.tms.musicshop.entity.product.equipment.headphones;

public enum HeadphonesCompany {
    SENNHEISER("sennheiser"),
    AKG("akg"),
    BOSS("boss"),
    KORG("korg"),
    MARSHALL("marshall");

    private final String displayName;

    HeadphonesCompany(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
