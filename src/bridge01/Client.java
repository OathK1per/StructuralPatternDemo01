package bridge01;

/**
 * 桥接模式：将一个多层结构的维度展开，各个维度单独的构成继承结构，互相之间通过对象属性连接
 */
public class Client {

    public static void main(String[] args) {
        Computer computer = new SmartPhone(new Samsung());
        computer.start();
    }
}
