<script setup lang="ts">

import {ref} from "vue";

import LoginForm from "./LoginForm.vue";
import RegisterForm from "./RegisterForm.vue";

const currentFormLogin = ref(true);
const setCurrentFormLogin = () => {
  currentFormLogin.value = !currentFormLogin.value;
}
</script>

<template>
  <div class="form-container">
    <LoginForm v-if="currentFormLogin"/>
    <RegisterForm v-else/>
    <div class="button-container">
      <button v-if="currentFormLogin" @click="setCurrentFormLogin">Créer un compte</button>
      <button v-else @click="setCurrentFormLogin">Se connecter</button>
    </div>

  </div>
</template>

<style>
.form-container {
  width: 20vw;
  height: fit-content;
  margin: 0 auto;
  padding: 4rem;
  border: 2px solid #b8860b;
  border-radius: 20px;
  backdrop-filter: blur(10px);
}

form {
  padding: 0.5rem;
  display: flex;
  flex-direction: column;
  gap: 1rem;
}
form input {
  height: 1.5rem;
  font-size: 1rem;
  padding: 0.5rem;
  border-radius: 10px;
  border: 1px solid #b8860b;
  background-color: #111;
  color: #e0e0e0;
}
button {
  padding: 0.5rem;
  border-radius: 10px;
  border: 1px solid #b8860b;
  background-color: transparent;
  color: #ffffff;
  font-size: 1.2rem;
  font-weight: bold;
  cursor: pointer;
  transition: all 0.2s ease-in-out;
}
.filled {
  background-color: #b8860b;
}
button:hover {
  background-color: #e0e0e0;
  color: #111;
}

.button-container {
  display: flex;
  flex-direction: column;
  justify-content: space-between;
  gap: 1rem;
}


@media screen and (max-width: 768px) {
  .form-container {
    width: 50vw;
  }
  form input {
    width: 100%;
  }
}
</style>