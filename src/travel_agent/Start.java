package travel_agent;

import travel_agent.Continent;
import travel_agent.TravelAgent;
import travel_agent.TravelData;
import travel_agent.TripOffer;

public class Start {
    public static void main(String[] args) {

        TravelData travelData = new TravelData();
        TravelAgent travelAgent = new TravelAgent();

        TripOffer trip1 = new TripOffer(231f,7, Continent.AF,true);
        TripOffer trip2 = new TripOffer(100f, 14, Continent.EU, true);
        TripOffer trip3 = new TripOffer(400f, 22, Continent.AU, false);
        TripOffer trip4 = new TripOffer(200f,14,Continent.NA, false);

        travelData.addTrip(trip1);
        travelData.addTrip(trip2);
        travelData.addTrip(trip3);
        travelData.addTrip(trip4);


        System.out.println(travelAgent.bookOffer(350,7, Continent.AU, false));





    }
}
