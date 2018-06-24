#스트림 
###예시
<pre><code>
    List<String> list = Arrays.asList("홍길동","윤지환,"김자바");
    Stream<String stream = list.stream();
    stream.forEach( name -> System.out.println(name));
</code></pre>

>스트림은 내부반복자를 사용하므로 병렬 처리가 쉽다. 

내부반복자를 사용하여 얻는 이점은 컬렉션 내부에서 어떻게 요소를 반본시킬 것 인가는
컬렉션에게 맡겨두고 개발자는 요소 처리 코드에만 집중 할 수 있다.

요소들의 반복 순서를 변경하거나 멀티코어 cpu를 최대한 활용하기 위해 요소들을 분배시켜
병렬 작업을 할수 있게 도와주기 때문에 하나씩 처리하는 순차적 외부 반복자 보다는 효율적이다.


**병렬이란(PARALLEL)**
 한가지 작업을 서브 작업으로 나누고 , 서브 작업들을 분리된 스레드에서 병렬적으로 
처리하는 것을 말한다 병렬 처리 스트림을 이용하며 ㄴ런타임 시 하나의 작업을 서브 작업으로 나누고 
서브 작업의 결과를 자동으로 결합해 결과물을 생성합니다.

**예시**
<pre><code>
  List<String> list = Arrays.asList("홍길동","윤지환","김득현","백승배");
 
         //순차처리
         list.stream().forEach(ParallelExample::print);
         System.out.println();
         //병렬처리
         list.parallelStream().forEach(ParallelExample::print);
     }
 
     private static void print(String s) {
         System.out.println(s +" : " + Thread.currentThread().getName());
     }
</code></pre>
**순차처리 결과**
<pre><code>
홍길동 : main
윤지환 : main
김득현 : main
백승배 : main
</code></pre>

**병렬처리 결과**
<pre><code>
김득현 : main
백승배 : main>
윤지환 : main
홍길동 : ForkJoinPool.commonPool-worker-2
</code></pre>

**스트림은** 
중간 처리와 최종처리를 할 수 있다.
중간 처리에서는 매핑, 필터링 , 정렬을 수행하고 최종 처리에서는 반복, 카운팅,평균 총합 등을 집계처리
한다.


>스트림의 종류


