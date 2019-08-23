package adapter01;

/**
 * 适配器模式：连接两个接口不匹配的类，使用适配器适配二者
 * IO流中的 OutputWriter(), InputReader()
 */
public class Client {

    public static void main(String[] args) {

        Target target = new Adapter01();
        target.run();

        Target target1 = new Adapter02(new Adaptee());
        target1.run();
    }
}
