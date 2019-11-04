# Adapter Pattern

- 용도 : 클래스르 바로 사용할 수 없는 경우. 
- 사용방법 : 상속

### code 로 이해하기

~~~java
public interface Duck {
    public void quack();
    public void fly();
}
~~~

~~~java
public interface Turkey {
    public void gobble();
    public void fly();
}
~~~
~~~java
public class WildTurkey implements Turkey {
    Turkey turkey;

    @Override
	public void gobble() {
		System.out.println("Gobble gobble");
	}

	@Override
	public void fly() {
		System.out.println("I'm flying a short distance");
	}
}
~~~
~~~java
public class TurkeyAdapter implements Duck {

	Turkey turkey;

	public TurkeyAdapter(Turkey turkey) {
		this.turkey = turkey;
	}

	@Override
	public void quack() {
		turkey.gobble();
	}

	@Override
	public void fly() {
		turkey.fly();
	}

}
~~~




