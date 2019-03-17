package travel_agent;

public class TripOffer {

    private float pricePerNight;
    private int days;
    private Continent destination;
    private boolean dogAllowance;

    public TripOffer(float pricePerNight, int days, Continent destination, boolean dogAllowance) {
        this.pricePerNight = pricePerNight;
        this.days = days;
        this.destination = destination;
        this.dogAllowance = dogAllowance;
    }

    public float getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(float pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public Continent getDestination() {
        return destination;
    }

    public void setDestination(Continent destination) {
        this.destination = destination;
    }

    public boolean isDogAllowance() {
        return dogAllowance;
    }

    public void setDogAllowance(boolean dogAllowance) {
        this.dogAllowance = dogAllowance;
    }
}
