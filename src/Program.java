import javax.print.DocFlavor;

public class Program {
    public static void main(String[] args) {
        Character elizabeth = new Queen();
        Character edward = new King();
        Character knight = new Knight();

        elizabeth.fight();
        edward.fight();
        knight.fight();
        knight.setWeapon(new FlyingAxe());
        knight.fight();


    }
}
