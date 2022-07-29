@buzz
Feature: Authentification sur l application Orange
  En tant que utilisateur je souhaite m authentifier sur l application l application Orange

  @login
  Scenario: Authentification sur l application Orange
    Given Je me connecte a l application OrangeHRM "https://opensource-demo.orangehrmlive.com"
    When Je saisie le username "Admin"
    And Je saisie le mot le passe "admin123"
    And Je clique sur le bouton login
    When Je clique sur le module Buzz
    And Je saisis un message dans le champ mind
    And Je clique sur le bouton post
    Then Le nouveau message s affiche
    When Je clique sur l icone logout
    And Je clique sur le boutton logout