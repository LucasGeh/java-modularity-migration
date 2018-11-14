package madness.geocoder.output;

public class OutputCoordinates {
    private final  String lat;
    private final String lng;

    public OutputCoordinates (String lat, String lng) {
        this.lat = lat;
        this.lng = lng;
    }

    public String getLat() {
        return lat;
    }

    public String getLng() {
        return lng;
    }
}
