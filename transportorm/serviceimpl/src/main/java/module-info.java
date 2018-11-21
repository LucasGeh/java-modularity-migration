module serviceimpl {
    requires transitive admin;
    provides service.AdminService with serviceimpl.VehicleService;

}