import java.util.Objects;

public class City {
    String cityName;
    String stateName;
    String pincode;
    String country;

    public City(String cityName, String stateName, String pincode, String country) {
        this.cityName = cityName;
        this.stateName = stateName;
        this.pincode = pincode;
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof City)) return false;
        City city = (City) o;
        return cityName.equals(city.cityName) && pincode.equals(city.pincode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cityName, pincode);
    }

    @Override
    public String toString() {
        return cityName + ", " + stateName;
    }
}
