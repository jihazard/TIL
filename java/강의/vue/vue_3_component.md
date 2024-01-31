# VUE.JS

## 1. 렌더링 조건식 v-if

- javascript 의 조건식과 동일한 형태의 조건식을 줄수있음. v-if , v-else, v-else-if

- v-if의 대안 v-show
  v-if,v-else와 v-show의 차이점
  if,else는 dom을 추가하거나 제거하고 v-show는 css요소로 hide 또는 show를 함

- 일반적인 상태에서는 v-if사용하고 토글등 show/hide요소가 필요한 경우 v-show를 사용

### v-for

- vue의 dom 생성방식

- v-for를 사용할때는 v-bind:key (:key)를 사용해야 vue가요소를 구별하고 내부의 입력값이유실되는 현상을 막을 수 있음

```html
<ul v-else>
	<li v-for="(goal, idx) in goals" @click="removeGoal(idx)" :key="goal">
		<p>{{ goal }} - {{idx}}</p>
		<input type="text" @click.stop />
	</li>
</ul>
```

### template

### ref

- 이벤트가 발생할 때만 렌더링

```html
<input type="text" ref="userText" />
```

```javascript
this.$refs.userText.value;
```

### VUE 가 DOM 을 업데이트하는 방법

- Virtual DOM을 이용하여 기존 DOM과 새로운 DOM을 비교하여 변경된 부분만을 랜더링 하는방식을 이용

### 라이프 사이클 실습

## 2. 컴포넌트

    * 컴포넌트 생성방법
    - app.component("-를 포함한 식별자", {options})

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
			<h1>FriendList</h1>
		</header>
		<section id="app">
			<ul>
				<!-- <li v-for="fri in friends" :key="name">
					<h2>{{ fri.name }}</h2>
					<button>Show Details</button>
					<ul>
						<li><strong>Phone:</strong> {{ fri.phone }}</li>
						<li><strong>Email:</strong> {{ fri.email }}</li>
					</ul>
				</li> -->
				<mini-component></mini-component>
				<mini-component></mini-component>
			</ul>
		</section>
	</body>
</html>
```

```javascript
const app = Vue.createApp({
	data() {
		return {
			friends: [
				{
					name: "yoon",
					phone: "111111",
					email: "1111@naver.com",
				},
				{
					name: "kim",
					phone: "22222",
					email: "22222@naver.com",
				},
			],
		};
	},
});

app.component("mini-component", {
	template: `
		<li v-show=toggleShow>
					<h2>{{ friend.name }}</h2>
					<button @click="toggleShowEvent">Show Details</button>
					<ul>
						<li><strong>Phone:</strong> {{ friend.phone }}</li>
						<li><strong>Email:</strong> {{ friend.email }}</li>
					</ul>
		</li>
	`,
	data() {
		return {
			toggleShow: true,
			friend: {
				name: "yoon",
				phone: "111111",
				email: "1111@naver.com",
			},
		};
	},
	methods: {
		toggleShowEvent() {
			this.toggleShow = !this.toggleShow;
		},
	},
});

app.mount("#app");
```

### 3. 통신

- 부모 => 자식 통신

  - main 에서 컴포넌트로 데이터를 전달 할 때 케밥케이스(케밥-케이스)를 이용해야함
  - 컴포넌트에서 데이터를 전달 받을 때는 카멜 케이스(phoneNumber)로 받아야함

  ```html
  <ul>
  	<friend-contact
  		v-for="friend in friends"
  		:key="friend.name"
  		:name="friend.name"
  		:phone-number="friend.phone"
  		:email-address="friend.email"
  		:is-favorit="friend.isFavorit"></friend-contact>
  </ul>
  ```

  ```javascript
   props: {
        name: {
            type: String,
            required: true,
        }, phoneNumber: {
            type: String,
            required: true,
        }, emailAddress: {
            type: String,
            required: true,
        }, isFavorit: {
            type: Boolean,
            required: false,
            default: false,
        },
    },
  ```

* 컴포넌트

  ```html
  <template>
  	<li>
  		<h2>{{ name }} {{ isFrienFavorit == true ? '(FAVORIT)' : '(NONE)' }}</h2>
  		<button @click="toggleDetails">{{ toggleText }} Details</button>
  		<button @click="toggleFavorit">CHANGE</button>
  		<ul v-if="detailsAreVisible">
  			<li><string>Phone1 : </string>{{ phoneNumber }}</li>
  			<li><string>Email : </string>{{ emailAddress }}</li>
  		</ul>
  	</li>
  </template>
  ```

- 자식 => 부모 통신

  ```javascript
  	this.$emit.("케밥-케이스");
  	this.$emit.("toggle-favorite", "id");


  methods: {
  	toggleFavoriteStatus(id) {
  		const friendIndex = this.friends.findIndex((friend) => friend.id === id);
  		friendIndex.isFavorite = !friendIndex.isFavorite;
  	},
  },
  ```

  ```html
  <ul>
  	<friend-contact
  		v-for="friend in friends"
  		:key="friend.name"
  		:name="friend.name"
  		:phone-number="friend.phone"
  		:email-address="friend.email"
  		:is-favorit="friend.isFavorit"
  		@toggle-favorite="toggleFavoriteStatus">
  	</friend-contact>
  </ul>
  ```
