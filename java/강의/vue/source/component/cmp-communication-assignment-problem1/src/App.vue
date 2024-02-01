<template>
    <div>
        <active-user v-for="user in users" :key="user" :userName="user.name" :user-age="user.age" @delete-user="delUser">
        </active-user>
        <user-data @add-event="addUser" @del-event="delUser"></user-data>
    </div>
</template>

<script>
export default {
    data() {
        return {
            users: [
                { name: 'yoon', age: 39 },
                { name: 'kim', age: 29 },
                { name: 'seo', age: 19 },
                { name: 'choi', age: 9 },
                { name: 'pow', age: 59 },
            ]
        }
    },
    methods: {
        addUser(name, age) {
            this.users.push({ name: name, age: age })

        },
        delUser(findName) {
            const userIndex = this.users.findIndex(user => user.name === findName)

            this.users.splice(userIndex, 1)
        },
    }
}


</script>

<style>
* {
    box-sizing: border-box;
}

html {
    font-family: 'Jost', sans-serif;
}

body {
    margin: 0;
}

header {
    box-shadow: 0 2px 8px rgba(0, 0, 0, 0.26);
    margin: 3rem auto;
    border-radius: 10px;
    padding: 1rem;
    background-color: #58004d;
    color: white;
    text-align: center;
    width: 90%;
    max-width: 40rem;
}

#app ul {
    margin: 0;
    padding: 0;
    list-style: none;
}

#app li {
    box-shadow: 0 2px 8px rgba(0, 0, 0, 0.26);
    margin: 1rem auto;
    border-radius: 10px;
    padding: 1rem;
    text-align: center;
    width: 90%;
    max-width: 40rem;
}

#app h2 {
    font-size: 2rem;
    border-bottom: 4px solid #ccc;
    color: #58004d;
    margin: 0 0 1rem 0;
}

#app button {
    font: inherit;
    cursor: pointer;
    border: 1px solid #ff0077;
    background-color: #ff0077;
    color: white;
    padding: 0.05rem 1rem;
    box-shadow: 1px 1px 2px rgba(0, 0, 0, 0.26);
}

#app button:hover,
#app button:active {
    background-color: #ec3169;
    border-color: #ec3169;
    box-shadow: 1px 1px 4px rgba(0, 0, 0, 0.26);
}
</style>