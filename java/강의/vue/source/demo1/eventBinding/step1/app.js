const app = Vue.createApp({
	data() {
		return {
			counter: 0,
			name: "",
			confirmName: "",
		};
	},
	methods: {
		add(num) {
			this.counter = this.counter + num;
		},
		reduce(num) {
			this.counter = this.counter - num;
		},
		setName(event, lastName) {
			this.name = event.target.value + " " + lastName;
		},
		confirmEnter() {
			this.confirmName = event.target.value;
		},
	},
});

app.mount("#events");
