package dzien2_PostOffice;

import java.util.Random;

public class Parcel {

    private String sender;
    private String recipient;
    private double weight;
    private boolean priority = false;

    private String status = "not created";

    private String[] people = new String[]{
            "Max",
            "John",
            "Michael",
            "Torsten"
    };


    public Parcel() {
        Random random = new Random();
        int random1 = random.nextInt(people.length);
        this.sender = people[random1];
        do {
            int random2 = random.nextInt(people.length);
            this.recipient = people[random2];
        } while (recipient.equals(sender));

        int random3 = random.nextInt(0, 2);
        this.priority = false;
        if (random3 == 0) {
            this.priority = true;
        }

        int random4 = random.nextInt(1, 1000);
        this.weight = random4;

    }

    public Parcel(String sender, String recipient, double weight) {
        this.sender = sender;
        this.recipient = recipient;
        this.weight = weight;
        if (weight < 0.001 || weight > 1000) {
            System.out.println("Wrong weight - try change data !!!");
        }
    }


    double calculation() {
        double fee = 0;
        if (weight <= 0.5) {
            fee += 5;
        } else if (weight > 0.5 && weight <= 1.0) {
            fee += 8;
        } else if (weight > 1 && weight <= 2.0) {
            fee += 12;
        }else  {
            fee += 12 + ((weight-2)*1);
        }

        if (priority == true){
            fee *= 1.1;
        }
//        System.out.println("It is " + fee + " PLN");
        return fee;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Parcel{" +
                "sender='" + sender + '\'' +
                ", recipient='" + recipient + '\'' +
                ", weight=" + weight +
                ", priority=" + priority +
                '}';
    }
}
