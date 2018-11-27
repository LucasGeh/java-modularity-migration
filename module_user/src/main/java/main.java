import geocoder.input.AddressInput;
import geocoder.output.OutputCoordinates;
import geocoder.process.Processor;

public class main {
    public static void main(String[] args) {
        try {
            var input = new AddressInput("tegelseweg 255");
            var proc = new Processor();
            var output = proc.process(input);
            System.out.println(output.getLat());
            System.exit(0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
