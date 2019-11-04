# Promise / async / awiat 

- 콜백 함수를 사용해서 비동기 처리를 해도 상관없지만 ....지옥에 빠져버릴 수 있다 .그래서 나온 Promise 와 
  aysnc await 를 사용하는 방법에 대해 예제로 알아보즈아 

 - 예제 1 Promise 
~~~javascript
    function getData(){
        return new Promise (function (resolve,reject){
            var data = 100;
            setTimeout(() => resolve(data), 1);
      
        })
    }

    getData().then(function(resolveData){
        alert(resolveData);
    })
~~~


 - 예제 2 Promise  익명함수
~~~javascript 
let promise = new Promise(function(resolve, reject){
    setTimeout(() => {
        resolve(1000)
    }, 5000);
} )

promise.then(function(resolveData){
    alert(resolveData)
})
~~~


- 예제 3 async await  promise 의 단점을 보완하기 위해 나옴 겁나 쉽다잉 
~~~javascript
function getData(){
        return new Promise (function (resolve,reject){
            var data = 100;
            setTimeout(() => resolve(data), 5000);
      
        })
    }

async function log() {
     var result = await getData();
     alert(result)
}
~~~

- 자세한 내용은 캡틴판교님 블로그 참조 
    https://joshua1988.github.io/web-development/javascript/js-async-await/