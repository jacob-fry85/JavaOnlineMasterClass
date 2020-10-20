public class EnhancedPlayer {

    private String fullName;
    private int health = 100;
    private String weapon;

    public EnhancedPlayer(String fullName, int health, String weapon) {
        this.fullName = fullName;
        if(health > 0 && health <= 100) {
            this.health = health;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        this.health = this.health - damage;
        if(this.health <= 0) {
            System.out.println("Player knocked out");
        }
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int healthRemaining() {
        return this.health;
    }
}
