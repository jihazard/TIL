## Remove Control Flag  조건문 간결화

* 논리연산식의 제어플래그 역할을 하는 변수가 있을 경우 그변수를 break 나 return 문으로 변경하자.

제어 플레그 예제 
~~~~
    void checkSecurity(String [] people) {
        boolean found = false   // 제어플래그
        
        for(int i = 0; i < people.length ; i++){
            if(!found) {
            if(people[i].equals("don"){
                sendAlert():
                found = true;
                }
            if(people[i].equals("john"){
                sendAlert():
                found = true;
             }
                           
            }
        }
    }

~~~~
* 제어플래그 선언부 found를 삭제하고 분기문의 제어플래그 부분을 break 로 변경하자


~~~~
    void checkSecurity(String [] people) {
        for(int i = 0; i < people.length ; i++){
            if(!found) {
            if(people[i].equals("don"){
                sendAlert():
                break;
                }
            if(people[i].equals("john"){
                sendAlert():
                break;
             }
                           
            }
        }
    }

~~~~

* 제어 플래그를 return 문으로 교체 

~~~~
    void checkSecurity(String [] people) {
        boolean found = "";   // 제어플래그
        
        for(int i = 0; i < people.length ; i++){
            if(found.equals("")) {
            if(people[i].equals("don"){
                sendAlert():
                found = "don";
                }
            if(people[i].equals("john"){
                sendAlert():
                found = "john";
             }  
            }
        }
    someLaterCode(found);  
    }

~~~~

- 이번예제의 경우 플래그 기능과 리턴결과를 나타내는 역할을 한다 이럴 때 found변수를 알아내는 코드를 
  메서드로 빼내자.
  
  
  ~~~~
      void checkSecurity(String [] people) {
         String found = foundMiscreant(people);
         someLaterCode(found);
         }
         
         String foundMiscreant(String[] people){
         for(int i = 0; i < people.length ; i++){
                     if(found.equals("")) {
                     if(people[i].equals("don"){
                         sendAlert():
                         return "don";
                         }
                     if(people[i].equals("john"){
                         sendAlert():
                         return "john";
                      }  
                     }
                 }
             return "";
           }
         }
  ~~~~

