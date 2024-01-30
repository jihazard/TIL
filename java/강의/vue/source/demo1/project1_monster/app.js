const vue = Vue.createApp({
	data() {
		return {
			playerHealth: 100,
			monsterHealth: 100,
			currentRound: 0,
			winner: null,
			logMessages: [],
		};
	},
	watch: {
		playerHealth(value) {
			if (value <= 0 && this.monsterHealth <= 0) {
				// A draw
				this.winner = "draw";
			} else if (value <= 0) {
				// Player lost
				this.winner = "monster";
			}
		},
		monsterHealth(value) {
			if (value <= 0 && this.playerHealth <= 0) {
				// A draw
				this.winner = "draw";
			} else if (value <= 0) {
				// Player lost
				this.winner = "player";
			}
		},
	},
	computed: {
		monsterBarStyles() {
			if (this.monsterHealth < 0) {
				return { width: 0 + "%" };
			}
			return { width: this.monsterHealth + "%" };
		},
		playerBarStyles() {
			if (this.playerHealth < 0) {
				return { width: 0 + "%" };
			}
			return { width: this.playerHealth + "%" };
		},
		specialAttack() {
			return this.currentRound % 3 !== 0;
		},
	},
	methods: {
		startGame() {
			this.playerHealth = 100;
			this.monsterHealth = 100;
			this.currentRound = 0;
			this.winner = null;
			this.logMessages = [];
		},
		attackMonster() {
			this.currentRound++;
			const attackValue = Math.floor(Math.random() * (12 - 5)) + 5;
			this.monsterHealth -= attackValue;
			this.addLogMessage("player", "attack", attackValue);
			this.attackPlayer();
		},
		attackPlayer() {
			const attackValue = Math.floor(Math.random() * (12 - 8)) + 8;
			this.playerHealth -= attackValue;

			this.addLogMessage("monster", "attack", attackValue);
		},
		specialAttackMonster() {
			this.currentRound++;
			const attackValue = Math.floor(Math.random() * (25 - 10)) + 10;
			this.monsterHealth -= attackValue;

			this.addLogMessage("player", "specialAttack", attackValue);
			this.attackPlayer();
		},
		healPlayer() {
			const healValue = Math.floor(Math.random() * (20 - 8)) + 10;
			if (this.playerHealth + healValue > 100) {
				this.playerHealth = 100;
			} else {
				this.playerHealth += healValue;
			}
			this.addLogMessage("player", "heal", healValue);
			this.attackPlayer();
		},
		surrender() {
			this.winner = "monster";
		},
		addLogMessage(who, watch, value) {
			this.logMessages.unshift({
				actionBy: who,
				actionType: watch,
				actionValue: value,
			});
		},
	},
}).mount("#game");
