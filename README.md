# Arcane

## Description

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

## Stack technique
| Frontend |   Backend   | Base de données |      Monitoring      | 
|:--------:|:-----------:|:---------------:|:--------------------:|
|  Vue.js  | Spring Boot |   PostgreSQL    | Prometheus + Grafana | 

## Lancer le projet en local

Afin de faciliter le lancement du projet le fichier docker/.env est versionné avec les identifiants de connections
à **PostgreSQL**.