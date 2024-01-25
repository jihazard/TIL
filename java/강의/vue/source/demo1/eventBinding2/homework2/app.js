const vue = Vue.createApp({
	data() {
		return {
			number: 0,
		};
	},
	watch: {
		wh() {
			const that = this;
			setTimeout(() => {
				that.number = 0;
				console.log("ÃÊ±âÈ­....");
			}, 5000);
		},
	},
	computed: {
		wh() {
			if (this.number === 37) {
				return this.number;
			} else if (this.number > 37) {
				return "Too much!";
			} else {
				return "Not there yet";
			}
			return this.number;
		},
	},
	methods: {
		add(num) {
			this.number = this.number + num;
			console.log(this.number);
		},
	},
}).mount("#assignment");
