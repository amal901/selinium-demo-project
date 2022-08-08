@buzz
Feature: Authentification sur l application Orange
  En tant que utilisateur je souhaite m authentifier sur l application l application Orange

  @login_buzz
  Scenario: Authentification sur l application Orange
    Given Je me connecte a l application OrangeHRM "https://opensource-demo.orangehrmlive.com"
    When Je saisis le username "Admin"
    And Je saisis le mot le passe "admin123"
    And Je clique sur le bouton login
    When Je clique sur le module Buzz
    And Je saisis un message dans le champ mind "Bonjour"
    And Je clique sur le bouton post
    Then Le nouveau message s affiche "Bonjour"
    When Je clique sur l icone logout
    And Je clique sur le boutton logout