package ReadFileCVS;

public class Country {
    private int id;
    private String code;
    private String country;

    public Country() {

    }

    public Country(int id, String code, String country) {
        this.id = id;
        this.code = code;
        this.country = country;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", country='" + country + '\'' +
                '}';

    }


}
