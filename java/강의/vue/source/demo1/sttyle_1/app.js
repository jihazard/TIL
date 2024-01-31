const app = Vue.createApp({
	data() {
		return {
			 : false,
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
