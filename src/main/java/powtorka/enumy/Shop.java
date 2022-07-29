package powtorka.enumy;

public class Shop {

    void pack(Shirt shirt){

        switch(shirt.getSize()){
            case L:
                System.out.println("PACK L");
                break;
            case M:
                System.out.println("PACK M");
                break;
            case S:
                System.out.println("PACK S");
                break;
            default: {
                System.out.println("There's no packaging");
            }
        }
        System.out.println("Size numer is " + shirt.getNumberOfSize());


    }


}
