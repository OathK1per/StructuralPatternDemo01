package flyWeight01;

public class ConcreteFlyWeight implements FlyWeight {
    private String color;

    public ConcreteFlyWeight() {
        super();
    }

    public ConcreteFlyWeight(String color) {
        this.color = color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void display(Coordinate c) {
        System.out.println(color + "棋子" + this + "放在(" + c.getX() + ", " + c.getY() + ")处");
    }
}
