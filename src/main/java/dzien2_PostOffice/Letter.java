package dzien2_PostOffice;

public class Letter {

    private String senderAddress;
    private String recipientAddress;
    private boolean priority = false;
    private String status = "created";

    public Letter(String senderAddress, String recipientAddress) {
        this.senderAddress = senderAddress;
        this.recipientAddress = recipientAddress;

    }

    double letterPrice (boolean priority){
        if(priority){
            return 8.5;
        }
        else{
            return 6.0;
        }
    }


    @Override
    public String toString() {
        return "Letter{" +
                "senderAddress='" + senderAddress + '\'' +
                ", recipientAddress='" + recipientAddress + '\'' +
                ", priority=" + priority +
                ", status='" + status + '\'' +
                '}';
    }
}
