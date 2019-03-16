package travel_agent;

public enum Continent {
    EU("Europe"),AF("Africa"), AS("Asia"), AU("Australia"), NA("North America"),
    SA("South America"), AN("Antarctica");

    private final String description;

    // Konstruktor
    private Continent(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}


