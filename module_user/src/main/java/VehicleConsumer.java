import service.AdminService;

import java.security.Provider;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class VehicleConsumer {

    AdminService carService;

    public VehicleConsumer() {
        this.carService = AdminService.newInstance()
                .stream()
                .filter(p -> p.type().isAnnotationPresent(CarService.class))
                .map(//TODO)
                .collect(Collectors.toList());
    }

    public void getCarData() {
        carService.retrieveData();
    }
}
