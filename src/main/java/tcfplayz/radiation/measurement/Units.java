package tcfplayz.radiation.measurement;

public enum Units {
    becquerel("mg"),
    curie("mg"),
    sievert("hour");

    private String unit;
    Units(String unit) {
        this.unit = unit;
    }
}
