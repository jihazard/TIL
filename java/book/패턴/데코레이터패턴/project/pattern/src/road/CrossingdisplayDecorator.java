package road;

public class CrossingdisplayDecorator extends DisplayDecorator{
    public CrossingdisplayDecorator(Display decorator) {
        super(decorator);
    }

    @Override
    public void draw() {
        super.draw();
        crossingDraw();
    }

    private void crossingDraw() {
        System.out.println("교차로표시");
    }
}
