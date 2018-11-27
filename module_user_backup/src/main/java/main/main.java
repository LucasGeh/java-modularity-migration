package main;

import geocoder.input.AddressInput;
import geocoder.output.OutputCoordinates;
import geocoder.process.Processor;

public class main {
    public static void main(String[] args) {
        var input = new AddressInput("akkerwinde 57");
        var processor = new geocoder.process.Processor();
        var output = processor.process(input);
        System.out.println(output.getLat());
    }
}
