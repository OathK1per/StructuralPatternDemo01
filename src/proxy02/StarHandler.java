package proxy02;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class StarHandler implements InvocationHandler {
    private Star RealStar;

    public StarHandler(Star realStar) {
        RealStar = realStar;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object object = null;
        System.out.println("prepare for the showtime");
        if (method.getName().equals("perform")) {
            object = method.invoke(RealStar, args);
        }
        System.out.println("enjoy the workout party");
        return object;
    }
}
