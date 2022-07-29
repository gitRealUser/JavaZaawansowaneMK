package powtorka.enumy;

public class Shirt {

private Size size;



Shirt(Size size){
    this.size = size;
}

    public Size getSize() {
        return size;
    }

    public int getNumberOfSize(){
    return size.getNumberOfSize();
    }



    @Override
    public String toString() {
        return "Shirt{" +
                "size=" + size +
                '}';
    }
}
