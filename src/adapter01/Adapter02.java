package adapter01;

public class Adapter02 implements Target {
    private Adaptee adaptee;

    public Adapter02(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void run() {
        System.out.println("通过对象适配连接输出设备中");
        adaptee.runThisAdaptee();
    }
}
