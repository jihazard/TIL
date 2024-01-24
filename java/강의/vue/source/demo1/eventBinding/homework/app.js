const vue = Vue.createApp({
	data() {
		return {
			keydownValue: "",
			enterValue: "",
		};
	},
	methods: {
		showAlert() {
			alert("Hello World");
		},
		keydownEvent() {
			this.keydownValue = event.target.value;
		},
		enterEvent() {
			this.enterValue = event.target.value;
		},
	},
}).mount("#assignment");
