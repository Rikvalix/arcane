# Arcane

## 📖 Description

Dans le cadre d'un stage académique en entreprise, j'ai développé une application web complète en apprenant et
utilisant :

- Le framework backend Spring Boot (Java)
- Le framework frontend Vue.js
- Une base de données PostgreSQL
- Une stack de monitoring avec Prometheus et Grafana

Le projet s'articule autour de l'univers de la série Arcane, et permet de consulter des informations sur les
personnages, factions, et lieux emblématiques.

![home.png](doc/home.png)

## Fonctionnalités

1. ✅ Affichage responsive des personnages, factions et lieux emblématiques
2. ✅ Identification avec token JWT
3. ✅ Visualisation des métriques avec Prometheus et Grafana
4. 🔧 Edition de personnages via un panel admin
5. 🔧 Ecriture d'histoire autours des personnages et stockage

## 🔧 Stack technique
| Frontend |   Backend   | Base de données |      Monitoring      | 
|:--------:|:-----------:|:---------------:|:--------------------:|
|  Vue.js  | Spring Boot |   PostgreSQL    | Prometheus + Grafana | 

---

## 🚀 Lancer le projet en local

Le projet est entièrement **dockerisé**, ce qui permet un déploiement rapide et isolé.

### 🔧 Pré-requis

* Docker installé sur votre machine
* Docker Compose

---

### 📁 Configuration initiale

1. **Fichier d’environnement Docker**
   Le fichier [`docker/.env`](docker/.env) est versionné et contient les identifiants de connexion à **PostgreSQL** utilisés par défaut.

2. **Configurer l'adresse IP de votre machine**
   Modifiez l'IP de votre **PC ou serveur** dans les fichiers suivants :

    * `arcane_vue/.env` → utilisé par le frontend pour accéder à l’API
    * `arcane_backend/src/main/resources/application.properties` → utilisé si l’API a besoin d’une IP externe spécifique (dans certains cas)

---

### 📦 Construction des images Docker

```bash
docker compose build
```

---

### 🚀 Lancement des services

* **Tout lancer (avec logs)** :

  ```bash
  docker compose up
  ```

* **Tout lancer en arrière-plan (sans logs)** :

  ```bash
  docker compose up -d
  ```

* **Lancer uniquement les services principaux sans afficher les logs** :

  ```bash
  docker compose up -d db backend frontend
  ```

---