module madness.modularity.migration {
    // exports
    exports madness.geocoder.output;
    exports madness.geocoder.input;
    exports madness.geocoder.process;

    //imports
    requires google.maps.services;
    requires java.sql;
}