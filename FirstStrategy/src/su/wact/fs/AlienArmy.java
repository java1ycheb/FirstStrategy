package su.wact.fs;

import java.util.ArrayList;

public class AlienArmy{
    Alien a0 = new Alien();
    Alien a1 = new Alien();
    Alien a2 = new Alien();

    public ArrayList<Alien> AAtype() {
        ArrayList<Alien> AA = new ArrayList();
        a0.setType("A_001");
        a1.setType("A_002");
        a2.setType("A_003");
        AA.add(a0);
        AA.add(a1);
        AA.add(a2);

        return AA;
    }
}