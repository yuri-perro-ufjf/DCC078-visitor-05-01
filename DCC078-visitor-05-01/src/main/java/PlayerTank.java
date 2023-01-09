public class PlayerTank implements Player{
    private String name;
    private int hp;
    private float damage;

    public PlayerTank(String name, int hp, float daTank){
        this.name = name;
        this.hp = hp;
        this.damage = daTank;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public float getDamage() {
        return damage;
    }

    public String accept(Visitor visitor){
        return visitor.showPlayerTank(this);
    }
}
