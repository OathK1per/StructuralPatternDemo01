package adapter01;

/**
 * 两种适配方式：类适配(子类继承)和对象适配(传入对象参数)
 */
public class Adapter01 extends Adaptee implements Target {

    @Override
    public void run() {
        System.out.println("通过类适配连接输出设备中");
        this.runThisAdaptee();
    }
}
