##여러겹의 조건문을 감시절로 변환

* 메서드에 조건문이 있어서 정상적인 실행 경로를 파악하기 힘들 땐 모든 특수한 경우에 감시 절을 사용하자.

  
  조건절 두가지 형태
   1. 어느 경로가 정상적인 동작의 일부인지 검사하는 형태
   2. 조건판별의 한 결과만 정상적인 동작을 나태내고 나머지는 비정상적인 동작을 나타내는 형태 
   
   조건문에는 다양한 의도가 있는데 그 의도가 코드에 반영되어 들어나야 한다.
   조건문이 특이한 조건이라면 그 조건을 검사해서 조건이 true일 경우 반환하자 
   이런식의 검사를 감시절이라고 한다 (guard clause)
   
   * 조건문이 복잡해서 실행경로를 알수없는 코드 예제

~~~
    double getPayAmount() {
        double result;
        if(_isDead) result = deadAmount();
        else {
            if(_isRetired) result =  sepratedAmount();
            else {
                result = normalPayAmount();
            }
                    
        }
        return result;
    }
    
  ~~~~
  
  * 감시절을 이용하여 변경한 예제
~~~
    double getPayAmount() {
        if(_isDead) result deadAmount();
        if(~isSeparated) return sepratedAmount();
        if(_isRetired) return retiredAmount();
        return normalPayAmount();
        
    }
    
  ~~~~
  

   
   
   
   
   * 조건문을 역순으로 만들기 위한 예제 
   
   ~~~
    public double getAdjustedCapital() {
        double result = 0.0;
        if(_capital > 0.0) {
            if(_intRate > 0.0 && _duration > 0.0) {
                result = (_income / _duration) * ADJ_fACTOR;
            }
        }
        return result;
    }
    
   ~~~~
   
    
   * 역순 조건문을 감시절을 이용해 변경하기 
    
   ~~~
    public double getAdjustedCapital() {
        if(_capital > 0.0) return 0.0;
        if(_intRate > 0.0 || _duration > 0.0) return 0.0;
        return (_income / _duration) * ADJ_fACTOR;
    }
    
   ~~~~