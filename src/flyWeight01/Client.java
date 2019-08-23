package flyWeight01;

/**
 * 享元模式：对需要创建大量拥有同样内在属性的对象适用，极大的节约了内存，但相对消耗时间
 * 与factory搭配使用，在factory当中使用map储存键值对，当调用同样内在属性的对象时直接使用存储的对象，而不新建对象
 * 在接口中提供方法可以向外面提供内部属性，设置外部属性(不可共享的属性)
 * 在实体类中new对象时只实现内部属性，外部属性通过方法补充进去
 */
public class Client {

    public static void main(String[] args) {
        FlyWeightFactory factory = new FlyWeightFactory();
        FlyWeight chess1 = factory.chess("blank");
        FlyWeight chess2 = factory.chess("white");
        FlyWeight chess3 = factory.chess("blank");
        FlyWeight chess4 = factory.chess("blank");
        FlyWeight chess5 = factory.chess("white");
        FlyWeight chess6 = factory.chess("white");

        chess1.display(new Coordinate(1, 1));
        chess2.display(new Coordinate(17, 31));
        chess3.display(new Coordinate(24, 45));
        chess4.display(new Coordinate(53, 67));
        chess5.display(new Coordinate(22, 23));
        chess6.display(new Coordinate(8, 16));
    }
}
