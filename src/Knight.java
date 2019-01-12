public class Knight extends Character {

    public Knight() {
        weapon = new AxeBevaior();
    }

    public void fight(){
        weapon.useWeapon();
    }


}
