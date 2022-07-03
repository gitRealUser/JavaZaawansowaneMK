package dzien2_Warsztat;

public class Garage {


    private int wheelFixingCounter = 0;
    private Car car;

    public Garage(Car car) {
        this.car = car;
    }

    Receipt whellFixing(){

        for(int i = 0; i < car.getWheels().length; i++){
            if (car.getWheels()[i].isPierced() == true){
                car.getWheels()[i].setPierced(false);
                wheelFixingCounter ++;
            }
        }
        Receipt receipt1 = new Receipt(100,"wheel fixing",wheelFixingCounter);

        return receipt1;
    }

}
