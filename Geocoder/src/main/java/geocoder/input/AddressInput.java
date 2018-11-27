package geocoder.input;

public class AddressInput {
    private String input;

    public AddressInput (String input) {
        this.setInput(input);
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getInput () {
        return input;
    }
}
