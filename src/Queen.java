public class Queen extends Character {

    public Queen() {
        weapon = new KnifeBehavior();
    }

    public void fight(){
        weapon.useWeapon();
    }
}
