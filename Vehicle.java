abstract class Vehicle {
    int wheel;
    public abstract String honk();
    public abstract String brand();
    public String moveForward(){
        return "maju";
    };
    public String moveBackward(){
        return "mundur";
    };
}

abstract class Car extends Vehicle{
    protected int wheel=4;
    protected int tankCapacity;
    public String honk(){
        return "tintin";
    }
    public abstract void transmission();
}

class HondaJazz extends Car {

    @Override
    public void transmission() {
        System.out.println("transmisi otomatis");
    }

    @Override
    public String brand() {
        return "Honda Jazz";
    }

    int tankCapacity = 60;
}

class ToyotaFortuner extends Car {

    @Override
    public void transmission() {
        System.out.println("transmisi manual");
    }
    @Override
    public String brand() {
        return "Toyota Fortuner";
    }
    int tankCapacity = 80;
}

class SuzukiKatana extends Car {

    @Override
    public void transmission() {
        System.out.println("transmisi manual");
    }
    @Override
    public String brand() {
        return "Suzuki Katana";
    }
    int tankCapacity = 40;
}

public class Main {
    public static void main(String[] args) {

        HondaJazz hondaJazz = new HondaJazz();
        System.out.println(hondaJazz.brand());
        System.out.println("memiliki roda :"+hondaJazz.wheel);
        System.out.println("kapasitas tanki "+hondaJazz.tankCapacity);
        System.out.println("suara klakson :"+hondaJazz.honk());
        System.out.println("bisa "+hondaJazz.moveForward()+" dan "+hondaJazz.moveBackward());

        ToyotaFortuner toyotafortuner = new ToyotaFortuner();
        System.out.println(toyotafortuner.brand());
        System.out.println("memiliki roda :"+toyotafortuner.wheel);
        System.out.println("kapasitas tanki "+toyotafortuner.tankCapacity);
        System.out.println("suara klakson :"+toyotafortuner.honk());
        System.out.println("bisa "+toyotafortuner.moveForward()+" dan "+toyotafortuner.moveBackward());

        SuzukiKatana suzukikatana = new SuzukiKatana();
        System.out.println(suzukikatana.brand());
        System.out.println("memiliki roda :"+suzukikatana.wheel);
        System.out.println("kapasitas tanki "+suzukikatana.tankCapacity);
        System.out.println("suara klakson :"+suzukikatana.honk());
        System.out.println("bisa "+suzukikatana.moveForward()+" dan "+suzukikatana.moveBackward());
    }
}