package facade01;

/**
 * 不使用外观模式
 */
public class Client01 {

    public static void main(String[] args) {
        Department department = new Department();
        department.getApproval();
        Department2 department2 = new Department2();
        department2.getApproval();
        Department3 department3 = new Department3();
        department3.getApproval();
    }
}
