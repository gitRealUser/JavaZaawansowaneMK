package dzien2_PostOffice;

import java.util.Scanner;

public class PostOfficeDemo {

    public static void main(String[] args) {

        Parcel parcel1 = new Parcel("Tom", "Max", 2.333);
        Parcel parcel2 = new Parcel("Max", "Tom", 5.0);
        Parcel parcel3 = null;
//        System.out.println(parcel1);
//        parcel1.calculation(10,true);
//        System.out.println(parcel2);
//        parcel3 = parcel1;
//        parcel1.calculation();
//        parcel2.calculation();
//        parcel3.calculation();
//        System.out.println("---1---");

//        Parcel[] parcels = new Parcel[3];
//        parcels[0] = new Parcel();
//        parcels[1] = new Parcel();
//        parcels[2] = new Parcel();
//        System.out.println(parcels[0]);
//        System.out.println("---2---");

//        Parcel[] parcels = new Parcel[100];
//        for (int i = 0; i < parcels.length; i++) {
//            parcels[i] = new Parcel();
//        }
//
//        double sum = 0;
//
//        for (Parcel parcel : parcels) {
//            System.out.println(parcel);
//            sum += parcel.calculation();
//        }
//        System.out.println(sum);
        System.out.println("---3---");


        PostOffice postOffice = new PostOffice();
//        System.out.println(parcel1.calculation());
//        postOffice.preapreParcel(parcel1,12.333);

//        System.out.println(postOffice.parcelReturn());

//        System.out.println("---4---");
//Address address1 = new Address("1-go Maja", 22,"95-060");
//        System.out.println(address1);
//Letter letter1 = new Letter("Piłsudskiego 22", "Kopernika 56");
//        System.out.println(letter1.letterPrice(false));

        System.out.println("---5---");

        Letter letter1 = new Letter("Janke", "Konki");
        Letter letter2 = new Letter("IKS", "IGREK");
        Letter letter3 = new Letter("Janke", "Konki");

        postOffice.prepareLetter(letter1);
        postOffice.prepareLetter(letter2);
        postOffice.prepareLetter(letter3);

        System.out.println(postOffice.letters[0]);
        System.out.println(postOffice.letters[1]);



    }
}
