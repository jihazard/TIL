# VUE.JS

### 1. Vue.js란? javascript framework and reactive web frontends

- 웹 페이지 화면을 개발하기 위한 컴포넌트기반 프론트엔드 프레임워크
- 데이터 바인딩과 화면 단위를 컴포넌트로 구성하여 재사용 가능
- javascript 프레임워크 (프레임워크 : 뼈대, 라이브러리 : 도구)
  - 라이브러리 : 개발자가 필요한 부분을 가져다 쓰는 것
  - 프레임워크 : 개발자가 필요한 부분을 만들어 넣는 것 (유틸 메소드 등을 제공)
- 대화형이자 반응형인 웹 프론트 엔드 구축에 최적화
  - 대화형 : 사용자와의 인터렉션을 중시 , 응답에 즉각반응한다는 것

### 2. Vue.js 사용하는 이유

1. 모든 로직을 vanill로 작성 가능 하다 그러나.
   - 자바스크립트가 완벽하지 않음
   - 자바스크립트 만으로는 최적의 코드를 만들거나 성능이 낮아지거나 팀으로 일하기 힘듬
   - 모든 소스를 직접 작성해야 해서 생산성이 떨어짐
2. vue를 사용하면 핵심 비지니스 로직에 집중 하고 페이지 업데이트 등 귀찮은 일은 vue에 일임함

### 3. vue 사용 방식

1. HTML 페이지의 일부분을 제어 ( 화면에 특정 부분에만 vue를 적용 ) 위젯을 집어넣어 제어 사이드바, 헤더, 푸터 등
2. SPA (Single Page Application) : 하나의 페이지로 구성된 어플리케이션
   - 페이지가 변경되어도 서버로부터 새로운 페이지를 받아오지 않음
   - 페이지 전환시 필요한 데이터만 받아서 화면을 갱신
   - 화면 전환시 깜빡임 없이 자연스러움
   - 사용자와의 인터렉션이 많은 곳에 적합
   - vue-router를 이용하여 SPA 구현
   - vue-cli를 이용하여 SPA 구현

### 4. vue의 대안

1. React
   - VUE보다 기능 적음 (라우팅, 상태관리 등) UI 랜더링에만 집중
   - 페이스북에서 만듬
   - 가장 인기 있는 프론트엔드 프레임워크
   - 컴포넌트 기반 프레임워크
   - 가상 DOM을 사용하여 빠른 렌더링
   - JSX를 사용하여 HTML과 자바스크립트를 동시에 작성
   - 라우팅, 상태관리 등을 위한 별도의 라이브러리 필요
   - 라이브러리가 많음
   - 러닝커브가 높음
2. Angular
   - 구글에서 만듬, typescript사용 vue는 선택사항
   - 가장 무겁고 복잡한 프레임워크 vue보다 기능 많음
   - 컴포넌트 기반 프레임워크
   - 가상 DOM을 사용하지 않음
   - HTML과 자바스크립트를 분리하여 작성
   - 라우팅, 상태관리 등을 위한 별도의 라이브러리 필요
   - 러닝커브가 높음

### 5. 생명주기

1. onMounted()
   - 컴포넌트가 마운트된 후 호출될 콜백을 등록함.
2. onUpdated()
   - 반응형 상태 변경으로 컴포넌트의 DOM 트리가 업데이트된 후 호출될 콜백을 등록합니다.
3. onUnmounted()
   - 컴포넌트가 마운트 해제된 후 호출될 콜백을 등록합니다.
4. onBeforeMount()
   - 컴포넌트가 마운트되기 직전에 호출될 훅을 등록합니다.
5. onBeforeUpdate()
   - 반응형 상태 변경으로 컴포넌트의 DOM 트리를 업데이트하기 직전에 호출될 콜백을 등록합니다.

