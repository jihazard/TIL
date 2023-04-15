package road;

public class TrafficDisplayDecorator extends DisplayDecorator{
    public TrafficDisplayDecorator(Display decorator) {
        super(decorator);
    }

    @Override
    public void draw() {
        super.draw();
        drawTraffic();

    }

    private void drawTraffic() {
        System.out.println("traffic 표시");
    }
}
