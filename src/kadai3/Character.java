package kadai3;

public abstract class Character {
    String name;
    int hp;
    public void run() {
        System.out.println(this.name + "");
    }
    public abstract void  attack(Matango m);
}
