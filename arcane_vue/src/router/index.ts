import { createRouter, createWebHistory } from 'vue-router'

import Home from '../views/Home.vue'
import Universe from "../views/Universe.vue";
import Gallery from "../views/Gallery.vue";
import Authentication from "../views/Authentication.vue";

const routes = [
    {
        path: '/',
        name: 'Home',
        component: Home, // Vue à afficher pour cette route
    },
    {
        path: '/universe',
        name: 'Universe',
        component: Universe,
    },
    {
        path: '/gallery',
        name: 'Gallery',
        component: Gallery,
    },
    {
        path : '/auth',
        name : 'Authentication',
        component: Authentication
    }
]
const router = createRouter({
    history: createWebHistory(),
    routes,
})

export default router
