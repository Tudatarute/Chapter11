package kadai3;

public class Fool extends  Character implements Human{
    public void attack(Matango m){
        System.out.println(this.name + "は戦わずに遊んでいる");
    }
    public void talk(){
        System.out.println("は意味のないことを話した");
    }
    public void watch(){
        System.out.println("は虚空を見つめている");
    }
    public  void hear(){
        System.out.println("は誰かの声を聴いた気がした");
    }
    public void run(){
        System.out.println("は大爆笑しながら逃げ出した");
    }
}
