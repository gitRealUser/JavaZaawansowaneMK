package powtorka.enumy;

public class EnumDemo {




    public static void main(String[] args) {
        Shirt shirt1 = new Shirt(Size.M);
        System.out.println(shirt1);
        System.out.println(".......");

        Shop shop1 = new Shop();
        shop1.pack(shirt1);

        System.out.println(".............");





    }


    }

