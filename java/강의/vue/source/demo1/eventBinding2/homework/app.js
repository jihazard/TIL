const vue = Vue.createApp({
	data() {
		return {
			number: 0,
		};
	},
	watch: {
		result() {
			const that = this;
			setTimeout(() => {
				that.number = 0;
				console.log("√ ±‚»≠....");
			}, 5000);
		},
	},
	computed: {
		result() {
			if (this.number < 37) {
				return "Not there yet";
			} else {
				return "Too much!";
			}
		},
	},
	methods: {
		add(num) {
			this.number = this.number + num;
			console.log(this.number);
		},
	},
}).mount("#assignment");
