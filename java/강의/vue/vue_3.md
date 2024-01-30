# VUE.JS

### 1. 렌더링 조건식 v-if

- javascript 의 조건식과 동일한 형태의 조건식을 줄수있음. v-if , v-else, v-else-if

- v-if의 대안 v-show
  v-if,v-else와 v-show의 차이점
  if,else는 dom을 추가하거나 제거하고 v-show는 css요소로 hide 또는 show를 함

- 일반적인 상태에서는 v-if사용하고 토글등 show/hide요소가 필요한 경우 v-show를 사용

### 2. v-for

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
