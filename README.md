---
coverY: 0
---

# 데코레이터 패턴

##

## ![](.gitbook/assets/d0014632\_4b15ee9a7fd90.gif)

## 컴포넌트

기본 기능  &#x20;

## 데코레이터

구체적인 공통 기능을 제공

## 콘크리트 컴포넌트

컴포넌트의 하위 클래스로 행동을 추가한다.

## 콘크리트 데코레이터

데코레이터의 하위 클래스로 행동을 추가한다.





```
//컴포넌트
public abstract class Display {
    public abstract void draw();
}
```

```
//concrete 컴포넌트
public class RoadDisplay extends Display{
    public void draw() {
        System.out.println("기본 도로 표시");
    }
}
```

```
// 데코레이터
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
```

```
// concrete 데코레이터
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
```

```
// 실행코드

public class Client {
    public static void main(String[] args) {
        Display road = new RoadDisplay();
        road.draw();

        Display roadWithLine = new LaneDisplayDecorator(new RoadDisplay());
        roadWithLine.draw();


    }
}

```
