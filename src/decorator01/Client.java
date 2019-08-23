package decorator01;

/**
 * 装饰模式：通过对象的关联关系代替继承，并且能够提供一些添加功能
 * 需要装饰类和实体类都实现同一个接口，与桥接模式形式相似，但是目的不同
 * 装饰模式是为一个实体类服务，桥接模式则是为分散维度，最终都导致了减少类个数的结果
 */
public class Client {

    public static void main(String[] args) {
        Drink milkTea = new MileTea();
        Drink result = new Coffee(new Juice(milkTea));

        result.mix();
    }
}
