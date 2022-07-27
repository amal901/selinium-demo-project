@authentification
Feature: Je me connecte a l'application OrangeHRM
  En tant que utilisateur je souhaite m'authentifier a l application OrangeHRM

  @connexion_ok
  Scenario: Authentification a l application OrangeHRM
    Given Je me connecte a l application OrangeHRM
    When Je saisie le username "Admin"
    And Je saisie le mot le passe "admin123"
    And Je clique sur le bouton login
    Then Je me redirige vers la page home "Welcome"

  @deconexion
  Scenario: Verifier la deconnexion
    Given Je me connecte a l application OrangeHRM
    When Je saisie le username "Admin"
    And Je saisie le mot le passe "admin123"
    And Je clique sur le bouton login
    Then Je me redirige vers la page home "Welcome"
    When Je clique sur l icone logout
    And Je clique sur le boutton logout
