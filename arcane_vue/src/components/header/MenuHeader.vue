<script setup lang="ts">


// Authentication
import {isAuthenticated} from "../../utils/authentication.ts";
import {logout} from "../../utils/authentication.ts";
import {ref} from "vue";
const isUserAuthenticated = ref( isAuthenticated())

const handleLogout = () => {
    logout();
    isUserAuthenticated.value = false;
}

</script>

<template>
  <div class="overlay">
    <nav class="menu">
      <ul>
        <li><a href="/">Accueil</a></li>
        <li><router-link to="universe">Univers</router-link></li>
        <li><router-link to="gallery">Galerie</router-link></li>
        <li v-if="!isUserAuthenticated">
          <router-link to="auth">Se connecter</router-link>
        </li>
        <li v-else>
          <a href="#" @click.prevent="handleLogout">Se déconnecter</a>
        </li>
      </ul>
    </nav>
  </div>
</template>

<style scoped>
/* Menu */
.overlay {
  position: absolute;
  top: 0; left: 0;
  width: 100%; height: 100%;
  background: rgba(0, 0, 0, 0.6);
}
.menu {
  backdrop-filter: blur(2px);
  background: transparent;
  padding: 15px;
}
.menu ul {
  list-style: none;
  display: flex;
  gap: 1rem;
  flex-wrap: wrap;
  justify-content: center;
}
.menu li {
  font-size: 1.2rem;
  margin: 0 1rem;
  transition: all ease-in-out 0.3s;
  border-bottom: 2px solid transparent;
}
.menu li:hover {
  scale: 105%;
  border-bottom: 2px solid #d4af37;
}

.menu a {
  color: white;
  text-decoration: none;
}
</style>