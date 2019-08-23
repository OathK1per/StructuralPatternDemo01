package facade01;

/**
 * 使用外观模式，运用迪米特法则，为外部接口上封装统一的入口，减少实体之间的相互作用
 */
public class Client02 {

    public static void main(String[] args) {
        Agent agent = new Agent();
        agent.run();
    }
}
