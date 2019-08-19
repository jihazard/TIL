# 자바스크립트 비동기 처리해보기
    
-자바스크립트 하다보면 가끔 비동기 처리 때문에 애를 먹는 경우가 있음 편하자고 만들어진 기능이지만 나를 불편하게 할 때가 있다 해결 방법을 알아 보자.  

~~~js

    //비동기 처리가 안된 소스 선언부 
    function getData_ori(){
        var tableData
        $.get("https://floating-harbor-78336.herokuapp.com/fastfood", function(response) {
             tableData = response;
         });
         return tableData;
    } 
    //호출부
    console.log("처리안됨 ==> " + getData_ori()) //결과값 :  undefined
~~~

- 비동기 처리 해서 데이터 불러오기 callback 함수 호출

~~~js
   // js 비동기 처리 선언부 
   function getData(callbackFunc){
       $.get("https://floating-harbor-78336.herokuapp.com/fastfood", function(response) {
            callbackFunc(response)
        });
   }
   
   //호출부
   getData(function(tableData){
         console.log("===>" + tableData); // undefined
        $.each(tableData.list , function(k,v) {
            console.log("data = > " + k +"/" +v)
        })
    })

    //결과값 : 정상호출
~~~


- ES6에서 나온 Promise 를 이용하여 처리도 가능한데 promise 의 경우 ie 같은 경우 지원하지 않는다. 물론 변환이 가능하나 그냥 쓰지 않는걸로 ㅋㅋㅋㅋ좋은 개발자가 되려면 멀은 것 같은 느낌 적인 느낌임 
지원 가능한 브라우저 살펴 보기 https://caniuse.com/#feat=promises

~~~js
    // js 비동기 처리 promise()
    // Promise support = https://caniuse.com/#feat=promises
    function getData_promise(callback){
        return new Promise(function( resolve, reject){
            $.get("https://floating-harbor-78336.herokuapp.com/fastfood", function(response) {
                resolve(response)
            });
        })
    }

    getData_promise().then(function(tableData2){
        console.log("promise ===>" + tableData2); // undefined
        $.each(tableData2.list , function(k,v) {
            console.log("promise data = > " + k +"/" +v)
        })
    })
    //결과값 : 정상호출
~~~

참조 : https://joshua1988.github.io/web-development/javascript/javascript-asynchronous-operation/ 
