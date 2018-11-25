import service.AdminService;

import java.util.ServiceLoader;

public class VehicleConsumer {

    private AdminService carService;
    private ServiceLoader<AdminService> loader;

    public VehicleConsumer() {
        System.out.println("Loading services");
        loader = ServiceLoader.load(AdminService.class);
        for (AdminService service: loader) {
            if (service.getClass().getSimpleName().equals("CarService")) {
                System.out.println(service.getClass().getSimpleName());
                carService = service;
            }
        }
    }

    public void getCarData() {
        carService.retrieveData();
    }

}
