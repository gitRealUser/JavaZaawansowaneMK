package dzien2_Warsztat;

public class Receipt {
    private int oneWheelFixingPrice;
    private String repairingType;
    private int numberOfServices;
    private int sum = numberOfServices *oneWheelFixingPrice;

    public Receipt(int oneWheelFixingPrice, String repairingType, int numberOfServices) {
        this.oneWheelFixingPrice = oneWheelFixingPrice;
        this.repairingType = repairingType;
        this.numberOfServices = numberOfServices;
        sum = numberOfServices * oneWheelFixingPrice;
    }



    @Override
    public String toString() {
        return "Receipt{" +
                "oneWheelFixingPrice=" + oneWheelFixingPrice +
                ", repairingType='" + repairingType + '\'' +
                ", numberOfServices=" + numberOfServices +
                ", sum=" + sum +
                '}';
    }
}
