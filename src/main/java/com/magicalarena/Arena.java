package main.java.com.magicalarena;

public class Arena {
    private Dice attackDice;
    private Dice defendDice;

    public Arena() {
        this.attackDice = new Dice();
        this.defendDice = new Dice();
    }

    public void fight(Player player1, Player player2) {
        Player attacker = player1.getHealth() <= player2.getHealth() ? player1 : player2;
        Player defender = attacker == player1 ? player2 : player1;

        while (attacker.isAlive() && defender.isAlive()) {
            takeTurn(attacker, defender);
            Player temp = attacker;
            attacker = defender;
            defender = temp;
        }

        System.out.println("Game Over! " + (attacker.isAlive() ? attacker : defender) + " wins!");
    }

    private void takeTurn(Player attacker, Player defender) {
        int attackRoll = attackDice.roll();
        int defendRoll = defendDice.roll();

        int attackDamage = attacker.getAttack() * attackRoll;
        int defendStrength = defender.getStrength() * defendRoll;

        int damage = attackDamage - defendStrength;
        if (damage > 0) {
            defender.setHealth(defender.getHealth() - damage);
        }

        System.out.println("Attacker: " + attacker + " rolls " + attackRoll);
        System.out.println("Defender: " + defender + " rolls " + defendRoll);
        System.out.println("Damage dealt: " + damage);
        System.out.println("Defender's health: " + defender.getHealth());
    }
}
