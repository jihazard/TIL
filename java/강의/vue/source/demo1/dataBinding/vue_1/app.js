const vue = Vue.createApp({
	data() {
		return {
			courseGoalA: "<H1>Finish the course and learn Vue!</H1>",
			courseGoalB: "Master Vue and build amazing apps!",
			courseGoal: "Finish the course and learn Vue!",
			vueLink: "https://vuejs.org/",
		};
	},
	methods: {
		outputGoal() {
			const randomNumber = Math.random();
			if (randomNumber < 0.5) {
				//return "Learn Vue!";
				return this.courseGoalA;
			} else {
				//return "Master Vue!";
				return this.courseGoalB;
			}
		},
	},
}).mount("#user-goal");
