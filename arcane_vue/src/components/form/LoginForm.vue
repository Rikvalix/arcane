<script setup lang="ts">
import { ref} from 'vue'
import {postLogin} from "../../api/libs/auth.ts";
import {useRouter} from "vue-router";


const formLogin = ref({
  username: '',
  password: ''
})
const submitted = ref(false)
const isError = ref(false)
const router = useRouter();

const handleSubmit = () => {
  submitted.value = true;
  isError.value = false;
  postLogin(formLogin.value.username, formLogin.value.password)
      .then(() => router.push("/"))
      .catch(()=>{
        submitted.value = false;
        isError.value = true;
      })
}
</script>

<template>
  <h1>Connectez vous !</h1>
  <form @submit.prevent="handleSubmit">
    <input id="username" type="text" placeholder="Identifiant" v-model="formLogin.username" required>
    <input id="password" type="password" placeholder="Mot de passe" v-model="formLogin.password" required>
    <div v-if="submitted">
      <h3>Formulaire soumis avec succès!</h3>
    </div>
    <div v-if="isError">
      <p>Votre identifiant ou votre mot de passe est incorrect</p>
    </div>

      <button type="submit" class="filled">Connexion</button>

  </form>

</template>

<style scoped>

</style>