### 조건문을 재정의로 전환  [리팩토링]

* 객채 타입에 따라 다른 기능을 실행하는 조건문이 있을 땐 조건문의 각 절을 하위클래스의 재정의 메서드안으로 옮기고 원본 메서드는 abstract 타입으로 수정하자.

~~~
    double getSpeed(){
        switch(_type){
            case EUROPEAN: return getBaseSpeed();
            case AFRICAN: return getBaseSpeed() - getLoadFactor() * _numberOfCoconuts;
            case NORWEGIAN_BLUE: return (_isNailed) ? 0 : getBaseSpeed(_voltage);
            }
             throw new RuntimeException("불가능한 속도");           
        }
    
    }
    
 ~~~~
 
 