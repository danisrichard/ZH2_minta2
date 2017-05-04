/**
 * Created by Ricsko on 2017. 05. 04..
 */
public class Pogacsa extends Peksutemeny {

    public Pogacsa(double mennyiseg, double alapar) {
        super(mennyiseg, alapar);
    }

    @Override
    public void megkostol() {
        if(mennyiseg >= 2 || mennyiseg > 0 ){
            mennyiseg /= 2;
        }else{
            System.out.println("Elfogyott a pogi");
        }
    }


}
