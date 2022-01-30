package by.tms.musicshop.entity.product;

public enum Material {
    MAHOGANY("mahogany"),
    ASH("ash"),
    MAPLE("maple"),
    BASSWOOD("basswood"),
    AGATHIS("agathis"),
    ALDER("alder"),
    POPLAR("polar"),
    WALNUT("walnut"),
    SPRUCE("spruce"),
    HOLLY("holly");

    private final String displayName;

    Material(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}