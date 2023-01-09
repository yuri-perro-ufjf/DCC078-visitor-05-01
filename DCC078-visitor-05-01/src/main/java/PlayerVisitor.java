public class PlayerVisitor implements Visitor{
    public String show(Player player) {
        return player.accept(this);
    }

    @Override
    public String showPlayerMage(PlayerMage playerMage) {
        return "Mage: {" +
                "name=" + playerMage.getName() +
                ", hp='" + playerMage.getHp() + '\'' +
                ", damage=" + playerMage.getDamage() +
                '}';
    }

    @Override
    public String showPlayerHunter(PlayerHunter playerHunter) {
        return "Hunter: {" +
                "name=" + playerHunter.getName() +
                ", hp='" + playerHunter.getHp() + '\'' +
                ", damage=" + playerHunter.getDamage() +
                '}';
    }

    @Override
    public String showPlayerTank(PlayerTank playerTank) {
        return "Tank: {" +
                "name=" + playerTank.getName() +
                ", hp='" + playerTank.getHp() + '\'' +
                ", damage=" + playerTank.getDamage() +
                '}';
    }
}
