Vue.createApp({
    data() {
        return{
            goals :[],
            enteredValue: '',
            count:0
        };
    },
    methods: {
        addGoal() {
            this.goals.push(this.enteredValue)
            this.enteredValue =''
            this.count++;    
        }
    }
}).mount('#app');
