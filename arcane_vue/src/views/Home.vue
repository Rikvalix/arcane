<script setup lang="ts">
import Header from "../components/header/Header.vue";
import {onMounted, ref} from "vue";
import {getAllCharacters} from "../api/libs/character.ts";
import type {CharacterInterface} from "../interfaces/characterInterface";
import CharacterCard from "../components/card/CharacterCard.vue";



// Variable to store the characters
const characters  = ref<CharacterInterface[]>([])

const fetchCharacters = () => {
  getAllCharacters().then(response => {
      characters.value = response
      shuffleCharacters()
  })
}

const shuffleCharacters = () => {
  characters.value = characters.value.sort(() => Math.random() - 0.5)
}

onMounted(fetchCharacters)
</script>

<template>
  <Header/>
  <div class="description">
    <p><strong>Arcane</strong> est une série animée captivante plongeant dans l'univers riche et complexe de <em>League of Legends</em>. Révélant les origines des personnages iconiques de Piltover et Zaun</p>
    <p>La série explore les tensions entre ces deux cités aux destinées divergentes. Avec un mélange parfait de drame, de magie et de technologie, la série se concentre sur les luttes de pouvoir, les alliances improbables et les conflits personnels de personnages tels que Vi, Jinx, Jayce et Caitlyn.</p>

    <p>Derrière chaque choix et chaque événement, <strong>Arcane</strong> interroge les relations humaines et les conséquences de la recherche du pouvoir, tout en offrant une animation visuellement stupéfiante et une bande-son immersive. À la croisée de l'animation et de la narration épique, <strong>Arcane</strong> est une exploration poignante des origines et des transformations des personnages, idéal pour les fans de <em>League of Legends</em> et de récits d'animation profonds et saisissants.</p>
  </div>

  <h1 class="title">Quelques personnages</h1>
  <div class="character-list">
    <CharacterCard
        v-for="character in characters.slice(0, 5)"
        :key="character.id"
        :character=character
        />
  </div>


</template>

<style scoped>
.description {
  margin : 2em 5em ;
}

.description p {
  line-height: 1.5em;
  margin-bottom: 1em;
  font-size: 1.5em;
}
.character-list {
  display: flex;
  flex-direction: row;
  justify-content: center;
  flex-wrap: wrap;
  gap: 1em;
  margin-bottom: 4em;
}


@media screen and (max-width: 768px) {
  .character-list {
    display: flex;
    flex-direction: column;
    align-items: center;
  }
}
</style>