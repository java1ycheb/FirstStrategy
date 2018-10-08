package su.wact.fs;

public class Alien extends WarriorModel{

    public Alien() {

        setHp(100);
        setTypeArmor(1);

        TDur(getTypeArmor());
    }
}
