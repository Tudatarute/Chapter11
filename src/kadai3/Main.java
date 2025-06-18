package kadai3;

public class Main {
    public static void main(String[] args) {
        Fool fool = new Fool();
        fool.name = "怠け者";
        fool.hp = 80;
        fool.talk();
        fool.watch();
        fool.hear();
        fool.attack(new Matango());
        fool.run();
    }
}