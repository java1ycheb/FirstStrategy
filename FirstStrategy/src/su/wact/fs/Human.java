package su.wact.fs;

public class Human extends WarriorModel {

    public Human() {

        setHp(125);
        setTypeArmor(0);

        TDur(getTypeArmor());
    }
}