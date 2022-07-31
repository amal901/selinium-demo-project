@admin
Feature: Chercher un utilisateur
  En tant que utilisateur je souhaite verifier la presence d un utilisateur

  Background:	
  	Given Je me connecte a l application OrangeHRM
    When Je saisis le username "Admin"
    And Je saisis le mot le passe "admin123"
    And Je clique sur le bouton login

  @search_admin
  Scenario: Verifier la presence d un utilisateur
    When Je clique sur le module admin
    And Je saisis "admin" dans le champ Username
    And Je clique sur le bouton search
    Then Je verifie la presence d un utilisateur dans le tableau "admin"
 		When Je clique sur l icone logout
    And Je clique sur le boutton logout   
