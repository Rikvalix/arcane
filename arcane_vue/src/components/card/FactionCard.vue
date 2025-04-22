<template>
  <div class="faction-card">
    <div class="faction-header">
      <img :src="`/images/factions/${faction.symbol}`" alt="Symbole de la faction" class="faction-symbol" />
      <h2 class="faction-name">{{ faction.name }}</h2>
    </div>
    <p class="faction-description">{{ faction.description }}</p>
    <div class="character-grid">
      <div
          class="character-card"
          v-for="(character, index) in faction.characters"
          :key="character.id"
          :style="{ animationDelay: `${index * 700}ms` }"
      >
        <img
            :src="`/images/characters/${character.imageUrl}`"
            :alt="character.firstName"
            class="character-image"
        />
        <div class="character-name">
          {{ character.firstName }} {{ character.lastName }}
        </div>
        <div v-if="character.nickName" class="character-nickname">
          "{{ character.nickName }}"
        </div>
      </div>
    </div>
  </div>
</template>

<script setup>
defineProps({
  faction: {
    type: Object,
    required: true
  }
});
</script>

<style scoped>
.faction-card {
  background-color: #f8f8ff;
  padding: 2rem;
  border-radius: 1rem;
  box-shadow: 0 4px 12px rgba(0, 0, 0, 0.1);
  max-width: 30rem;
  height: 22rem;
  margin: auto;
}

.faction-header {
  display: flex;
  align-items: center;
  gap: 16px;
  margin-bottom: 16px;
  flex-wrap: wrap;
  justify-content: center;
  text-align: center;
}

.faction-symbol {
  width: 5rem;
  height: 5rem;
  object-fit: cover;
  border-radius: 10px;
}

.faction-name {
  color: #000;
  font-size: 1.5rem;
  font-weight: bold;
}

.faction-description {
  color: #444;
  margin-bottom: 1.5rem;
  text-align: justify;
}

.character-grid {
  display: grid;
  grid-template-columns: repeat(auto-fill, minmax(140px, 1fr));
  gap: 1rem;
}

@keyframes fadeUp {
  from {
    opacity: 0;
    transform: translateY(15px);
  }
  to {
    opacity: 1;
    transform: translateY(0);
  }
}

.character-card {
  border-radius: 0.5rem;
  padding: 12px;
  text-align: center;
  animation: fadeUp 0.4s ease-out both;

}

.character-card img:hover {
  scale: 1.2;
  box-shadow: 0 4px 8px rgba(0, 0, 0, 0.15);
}

.character-image {
  width: 8rem;
  height: 8rem;
  object-fit: cover;
  aspect-ratio: 4/3;
  border-bottom: 1px solid #ccc;
  border-radius: 50%;
  transition: all ease-in-out 0.2s;
}

.character-name {
  font-size:1.1rem;
  color: #b8860b;
}

.character-nickname {
  font-style: italic;
  color: #666;
  font-size: 0.9em;
}

/* MOBILE OPTIMISÉ */
@media screen and (max-width: 600px) {
  .faction-card {
    margin: 5vw;
    padding: 16px;
    height: auto;
  }

  .faction-symbol {
    width: 48px;
    height: 48px;
  }

  .faction-name {
    font-size: 20px;
  }

  .character-image {
    width: 7rem;
    height: 7rem;
  }
}
</style>
