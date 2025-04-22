<script setup lang="ts">
import type { CharacterInterface } from "../../interfaces/characterInterface.ts";

defineProps<{
  character: CharacterInterface;
}>();
</script>

<template>
  <article class="character-card">
    <img :src="`/images/characters/${character.imageUrl}`" alt="Portrait de {{ character.firstName }}" />

    <div class="card-content">
      <h3>{{ character.firstName }} {{ character.lastName }}
        <span v-if="character.nickName" class="nickname">“{{ character.nickName }}”</span>
      </h3>

      <p class="backstory">📝 {{ character.backstory }}</p>

      <div class="character-details">
        <p><strong>Genre :</strong> {{ character.gender }}</p>
        <p><strong>Race :</strong> {{ character.race }}</p>
        <p><strong>Âge :</strong> {{ character.age }} ans</p>
        <p><strong>Statut :</strong> {{ character.status }}</p>
        <p><strong>Alignement :</strong> {{ character.alignment }}</p>
        <p><strong>Occupation :</strong> {{ character.occupation }}</p>
        <p><strong>Lieu de naissance :</strong> {{ character.birthplace }}</p>
      </div>

      <div class="character-traits">
        <p><strong>Apparence :</strong> {{ character.appearance }}</p>
        <p><strong>Personnalité :</strong> {{ character.personality }}</p>
      </div>
    </div>
  </article>
</template>

<style scoped>
.character-card {
  display: flex;
  flex-direction: column;
  border: 1px solid #ddd;
  border-radius: 12px;
  overflow: hidden;
  background: linear-gradient(to bottom right, #ffffff, #f7f7f7);
  box-shadow: 0 4px 10px rgba(0, 0, 0, 0.1);
  max-width: 22rem;
  min-height: 40rem;
  max-height: 40rem;
  margin: auto;
  transition: transform 0.3s ease;
}
.character-card:hover {
  transform: translateY(-5px);
}

.character-card img {
  width: 100%;
  height: auto;
  object-fit: cover;
  aspect-ratio: 4/3;
  border-bottom: 1px solid #ccc;
}

.card-content {
  padding: 1em;
}

.character-card h3 {
  font-size: 1.4em;
  margin: 0;
  color: #222;
}
.nickname {
  display: block;
  font-size: 0.9em;
  color: #777;
  font-style: italic;
}

.backstory {
  font-style: italic;
  margin: 0.5em 0;
  color: #444;
}

.character-details,
.character-traits {
  margin: 0.5em 0;
}

.character-details p,
.character-traits p {
  margin: 0.2em 0;
  font-size: 0.95em;
  color: #555;
}

@media screen and (max-width: 768px) {
  .character-card {
    max-width: 90%;
  }
}
</style>