![img](https://ko.vuejs.org/assets/lifecycle.P7awcnoo.png)

### 6. vue 인스턴스 생성과 보간법

1. 인스턴스 생성

   - 인스턴스를 생성할 때 내부 옵션은(data , methods) 병합하기 때문에 this로 data및 methods에 접근 가능

   ```javascript
   const vue = Vue.createApp({
   	data() {
   		return {
   			data: [],
   			goal: "goal text",
   		};
   	},
   });
   vue.mount("#selector");
   ```

2. 보간법, v-bind 등 데이터 바인딩

   - 보간법에 쉽게 변수를 바인딩 가능함 등록한 메소드도 {{ courseGoal() }} 호출 가능함

   ```html
   <section id="user-goal">
   	<h2>My Course Goal</h2>
   	<p>{{ outputGoal }}</p>
   	//data 바인딩
   	<p>{{ outputGoal() }}</p>
   	//method 바인딩
   	<p>Learn more <a v-bind:href="vueLink">about vue</a></p>
   </section>
   ```

   ```javascript
   const vue = Vue.createApp({
   	data() {
   		return {
   			data: [],
   			goal: "goal text",
   		};
   	},
   	methods: {
   		methodsName() {
   			alert("1");
   		},
   	},
   });
   vue.mount("#selector");
   ```

- v-html

  - 데이터에 html 코드가 포함되어 있을 때 html을 표현하기 위해 사용함. 다만 보안에 취약하기 때문에 기본적으로 사용하지 않고 필요한 상황에만 사용해야함

```javascript
//.... 생략
//data의 courseGoalA가 html 코드를 포함하고 있을 때
courseGoalA: "<H1>Finish the course and learn Vue!</H1>",
	(
		//html 페이지에서 v-html을 사용하여 바인딩 하면 html 코드 표현됨
		<p v-html="outputGoal()"></p>
	);
```

3. v-on: 이벤트 바인딩
   v-on: 을 통해 javascript의 이벤트 액션을 바인딩 가능 (ex v-on:click, v-on:mouseEvent .. )

   ```javascript
   <section id="events">
   	<h2>Events in Action</h2>
   	<button v-on:click="add(5)">Add</button>
   	<button v-on:click="reduce(1)">Remove</button>
   	<p>Result: {{ counter }}</p>
   </section>;

   const app = Vue.createApp({
   	data() {
   		return {
   			counter: 0,
   		};
   	},
   	methods: {
   		add() {
   			this.counter++;
   		},
   		reduce() {
   			this.counter--;
   		},
   	},
   });
   app.mount("#events");
   ```

- v-on: 이벤트의 확장

  - v-on:click.right, left, middle ... v-on:submit.prevent.. , v-on:keyup .. v-on:keyup.enter, v-on:keypu.shift...

- event 객체를 이용한 데이터 이벤트 바인딩

  - input에 타이핑 되는 텍스트를 실시간으로 출력 해야할 때 javascript의 event 객체를 vue에서도 사용

  ```javascript
  <section id="events">
  	<h2>Events in Action</h2>
  	<button v-on:click="add(5)">Add</button>
  	<button v-on:click="reduce(1)">Remove</button>
  	<p>Result: {{ counter }}</p>
  	//1. vue에서 javascript의 event객체를 이용하여 데이터에 접근
  	<input type="text" v-on:input="setName" />
  	//2. vue에서 제공하는 event객체를 이용하여 데이터에 접근 파라미터를 전달해야
  	//할때 $event 해당 예약어를 이용하여 이벤트를 method로 전달
  	<input type="text" v-on:input="setName($event, 'yoon!')" />
  	<p>my name is : {{ name }}</p>
  </section>;

  const app = Vue.createApp({
  	data() {
  		return {
  			counter: 0,
  			name: "",
  		};
  	},
  	methods: {
  		add(num) {
  			this.counter = this.counter + num;
  		},
  		reduce(num) {
  			this.counter = this.counter - num;
  		},
  		//1. vue에서 javascript의 event객체를 이요하여 데이터에 접근
  		setName() {
  			this.name = event.target.value;
  		},
  		//2. vue에서 제공하는 event객체를 이용하여 데이터에 접근 파라미터를 전달해야
  		//할때 $event 해당 예약어를 이용하여 이벤트를 method로 전달
  		setName(event, lastName) {
  			this.name = event.target.value + " " + lastName;
  		},
  	},
  });

  app.mount("#events");
  ```

4. 양방향 이벤트 바인딩 v-model

   - v-model == v-bind:value v-on:input의 축약어

5. computed 연산프로퍼티 vs watcher (감시자) vs methods

- computed
  동적값을 출력하는데 핵심 기능인 연산 프로퍼티
  프로퍼티기 때문에 변수명처럼 사용해아함
  의존하는 변수를 사용하는 경우 연산프로퍼티를 사용해야함 method는 랜더링 주기 때문에 전체가 리랜더링 되지만 연산 프로퍼티는 의존하는 변수가 변경될 때만 작동을 함
- 감시자(watcher)
  변수의 변화를 감지함 computed 대안으로 사용가능
  변수 값의 변화 및 연산을 감지 할때 유용하게 사용됨
  항상 초기화 되지 않는 경우
  타이머를 사용해서 초기화하거나 특정 데이터의 값을 체크해야할때

```javascript
const vue = Vue.createApp({
	data() {
		return {
			number: 0,
		};
	},
	//감시자
	watch: {
		result() {
			const that = this;
			setTimeout(() => {
				that.number = 0;
				console.log("초기화....");
			}, 5000);
		},
	},
	//연산 프로퍼티
	computed: {
		result() {
			if (this.number < 37) {
				return "Not there yet";
			} else {
				return "Too much!";
			}
		},
	},
	//메소드
	methods: {
		add(num) {
			this.number = this.number + num;
			console.log(this.number);
		},
	},
}).mount("#assignment");
```
 6. 축약어 v-on : @:click, v-bind : :href, v-model : v-model