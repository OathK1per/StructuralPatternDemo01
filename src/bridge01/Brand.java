package bridge01;

public interface Brand {

    void welcome();
}

class Apple implements Brand {
    @Override
    public void welcome() {
        System.out.print("欢迎使用苹果");
    }
}

class Samsung implements Brand {
    @Override
    public void welcome() {
        System.out.print("欢迎使用三星");
    }
}

class Lenovo implements Brand {
    @Override
    public void welcome() {
        System.out.print("欢迎使用联想");
    }
}