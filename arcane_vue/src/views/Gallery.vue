<script setup lang="ts">

import MenuHeader from "../components/header/MenuHeader.vue";
import {ref} from "vue";

const images = ref<string[]>([])

const fetchImages = () => {
  const modules = import.meta.glob<{ default: string }>('/public/images/**/*.{png,jpg,jpeg,gif,svg}', { eager: true });
  Object.keys(modules).forEach((path) => {
    images.value.push(modules[path].default);
  });
  images.value = images.value.sort(() => Math.random() - 0.5)
}
fetchImages();
</script>

<template>
  <MenuHeader/>
  <div class="hero" id="hero">
    <div class="container">
      <div>
        <h1 class="title">La Galerie</h1>
        <p>Retrouvez tous les assets du site !</p>
      </div>
      <a href="#images"> <button>Voir les images</button></a>
    </div>
  </div>

  <div id="images" class="gallery-grid">
    <img v-for="(image, index) in images" :key="index" :src="image" alt="background image" />
  </div>
  <a href="#hero"> <button>Revenir en haut</button></a>
</template>

<style scoped>
.hero {
  display: flex;
  height: 100vh;
  width: 100%;
  background: url("/images/background/universe-content.jpg")  no-repeat center/cover;
  align-items: center;
  justify-content: center;
}
.container {
  display: flex;
  flex-direction: column;
  gap: 1rem;
  font-size: 1.5rem;
  position: relative;
}

.gallery-grid{
  column-count: 3;
  column-gap: 2vw;
  margin-bottom: 2rem;
}
.gallery-grid img {
  width: 100%;
  margin-bottom: 15px;
  border-radius: 10px;
  display: block;
  transition: transform 0.3s ease-in-out, margin 0.3s ease-in-out;
}


.gallery-grid img:hover {
  transform: scale(1.02);
  box-shadow: 0 0 15px rgba(255, 215, 0, 0.7);
}

@media (max-width: 768px) {
  .gallery-grid {
    column-count: 2;
  }
}
</style>