public class PlayerHunter implements Player{
    private String name;
    private int hp;
    private float damage;

    public PlayerHunter(String name, int hp, float damage){
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
        return visitor.showPlayerHunter(this);
    }
}
