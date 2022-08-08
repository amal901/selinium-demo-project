@authentification
Feature: Je me connecte a l'application OrangeHRM
  En tant que utilisateur je souhaite m'authentifier a l application OrangeHRM
  
  Background:	
  	Given Je me connecte a l application OrangeHRM
    When Je saisis le username "Admin"
    And Je saisis le mot le passe "YWRtaW4xMjM"
    And Je clique sur le bouton login

  @connexion_ok
  Scenario: Authentification a l application OrangeHRM
    Then Je me redirige vers la page home "Welcome"

	@deconexion
  Scenario: Verifier la deconnexion
    When Je clique sur l icone logout
    And Je clique sur le boutton logout