package by.tms.musicshop.entity.product.equipment.headphones;

public enum HeadphonesType {
    OVER_EAR("over ear"),
    ON_EAR("on ear"),
    EARBUDS("earbuds"),
    CLOSED_BACK("closed back"),
    OPEN_BACK("open back");

    private final String displayName;

    HeadphonesType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
