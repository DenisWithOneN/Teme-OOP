package Problema5;

import java.util.*;

public class Calcul {

    public static void main(String[] args) {
        Interval it1 = new Interval(1.0, 5.0);
        Interval it2 = new Interval(3.0, 7.0);
        Interval it3 = new Interval(5.0, 10.0);

        ArrayList<Interval> listaIntervale = new ArrayList<Interval>();
        listaIntervale.add(it1);
        listaIntervale.add(it2);
        listaIntervale.add(it3);

        Double[] nrReale = {0.5, 3.2, 3.2, 4.3, 8.4};
        ArrayList<Double> numereReale = (ArrayList<Double>) Arrays.asList(0.5, 3.2, 3.2, 4.3, 8.4);


        for(Double nr: nrReale) {
            for(Interval i : listaIntervale)
                i.prelucrareNrReal(nr);
        }

        for(Double nr : numereReale) {
            it1.prelucrareNrReal(nr);
            it2.prelucrareNrReal(nr);
            it3.prelucrareNrReal(nr);
        }

        System.out.println(it1);
        System.out.println(it2);
        System.out.println(it3);
    }

}