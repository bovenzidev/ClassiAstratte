package dev.bovenzi.lezione.astratte;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class GestioneMain {
    public static void main(String[] args) {
        ArrayList<Animale> animali= new ArrayList<>();

        Umano u= new Umano("Pippo");
        Pesce p= new Pesce("PescePalla");
        Uccello uc= new Uccello("Aquila");
        Uccello uc1= new Uccello("Aquila");

        uc.setCampaPer(10);
        uc1.setCampaPer(5);
        p.setCampaPer(20);
        u.setCampaPer(101);

        animali.add(uc);
        animali.add(u);
        animali.add(p);
        animali.add(uc1);

        System.out.println(animali);
       /* Collections.sort(animali);

        System.out.println(animali);

        Collections.reverse(animali);
        System.out.println(animali);
*/
        Collections.sort(animali, Comparator.comparing(Animale::getNome)
                .thenComparing(Animale::getCampaPer)
                .thenComparing(Animale::getCopertura)
                .thenComparing(Animale::getRiproduzione));
        System.out.println(animali);
    }
}
