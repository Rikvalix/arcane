<script setup lang="ts">

import MenuHeader from "../components/header/MenuHeader.vue";
import type {FactionInterface} from "../interfaces/factionInterface.ts";
import {ref} from "vue";
import {getAllFaction} from "../api/libs/faction.ts";
import FactionCard from "../components/card/FactionCard.vue";

const factions = ref<FactionInterface[]>([])


getAllFaction().then(response => {
  factions.value = response;
})

</script>

<template>
  <div class="hero">
    <MenuHeader/>
    <div class="container">
      <h1>Les factions</h1>
    </div>
  </div>
  <div class="faction-list">
    <FactionCard v-for="faction in factions" :key="faction.id" :faction="faction"/>

  </div>
</template>

<style scoped>
.hero {
  background: url("/images/background/univers-banner.jpg") no-repeat center/cover;
  height: 100vh;
  display: flex;
  flex-direction: column;
  align-content: center;
  justify-content: center;
}
.container {
  width: 100%;
  position: relative;

}
.faction-list {
  display: flex;
  flex-direction: row;
  justify-content: center;
  flex-wrap: wrap;
  gap: 1em;
  margin-top: 4em;
  margin-bottom: 4em;
}


@media screen and (max-width: 768px) {
  .faction-list {
    display: flex;
    flex-direction: column;
    align-items: center;
  }
}
</style>