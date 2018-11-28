package Geocoder.Process;

import com.google.maps.GeocodingApi;
import Geocoder.Output.OutputCoordinates;
import Geocoder.Input.AddressInput;
import com.google.maps.GeoApiContext;
import com.google.maps.model.GeocodingResult;

public class Processor {
    private GeoApiContext GContext;
    public Processor() {
        GContext = new GeoApiContext.Builder().apiKey("AIzaSyAxUKib46hQw6-CvtrfDIfGYDD9CyrYBfo").build();
    }

    public OutputCoordinates process(AddressInput definetlyNotABombingTarget) {
        try {
            GeocodingResult[] gResults = GeocodingApi.geocode(GContext, definetlyNotABombingTarget.getInput()).await();
            double lat = gResults[0].geometry.location.lat;
            double lng = gResults[0].geometry.location.lng;
            return new OutputCoordinates(Double.toString(lat), Double.toString(lng));
        } catch (Exception e) {
            System.err.println(e.getMessage());
            System.err.println("We gave you a chance and you disappoint us...");
            System.err.println("ARE WE A JOKE TO YOUS?! (READ IN SCOTTISH ACCENT)");
            return null;
        }
    }
}
