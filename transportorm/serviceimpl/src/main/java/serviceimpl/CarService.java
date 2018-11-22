package serviceimpl;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class CarService extends VehicleService {

    public CarService() {
    }

    public JsonElement retrieveCarData() {
        JsonObject obj = super.getJsonData();
        return obj.get("cars");
    }

    @Override
    public void retrieveData() {
        JsonObject object = super.getJsonData();
        System.out.println(object.get("cars"));
    }
}
