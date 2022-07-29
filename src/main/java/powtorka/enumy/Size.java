package powtorka.enumy;

public enum Size {
    L(30),
    M(20),
    S(10);

private int numberOfSize;

    Size(int numberOfSize) {
        this.numberOfSize = numberOfSize;
    }

    public int getNumberOfSize() {
        return numberOfSize;
    }
}
