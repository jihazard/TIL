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
