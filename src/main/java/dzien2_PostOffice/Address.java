package dzien2_PostOffice;

public class Address {

    private String street;
    private int houseNumber;
    private String ZIPcode;

    public Address(String street, int houseNumber, String ZIPcode) {
        this.street = street;
        this.houseNumber = houseNumber;
        this.ZIPcode = ZIPcode;
    }


    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", houseNumber=" + houseNumber +
                ", ZIPcode='" + ZIPcode + '\'' +
                '}';
    }
}
