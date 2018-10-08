package su.wact.fs;

import java.util.ArrayList;

public class HumanArmy {
    Human h0 = new Human();
    Human h1 = new Human();
    Human h2 = new Human();


    public ArrayList<Human> HAtype(){
        ArrayList<Human> HA = new ArrayList();
        h0.setType("Вася");
        h1.setType("Петя");
        h2.setType("Вова");
        HA.add(h0);
        HA.add(h1);
        HA.add(h2);

        return HA;
    }
}