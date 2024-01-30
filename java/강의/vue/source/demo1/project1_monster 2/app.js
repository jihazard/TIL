const app = Vue.createApp({
	data() {
		return {
			playerHealth: 100,
			monsterHealth: 100,
			currentRound: 0,
			winner: null,
			logs : []
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
			}
	},
	computed: {
		playerBarStyles() {
			return { width: this.playerHealth + "%" };
		},
		monsterBarStyles() {
			return { width: this.monsterHealth + "%" };
		},
	},
	methods: {
		attackMonster() {
			this.currentRound++;
			const attackValue = getRandomBetween(5, 10);
			this.monsterHealth -= attackValue;
			this.addLog('player', 'attac', attackValue);
			console.log("attackMonster ---" + attackValue);
			this.attackPlayer();
		},
		attackPlayer() {
			const attackValue = getRandomBetween(8, 15);
			this.addLog('monster', 'attac', attackValue);
			console.log("attackPlayer ---" + attackValue);
			this.playerHealth -= attackValue;
		},

		specialAttack() {
			this.currentRound++;
			const spAttack = getRandomBetween(13, 20);
			this.addLog('player', 'special attack', spAttack);
			this.monsterHealth -= spAttack;
			this.attackPlayer();
		},
		healPlayer() {
			this.currentRound++;
			const healValue = getRandomBetween(10, 15);
			this.playerHealth += healValue;
			this.addLog('player', 'heal', heal);
			this.attackPlayer();
		},
		surrender() {
			this.winner = "monster";
			this.addLog('player', 'surrender', 0);
		},
		restart() {
			this.playerHealth = 100;
			this.monsterHealth = 100;
			this.winner = null;
			this.logs =[]
		},
		addLog(who, what, value) {
			this.logs.unshift({
				by:who, action : what, actionValue: value
			})
		}

	},
}).mount("#game");

function getRandomBetween(min, max) {
	return Math.floor(Math.random() * (max - min)) + min;
}
