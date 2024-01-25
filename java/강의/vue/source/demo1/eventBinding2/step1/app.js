const app = Vue.createApp({
	data() {
		return {
			counter: 0,
			name: "",
			fullName: "",
		};
	},
	computed: {
		// fullName() {
		// 	if (this.name === "") {
		// 		return "";
		// 	}
		// 	return this.name + " " + "Doe";
		// },
	},
	methods: {
		resetName() {
			console.log("setName try...");
			this.name = "";
		},
		setName(event, lastName) {
			console.log("setName try...");
			this.name = event.target.value + " " + lastName;
		},
		add(num) {
			this.counter = this.counter + num;
		},
		reduce(num) {
			this.counter = this.counter - num;
			// this.counter--;
		},
	},
});

app.mount("#events");
