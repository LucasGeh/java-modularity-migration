module serviceimpl {
    requires transitive admin;
    requires gson;
    requires annotations;
    provides service.AdminService with serviceimpl.VehicleService;

}