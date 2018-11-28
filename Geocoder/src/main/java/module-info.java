module geocoder_module {
    // exports
    exports Geocoder.Output;
    exports Geocoder.Input;
    exports Geocoder.Process;

    //imports
    requires google.maps.services;
    requires java.sql;
}