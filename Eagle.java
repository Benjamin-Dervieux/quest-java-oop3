public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

@Override
public void takeOff() {
    flying = true;
    System.out.println(getName() + " takes off in the sky.");
}

@Override
public int ascend(int meters) {
    if (flying) {
        altitude += meters;
        System.out.println(getName() + " flies upward, altitude :  " + altitude + " meters.");
    }
    return altitude;
}

@Override
public int descend(int meters) {
    if (flying) {
        altitude -= meters;
        System.out.println(getName() + " flies downward, altitude :  " + altitude + " meters.");
    }
    return altitude;
}

@Override
public int glide() {
    if (flying) {
        System.out.println( "glides into the air.");
    }
    return altitude;
}

@Override
public void land() {
    if (altitude == 0) {
        flying = false;
        System.out.println(getName() + " lands on the ground.");
    } else {
        System.out.println(getName() + " is too high, it can't land.");
    }
}

}

