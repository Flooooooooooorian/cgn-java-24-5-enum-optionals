public enum OrderStatus {
    IN_PROGRESS("P"),
    IN_DELIVERY("D"),
    COMPLETED("C");

    private final String abbreviation;

    OrderStatus(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation() {
        return abbreviation;
    }
}
