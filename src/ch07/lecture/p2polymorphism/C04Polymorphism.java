package ch07.lecture.p2polymorphism;

public class C04Polymorphism {
}

class Weapon {
    public void trigger() {
        System.out.println("무기 발사");
    }
}

class Bow extends Weapon {
    @Override
    public void trigger() {
        System.out.println("화살 발사");
    }
}

class Gun extends Weapon {
    @Override
    public void trigger() {
        System.out.println("총알 발사");
    }
}

class Hero {
    private Weapon weapon;

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

}