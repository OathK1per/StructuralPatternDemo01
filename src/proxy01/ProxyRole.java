package proxy01;

public class ProxyRole implements AbstractRole {
    private AbstractRole role;

    public ProxyRole(AbstractRole role) {
        this.role = role;
    }

    @Override
    public void before() {
        System.out.println("ProxyRole do it before for RealRole");
    }

    @Override
    public void run() {
        role.run();
    }

    @Override
    public void after() {
        System.out.println("ProxyRole do it after for RealRole");
    }
}
