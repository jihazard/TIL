const vue = Vue.createApp({
	data() {
		return {
			name: "jihwan",
			age: 40,
			img: "https://dimg.donga.com/wps/NEWS/IMAGE/2019/05/20/95612138.2.jpg",
		};
	},
	methods: {
		randomNumber() {
			return Math.random();
		},
	},
}).mount("#assignment");
