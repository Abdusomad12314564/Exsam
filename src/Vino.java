import java.time.LocalDate;

public class Vino {
    private String name;
    private String brand;
    private String country;
    private int year;

    public Vino(String name, String brand, String country, int year) {
        this.name = name;
        this.brand = brand;
        this.country = country;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Vino{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", country='" + country + '\'' +
                ", year=" + (2023-year);
    }
}
