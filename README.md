# PULIEN_Atelier1
Atelier n°1 du module de WebDynamique - Microservices

## Contributeurs :
* Théo CLERE
* Maxime BROSSARD
* Sandro SPINA
* Ceif-Edine MAROUANI
* Julien BUC

## Travail réalisé

* Web statique (HTML + JS):
  * Formulaire d'ajout de cartes
    * Ouvrir le fichier ./web-statique/addCard.html
  * Page d'affichage d'une carte selon un id passé en paramètre
    * Ouvrir le fichier ./web-statique/displayCard.html + ajouter le ?id=[cardnumber] dans l'URL
      
* Web dynamique (SpringBoot + Thymeleaf):
  * Formulaire d'ajout de cartes
    * Ouvrez le projet SPWebAppStep1 et lancez l'application. Ensuite rendez vous à localhost:8080/card/insertNew pour trouver le formulaire d'ajout de carte. Une fois la carte ajoutée, vous trouverez une vue avec cette même carte.
  * Page d'affichage d'une carte:
    * Rendez vous sur localhost:8080/{id} pour afficher la carte d'id {id}  

## Travail suplémentaire

* Web statique (HTML + JS):
  * Page d'affichage des toutes les cartes :
    * Ouvrir le fichier ./web-statique/displayCards.html 
* Web dynamique
  * Page d'affichage de toutes les cartes : 
    * Aller sur localhost:8080/list pour voir toutes les cartes actuellement disponibles (des données de base sont déjà simulées)
