const vue = Vue.createApp({
	data() {
		return {
			number: 0,
		};
	},

	methods: {
		add(num) {
			this.number = this.number + num;
			console.log(this.number);
		},
	},
}).mount("#styling");
