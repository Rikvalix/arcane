<script setup lang="ts">


import MenuHeader from "../components/header/MenuHeader.vue";
import AuthenticationForm from "../components/form/AuthenticationForm.vue";
</script>

<template>

  <div class="hero">
    <MenuHeader/>
    <div class="container">
      <AuthenticationForm/>
    </div>
  </div>


</template>

<style scoped>
.hero {
  position: relative;
  background: url("/images/background/bg-arcane.jpg") no-repeat center/cover;
  height: 100vh;
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
}
.container {
  width: 100%;
  position: relative;
}

</style>