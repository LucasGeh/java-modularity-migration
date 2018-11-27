module geocoder_module {
    // exports
    exports geocoder.output;
    exports geocoder.input;
    exports geocoder.process;

    //imports
    requires google.maps.services;
    requires java.sql;
}