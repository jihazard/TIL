<template>
    <li>
        <h2>{{ name }} {{ isFrienFavorit == true ? '(FAVORIT)' : '(NONE)' }}</h2>
        <button @click="toggleDetails"> {{ toggleText }} Details</button>
        <button @click="toggleFavorit">CHANGE </button>
        <ul v-if="detailsAreVisible">
            <li>
                <string>Phone1 : </string>{{ phoneNumber }}
            </li>
            <li>
                <string>Email : </string>{{ emailAddress }}
            </li>
        </ul>
    </li>
</template>

<script>
export default {
    props: {
        name: {
            type: String,
            required: true,
        }, phoneNumber: {
            type: String,
            required: true,
        }, emailAddress: {
            type: String,
            required: true,
        }, isFavorit: {
            type: Boolean,
            required: false,
            default: false,
        },
    },
    data() {
        return {
            detailsAreVisible: false,
            isFrienFavorit: this.isFavorit,

        }
    },
    computed: {
        toggleText() {
            return this.detailsAreVisible ? 'Hide' : 'Show'
        }
    },
    methods: {
        toggleDetails() {
            this.detailsAreVisible = !this.detailsAreVisible;
        },
        toggleFavorit() {
            this.isFrienFavorit = !this.isFrienFavorit
            console.log("dddd", this.isFrienFavorit)
        }
    }
}
</script>

<style></style>