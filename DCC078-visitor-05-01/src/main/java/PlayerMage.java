public class PlayerMage implements Player{
    private String name;
    private int hp;
    private float damage;

    public PlayerMage(String name, int hp, float damage){
        this.name = name;
        this.hp = hp;
        this.damage = damage;
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
        return visitor.showPlayerMage(this);
    }
}
