package proxy01;

/**
 * 静态代理模式：手动代理
 * 代理类和实体类都同时实现一个接口，代理类同时也把实体类作为对象进行代理
 */
public class Client {

    public static void main(String[] args) {
        AbstractRole role = new ProxyRole(new RealRole());
        role.before();
        role.run();
        role.after();
    }
}
