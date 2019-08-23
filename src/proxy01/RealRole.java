package proxy01;

public class RealRole implements AbstractRole {

    @Override
    public void before() {
        System.out.println("RealRole do it before");
    }

    @Override
    public void run() {
        System.out.println("RealRole running!!!");
    }

    @Override
    public void after() {
        System.out.println("RealRole do it after");
    }
}
