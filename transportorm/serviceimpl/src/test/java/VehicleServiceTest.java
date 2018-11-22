import com.google.gson.JsonObject;
import org.junit.jupiter.api.Test;
import serviceimpl.VehicleService;


public class VehicleServiceTest {

    private VehicleService vs = new VehicleService();


    /**
     * I know this is lazy ok??
     */
    @Test
    public void testGetJsonData() {

        JsonObject jo = vs.getJsonData();
        System.out.println(jo.get("cars"));

    }
}
