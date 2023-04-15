package road;

public abstract class DisplayDecorator extends Display{
    private Display decorator;

    public DisplayDecorator(Display decorator) {
        this.decorator = decorator;
    }

    @Override
    public void draw() {
        decorator.draw();
    }
}
