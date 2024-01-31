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
		<li>
					<h2>{{ friend.name }}</h2>
					<button @click="toggleShowEvent">Show Details</button>
					<ul v-show=toggleShow>
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
		toggleFavoriteStatus(id) {
			const friendIndex = this.friends.findIndex((friend) => friend.id === id);
			friendIndex.isFavorite = !friendIndex.isFavorite;
		},
	},
});

app.mount("#app");
