# VUE.JS

### 1. style

- 다이나믹 스타일 적용
  - 박스 클릭 시 색상변경
  - v-on:click => @click v-bind:class => :class
  - javascript의 삼항연산자를 이용하여 선택된 박스의 색상 변경

```html
<!DOCTYPE html>
<html lang="en">
	<head>
		<meta charset="UTF-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0" />
		<title>Vue Basics</title>
		<link
			href="https://fonts.googleapis.com/css2?family=Jost:wght@400;700&display=swap"
			rel="stylesheet" />
		<link rel="stylesheet" href="styles.css" />
		<script src="https://unpkg.com/vue@3/dist/vue.global.js"></script>
		<script src="app.js" defer></script>
	</head>
	<body>
		<header>
			<h1>Vue Dynamic Styling</h1>
		</header>
		<section id="styling">
			<div
				class="demo"
				v-on:click="boxSelect('A')"
				:style="{borderColor: boxASelected ? 'red' : 'grey'}"></div>
			<div
				class="demo"
				v-on:click="boxSelect('B')"
				:style="{borderColor: boxBSelected ? 'red' : 'grey'}"></div>
			<div
				class="demo"
				v-on:click="boxSelect('C')"
				:style="{borderColor: boxCSelected ? 'red' : 'grey'}"></div>
		</section>
	</body>
</html>
```

```javascript
const app = Vue.createApp({
	data() {
		return {
			boxASelected: false,
			boxBSelected: false,
			boxCSelected: false,
		};
	},
	methods: {
		boxSelect(box) {
			if (box === "A") {
				this.boxASelected = true;
			} else if (box === "B") {
				this.boxBSelected = true;
			} else if (box === "C") {
				this.boxCSelected = true;
			}
		},
	},
}).mount("#styling");
```

- 인라인 스타일 변경은 다른 스타일을 무시하기 때문에 사용에 주의해야함
- 대신 클래스를 사용하는 방법을 이용하는것이 보편적

```css
.active {
	border-color: red;
	background-color: salmon;
}
```

```html
<!DOCTYPE html>
<html lang="en">
	<head>
		<meta charset="UTF-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0" />
		<title>Vue Basics</title>
		<link
			href="https://fonts.googleapis.com/css2?family=Jost:wght@400;700&display=swap"
			rel="stylesheet" />
		<link rel="stylesheet" href="styles.css" />
		<script src="https://unpkg.com/vue@3/dist/vue.global.js"></script>
		<script src="app.js" defer></script>
	</head>
	<body>
		<header>
			<h1>Vue Dynamic Styling</h1>
		</header>
		<section id="styling">
			<!-- 
			<div :class="boxASelected ? 'demo active' : 'demo'" v-on:click="boxSelect('A')"></div>
			<div :class="{demo: true, active: boxASelected}" v-on:click="boxSelect('A')"></div>
			-->
			<div
				class="demo"
				:class="{active : boxASelected}"
				v-on:click="boxSelect('A')"></div>
			<div
				class="demo"
				:class="{active : boxBSelected}"
				v-on:click="boxSelect('B')"></div>
			<div
				class="demo"
				:class="{active : boxCSelected}"
				v-on:click="boxSelect('C')"></div>
		</section>
	</body>
</html>
```

- class=demo는 하드코딩 :class= 조건을 달면 vue가 :class만 읽은 후 하드코딩된 class에 병합함
- html 코드에 연산코드가 존재하는 것은 좋지 않음 computed 연산 프로퍼티를 이용

```html
<div class="demo" :class="classA" v-on:click="boxSelect('A')"></div>
```

```javascript
const app = Vue.createApp({
	data() {
	  return {
		boxASelected: false,
		boxBSelected: false,
		boxCSelected: false,
	  };
	},
	computed: {
		classAbox() {
			return {active : this.boxASelected}
		}
	}
    ///~~~ 생력

```

- 여러개의 클래스를 동적으로 사용하고 싶을 때는 [] 배열을 이용하면 쉽게 가능함

```html
<div
	class="['demo', '{active : boxASelected}' ]"
	v-on:click="boxSelect('A')"></div>
```
