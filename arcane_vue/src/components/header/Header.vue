<script setup lang="ts">
import MenuHeader from "./MenuHeader.vue";
</script>

<template>
  <header class="hero">
    <MenuHeader/>
    <h1>Bienvenue dans l'univers d'Arcane</h1>
    <p>Plongez dans l'affrontement entre Piltover et Zaun   <br> <router-link to="universe" class="btn">Explorer l'univers</router-link></p>
  </header>
</template>

<style scoped>

/* Section Hero */
.hero {
  position: relative;
  background: url("/images/background/arcane.jpeg") no-repeat center/cover;
  height: 100vh;
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
}

.hero h1 {
  font-size: 3rem;
  position: relative;
}
.hero p {
  font-size: 1.2rem;
  position: relative;
}
.hero .btn {
  display: inline-block;
  margin-top: 20px;
  padding: 10px 20px;
  background: #b8860b;
  color: white;
  text-decoration: none;
  font-weight: bold;
  border-radius: 5px;
}
.btn:hover {
  scale: 105%;
  background: #d99d0b;
  transition: all 0.3s;
}
@media only screen and (max-width: 500px) {
  .hero {
    background: url("../../../public/images/background/mobile-bg-arcane.jpg") no-repeat center/cover;
  }
  .hero .overlay {
    background: rgba(0, 0, 0, 0.5);
  }
}
</style>