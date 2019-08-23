package proxy02;

public interface Star {

    void before();
    void perform();
    void after();
}

class RealStar implements Star {

    @Override
    public void before() {
        System.out.println("Nothing to do");
    }

    @Override
    public void perform() {
        System.out.println("show myself");
    }

    @Override
    public void after() {
        System.out.println("Nothing to do");
    }
}
