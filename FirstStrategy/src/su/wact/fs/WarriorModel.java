package su.wact.fs;

public class WarriorModel {

    private String type;
    private int hp;
    private int typeArmor;
    private int armor;

    public int getHp() {
        return hp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getTypeArmor() {
        return typeArmor;
    }
    public void setTypeArmor(int typeArmor) {
        this.typeArmor = typeArmor;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    protected int totalDur;

    public int TDur(int typeArmor) {
        if (typeArmor == 0) armor = 0;
        else armor = 50;
        totalDur = hp + armor;
        return totalDur;
    }

    public int Damage(int hit){
        totalDur -= hit;
        return totalDur;
    }
}
