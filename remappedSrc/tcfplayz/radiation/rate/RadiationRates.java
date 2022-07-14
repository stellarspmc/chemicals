package tcfplayz.radiation.rate;

public enum RadiationRates {
    // becquerels / mg
    HYDROGEN(0.0),
    HELIUM(0.0),
    LITHIUM(0.0),
    BERYLLIUM(0.0),
    BORON(0.0),
    CARBON(0.0),
    NITROGEN(0.0),
    OXYGEN(0.0),
    FLUORINE(0.0),
    NEON(0.0),
    SODIUM(0.0),
    MAGNESIUM(0.0),
    ALUMINUM(0.0),
    SILICON(0.0),
    PHOSPHORUS(0.0),
    SULFUR(0.0),
    CHLORINE(0.0),
    ARGON(0.0),
    CALCIUM(0.0),
    SCANDIUM(0.0),
    TITANIUM(0.0),
    VANADIUM(0.0),
    CHROMIUM(0.0),
    MANGANESE(0.0),
    IRON(0.0),
    COBALT(0.0),
    NICKEL(0.0),
    COPPER(0.0),
    ZINC(0.0),
    GALLIUM(0.0),
    GERMANIUM(0.0),
    ARSENIC(0.0),
    SELENIUM(0.0),
    BROMINE(0.0),
    IODINE(0.0),
    XENON(0.0),
    CAESIUM(0.0),
    BARIUM(0.0),
    LANTHANUM(0.0),
    CERIUM(0.0),
    PRASEODYMIUM(0.0),
    NEODYMIUM(0.0),
    PROMETHIUM(0.0),
    SAMARIUM(0.0),
    EUROPIUM(0.0),
    GADOLINIUM(0.0),
    TERBIUM(0.0),
    DYSPROSIUM(0.0),
    HOLMIUM(0.0),
    ERBIUM(0.0),
    THULIUM(0.0),
    YTTERBIUM(0.0),
    LUTETIUM(0.0),
    HAFNIUM(0.0),
    TANTALUM(0.0),
    TUNGSTEN(0.0),
    RHENIUM(0.0),
    OCEANIUM(0.0),
    PLATINUM(0.0),
    URANIUM(25.4),
    ;

    private double rate;

    RadiationRates(double rate) {
        this.rate = rate;
    }

    public double getRate() {
        return rate;
    }
}
