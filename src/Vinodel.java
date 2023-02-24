import java.time.LocalDate;

public class Vinodel {
    private String fullName;
    private String brand;
    private int staj;
    private String adr;

    public Vinodel(String fullName, String brand, int staj, String adr) {
        this.fullName = fullName;
        this.brand = brand;
        this.staj = staj;
        this.adr = adr;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getStaj() {
        return staj;
    }

    public void setStaj(int staj) {
        this.staj = staj;
    }

    public String getAdr() {
        return adr;
    }

    public void setAdr(String adr) {
        this.adr = adr;
    }

    @Override
    public String toString() {
        return "Vinodel{" +
                "fullName='" + fullName +
                ", brand='" + brand +
                ", staj=" + staj +
                ", adr='" + adr;
    }
}
