/**
 * Created by Ricsko on 2017. 05. 04..
 */
public abstract class Peksutemeny implements IArlap{
    protected double mennyiseg;
    private double alapar;

    public Peksutemeny(double mennyiseg, double alapar) {
        this.mennyiseg = mennyiseg;
        this.alapar = alapar;
    }

    public abstract void megkostol();

    @Override
    public double mennyibeKerul() {
        return mennyiseg*alapar;
    }

    @Override
    public String toString() {
        return mennyiseg + " darab peksuti " + mennyibeKerul() + " ennyibekerul";
    }
}
