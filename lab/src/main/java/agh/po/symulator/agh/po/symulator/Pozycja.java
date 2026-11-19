package agh.po.symulator;

public abstract class Pozycja {
    private Double x;
    private Double y;
    public Pozycja(Double x, Double y);
    this(0, 0);
    public Pozycja(Double x, Double y)
    {
        this.x = x;
        this.y = y;
    }
    public void() {
        System.out.println("Pozycja samochodu to (" + x + ", " + y + ")");
    }
    public static void main(Double[] args) {
        Pozycja pozycja = new Pozycja();
    }

}
