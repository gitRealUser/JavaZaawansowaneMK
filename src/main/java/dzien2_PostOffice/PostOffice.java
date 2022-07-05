package dzien2_PostOffice;

import java.util.Scanner;

public class PostOffice {

    private double income = 0;

    Letter[] letters = new Letter[2];

    double preapreParcel(Parcel parcel, double fee) {
        if (parcel.calculation() == fee) {
            parcel.setStatus("created");
            System.out.println(parcel.getStatus());
            income += fee;
            return 0;
        } else if (parcel.calculation() > fee) {
            parcel.setStatus("not created");
            System.out.println(parcel.getStatus());
            return fee;
        } else {
            parcel.setStatus("created");
            System.out.println(parcel.getStatus());
            income += (fee - parcel.calculation());
            System.out.println("cash return " + (fee - parcel.calculation()));
            return fee - parcel.calculation();
        }
    }

    Parcel parcelReturn() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter sender...  ");
        String sender = scanner.nextLine();
        System.out.println("enter recipient...  ");
        String recipient = scanner.nextLine();
        System.out.println("enter weight...  ");
        double weight = scanner.nextDouble();

        Parcel parcelReturn = new Parcel(sender, recipient, weight);
        return parcelReturn;
    }

    void prepareLetter (Letter letter){
        for(int i = 0; i < letters.length; i++){
            if(letters[i] == null){
                letters[i] = letter;
                break;
            }
            else{
                continue;
            }
        }
        if (letters[letters.length-1] != null){
            System.out.println("Post is full");
        }

    }


}
