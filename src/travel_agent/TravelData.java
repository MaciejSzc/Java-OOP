package travel_agent;

import java.util.ArrayList;
import java.util.List;

public class TravelData {

     private List<TripOffer> tripData = new ArrayList<>();

    public void addTrip(TripOffer tripOffer){
        tripData.add(tripOffer);

    }
    public void deleteTrip(TripOffer tripOffer){
        tripData.remove(tripOffer);
    }

    public List<TripOffer> getTripData(){
        return tripData;
    }
    public boolean bookOffer(float maxPricePerNight, int days, boolean dogAllowance){
        for (TripOffer trip: tripData){
            if (maxPricePerNight >= trip.getPricePerNight() && days <= trip.getDays() &&
                    dogAllowance == trip.isDogAllowance()){

                return true;

            }

        }


        return false;
    }
}
