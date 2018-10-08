package su.wact.fs;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println("Война началась...");
        war();
        System.out.println("Это всё!");
    }

    public static void war() {

        boolean atWar = true;


        AlienArmy AA1 = new AlienArmy();
        HumanArmy HA1 = new HumanArmy();
        Random rand = new Random();
        ArrayList<Alien> AAA = AA1.AAtype();
        ArrayList<Human> HHA = HA1.HAtype();

        do {
            int nA = rand.nextInt(AAA.size());
            int nH = rand.nextInt(HHA.size());

            Alien a = AAA.get(nA);
            Human h = HHA.get(nH);
            for (int i = a.totalDur; i > 0;) {
                int hitH = rand.nextInt((15 - 5) + 1) + 5;
                i -= hitH;
                for (int j = h.totalDur; j > 0;) {
                    int hitA = rand.nextInt((10 - 5) + 1) + 5;
                    j -= hitA;

                    a.Damage(hitH);
                    //System.out.println(a.getType() +" имеет " + a.totalDur);
                    h.Damage(hitA);
                    //System.out.println(h.getType() +" имеет " + h.totalDur);

                    if (a.totalDur <= 0) { System.out.println("Победил Хуман "+h.getType() + "..."); AAA.remove(a);}
                    if (h.totalDur <= 0) { System.out.println("Победил Элиен "+a.getType() + "..."); HHA.remove(h);}
                    break;
                }
            }
        if (AAA.isEmpty() || HHA.isEmpty()) {
            atWar = false;
        }

        } while (atWar);

        if (AAA.isEmpty() && HHA.isEmpty()) {
            System.out.println("Странно, но ничья!");
        }
        else if (HHA.isEmpty()) {
            System.out.println("Армия пришельцев победила!");
        }
        else System.out.println("Армия людей победила!");
    }


}
