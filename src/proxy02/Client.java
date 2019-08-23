package proxy02;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 动态代理模式：自动代理，所有方法集中处理，更加方便
 * – java.lang.reflect.Proxy
 * • 作用：动态生成代理类和对象
 * – java.lang.reflect.InvocationHandler(处理器接口)
 * • 可以通过invoke方法实现对真实角色的代理访问。
 * • 每次通过Proxy生成代理类对象对象时都要指定对应的处理器对象
 */
public class Client {

    public static void main(String[] args) {
        Star realStar = new RealStar();
        InvocationHandler handler = new StarHandler(realStar);

        Star proxy = (Star) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),
                new Class[]{Star.class}, handler);

        proxy.perform();
    }
}
