package travel_agent;

import java.util.List;

import static travel_agent.Continent.EU;

public class TravelAgent {
private TravelData travelData = new TravelData();

 public boolean bookOffer(float maxPricePerNight, int days, Continent destination, boolean dogAllowance){
     for (TripOffer trip: travelData.getTripData()){
         if (maxPricePerNight >= trip.getPricePerNight() && days <= trip.getDays() && destination == trip.getDestination()
                 && dogAllowance == trip.isDogAllowance()){
             return true;

         }
         travelData.deleteTrip(trip);
     }


     return false;
 }

}
