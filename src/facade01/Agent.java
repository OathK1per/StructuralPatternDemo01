package facade01;

public class Agent {

    public void run() {
        Department department = new Department();
        department.getApproval();
        Department2 department2 = new Department2();
        department2.getApproval();
        Department3 department3 = new Department3();
        department3.getApproval();
    }
}
