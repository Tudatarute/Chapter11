public class SuperHero extends Hero {
    boolean flying;
    public void fly() {
        this.flying = true;
        System.out.println(this.name + "は飛び上がった！");
    }
    public void land() {
        this.flying = false;
        System.out.println(this.name + "は着地した！");
    }
    public void run() {
        System.out.println(this.name + "は撤退した");
    }
    public void attack(Matango m) {
        super.attack(m);//親クラスHeroのattackメソッドを呼び出す
        if (this.flying) {
            super.attack(m);//親クラスHeroのattackメソッドを呼び出す
        }
    }
    public void test() {
        super.test();
        System.out.println("子test");
    }
}