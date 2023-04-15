package road;

public  class LaneDisplayDecorator extends DisplayDecorator{

    public LaneDisplayDecorator(Display decorator) {
        super(decorator);
    }

    @Override
    public void draw() {
        super.draw();
        drawLine();
    }

    private void drawLine() {
        System.out.println("차선표시");
    }
}
