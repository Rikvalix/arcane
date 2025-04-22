<script setup lang="ts">

import { postRegister} from "../../api/libs/auth.ts";
import {ref} from "vue";
import {useRouter} from "vue-router";

const formRegister = ref({
  username: '',
  password: '',
  confirmation_password: '',
  email: ''

})
const submitted = ref(false)
const isError = ref({ status : false, message: ''})
const router = useRouter();

const handleSubmit = () => {
  submitted.value = true;
  isError.value.status = false;
  postRegister({username: formRegister.value.username, password: formRegister.value.password, email: formRegister.value.email})
      .then(() => router.push("/"))
      .catch(response => {console.log(response);})

}
const validatePassword = () => {
  if(formRegister.value.password !== formRegister.value.confirmation_password){
    isError.value.status = true;
    isError.value.message = "Les mots de passe ne correspondent pas";
  } else {
    isError.value.status = false;
  }
}
</script>

<template>
  <h1>Créer votre compte </h1>
  <form @submit.prevent="handleSubmit">
    <input id="username" type="text" placeholder="Identifiant" v-model="formRegister.username" required>
    <input id="email" type="email" placeholder="Email" v-model="formRegister.email" required>
    <input id="password" type="password" placeholder="Mot de passe" v-model="formRegister.password" @input="validatePassword" required>
    <input id="password_confirmation" type="password" placeholder="Confirmer le mot de passe" v-model="formRegister.confirmation_password" @input="validatePassword" required>
    <div v-if="submitted">
      <h3>Formulaire soumis avec succès!</h3>
    </div>
    <div v-if="isError.status">
      <p>{{isError.message}}</p>
    </div>
    <div class="button-container">
      <button type="submit" class="filled">Créer mon compte</button>
    </div>
  </form>

</template>

<style scoped>

</style>