/**
 * Created by Ricsko on 2017. 05. 04..
 */
public class Kave implements IArlap {

    private boolean habosE;

    public Kave(boolean habosE) {

        this.habosE = habosE;
    }

    @Override
    public double mennyibeKerul() {
        return ((habosE) ? CSESZEKAVE * 1.5 : CSESZEKAVE);
    }

    @Override
    public String toString() {
        return ((habosE) ? "Habos kvÁra: " + CSESZEKAVE : "NemHabos kvÁra: " + CSESZEKAVE * 1.5);
    }
}
