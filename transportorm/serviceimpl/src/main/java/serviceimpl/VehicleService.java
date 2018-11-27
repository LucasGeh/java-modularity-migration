package serviceimpl;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import service.AdminService;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class VehicleService implements service.AdminService {

    public VehicleService() {
    }


    @Override
    public void printServiceInfo() {
        System.out.println("Provider for finding vehicles");
    }

    @Override
    public void retrieveData() {
        //Let subclasses handle this
    }

    public JsonObject getJsonData() {
        JsonParser parser = new JsonParser();
        try {
            return (JsonObject) parser.parse(new JsonReader(new FileReader("vehicles.json")));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }


    @NotNull
    @Contract(" -> new")
    public static AdminService provider() {
        return new VehicleService();
    }


    class CarData {
        private String brand;
        private String propulsionSystem;
        private int amountDoors;
        private int wheelDiameter;
        private String type;
        private int horsepower;

        public void setBrand(String brand) { this.brand = brand; }

        public void setPropulsionSystem(String propulsionSystem) { this.propulsionSystem = propulsionSystem; }

        public void setAmountDoors(int amountDoors) { this.amountDoors = amountDoors; }

        public void setWheelDiameter(int wheelDiameter) { this.wheelDiameter = wheelDiameter; }

        public void setType(String type) { this.type = type; }

        public void setHorsepower(int horsepower) { this.horsepower = horsepower; }

        @Override
        public String toString() {
            return "CarData{" +
                    "brand='" + brand + '\'' +
                    ", propulsionSystem='" + propulsionSystem + '\'' +
                    ", amountDoors=" + amountDoors +
                    ", wheelDiameter=" + wheelDiameter +
                    ", type='" + type + '\'' +
                    ", horsepower=" + horsepower +
                    '}';
        }
    }

    class BoatData {
        private String brand;
        private String type;
        private int length;
        private int amountDecks;
        private int tonnage;
        private int topSpeed;

        public void setBrand(String brand) { this.brand = brand; }

        public void setType(String type) { this.type = type; }

        public void setLength(int length) { this.length = length; }

        public void setAmountDecks(int amountDecks) { this.amountDecks = amountDecks; }

        public void setTonnage(int tonnage) { this.tonnage = tonnage; }

        public void setTopSpeed(int topSpeed) { this.topSpeed = topSpeed; }

        @Override
        public String toString() {
            return "BoatData{" +
                    "brand='" + brand + '\'' +
                    ", type='" + type + '\'' +
                    ", length=" + length +
                    ", amountDecks=" + amountDecks +
                    ", tonnage=" + tonnage +
                    ", topSpeed=" + topSpeed +
                    '}';
        }
    }

    class BikeData {
        private String brand;
        private String type;
        private char gender;
        private float height;

        public void setBrand(String brand) { this.brand = brand; }

        public void setType(String type) { this.type = type; }

        public void setGender(char gender) { this.gender = gender; }

        public void setHeight(float height) { this.height = height; }

        @Override
        public String toString() {
            return "BikeData{" +
                    "brand='" + brand + '\'' +
                    ", type='" + type + '\'' +
                    ", gender=" + gender +
                    ", height=" + height +
                    '}';
        }
    }

    class TruckData {
        private String brand;
        private String type;
        private float maxWeight;
        private int horsepower;

        public void setBrand(String brand) { this.brand = brand; }

        public void setType(String type) { this.type = type; }

        public void setMaxWeight(float maxWeight) { this.maxWeight = maxWeight; }

        public void setHorsepower(int horsepower) { this.horsepower = horsepower; }

        @Override
        public String toString() {
            return "TruckData{" +
                    "brand='" + brand + '\'' +
                    ", type='" + type + '\'' +
                    ", maxWeight=" + maxWeight +
                    ", horsepower=" + horsepower +
                    '}';
        }
    }


}
