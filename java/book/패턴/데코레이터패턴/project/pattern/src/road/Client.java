package road;

public class Client {
    public static void main(String[] args) {
        Display road = new RoadDisplay();
        road.draw();

        Display roadWithLine = new LaneDisplayDecorator(new RoadDisplay());
        roadWithLine.draw();

        Display roadWithTraffic = new TrafficDisplayDecorator(new RoadDisplay());
        roadWithTraffic.draw();

        //두가지 기능 조합
        Display twoDraw = new TrafficDisplayDecorator(new LaneDisplayDecorator(new RoadDisplay()));
        twoDraw.draw();

        // 크로스 라인을 추가하는
        Display raw = new TrafficDisplayDecorator(new CrossingdisplayDecorator(new RoadDisplay()));
        raw.draw();

    }
}
