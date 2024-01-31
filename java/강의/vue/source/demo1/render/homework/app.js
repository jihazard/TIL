const app = Vue.createApp({
	data() {
		return {
			visible: true,
			enteredTask: "",
			tasks: [],
		};
	},
	computed: {
		buttonCaption() {
			return this.visible ? "Hide List" : "Show List";
		},
	},
	methods: {
		addTask() {
			this.tasks.push(this.enteredTask);
		},
		removeTask(idx) {
			this.tasks.splice(idx, 1);
		},
		visibleList() {
			this.visible = !this.visible;
		},
	},
}).mount("#assignment");
