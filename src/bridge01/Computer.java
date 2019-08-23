package bridge01;

public interface Computer {

    void start();
}

class Laptop implements Computer {
    private Brand brand;

    public Laptop(Brand brand) {
        this.brand = brand;
    }

    @Override
    public void start() {
        brand.welcome();
        System.out.println("笔记本电脑");
    }
}

class SmartPhone implements Computer {
    private Brand brand;

    public SmartPhone(Brand brand) {
        this.brand = brand;
    }

    @Override
    public void start() {
        brand.welcome();
        System.out.println("手机");
    }
}

class Pad implements Computer {
    private Brand brand;

    public Pad(Brand brand) {
        this.brand = brand;
    }

    @Override
    public void start() {
        brand.welcome();
        System.out.println("平板电脑");
    }
}
