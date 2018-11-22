module serviceimpl {
    requires transitive admin;
    requires gson;
    provides service.AdminService with serviceimpl.VehicleService;
}