package decorator01;

public interface Drink {

    void mix();
}

class MileTea implements Drink {

    @Override
    public void mix() {
        System.out.print("这是一杯奶茶");
    }
}

class Mixer implements Drink {
    private Drink origin;

    public Mixer(Drink origin) {
        this.origin = origin;
    }

    @Override
    public void mix() {
        origin.mix();
    }
}

class Coffee extends Mixer {

    public Coffee(Drink origin) {
        super(origin);
    }

    @Override
    public void mix() {
        super.mix();
        System.out.print("加咖啡");
    }
}

class Juice extends Mixer {

    public Juice(Drink origin) {
        super(origin);
    }

    @Override
    public void mix() {
        super.mix();
        System.out.print("加果汁");
    }
}
