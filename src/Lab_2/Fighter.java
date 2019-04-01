package Lab_2;

public class Fighter {
    public String name;
    public int health;
    public int damagePerAttack;

    public Fighter(String name,int health, int damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }

    public void attack(Fighter opponent) {
        opponent.health -= this.damagePerAttack;
    }
}
