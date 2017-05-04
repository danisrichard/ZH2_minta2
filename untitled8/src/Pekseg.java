import java.io.*;
import java.nio.file.Files;
import java.util.*;

/**
 * Created by Ricsko on 2017. 05. 04..
 */
public class Pekseg {

    public static List<IArlap> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        /**
         * @param valami fájl kellene
         */

//        vasarlok();
        etelLeltar(list);
    }

    private static void vasarlok(File file) throws IOException {
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);

        String line = br.readLine();
        while (line != null) {
            String[] value = line.split("\\s+");

            switch (value[0].toLowerCase()) {
                case "kave":
                    if (value[1].equals("habos")) {
                        list.add(new Kave(true));
                    } else {
                        list.add(new Kave(false));
                    }
                    break;
                case "pogacsa":
                    list.add(new Pogacsa(Double.parseDouble(value[1]), Double.parseDouble(value[2])));
                    break;
                default:
                    System.out.println(" Nincsen termék");
            }

            line = br.readLine();

        }
        br.close();
    }

    private static void etelLeltar(List<IArlap> list) throws IOException {
        File file = new File("Ment.txt");
        file.createNewFile();
        FileWriter fw = new FileWriter(file);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Pogacsa) {
                fw.write(list.get(i).toString());
            }
        }
        fw.flush();
        fw.close();
    }
}
