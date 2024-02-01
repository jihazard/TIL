<template>
    <section>
        <input type="text" placeholder="name" v-model="userName">
        <input type="text" placeholder="age" v-model="userAge">
        <button @click="addUser">ADD USER</button>
        <button @click="delUser">DEL USER</button>
    </section>
</template>

<script>
export default {

    data() {
        return {
            userName: '',
            userAge: ''
        }
    },
    methods: {
        addUser() {
            this.$emit("add-event", this.userName, this.userAge)
        },
        delUser() {
            if (this.userName) {
                this.$emit("del-event", this.userName)
            }


        }
    }
}
</script>

<style></style>`