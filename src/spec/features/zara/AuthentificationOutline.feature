@outline
Feature: Authentification sur l application Zara
  En tant que utilisateur je souhaite m authentifier sur l application avec un scenario outline

  @login
  Scenario Outline: Authentification sur l application Zara avec plusieur utilisateur
    Given Je me connecte sur l application Zara "https://www.zara.com/tn/"
    When Je clique sur se connecter
    Then Je me rederige vers la page "DÉMARRER LA SESSION"
    When Je saisis l adresse mail "<email>"
    And Je saisis le mot de passe "<password>"
    And Je clique sur se connecter

    Examples: 
      | email  | password | 
      | samehaouichaoui@yahoo.fr | samah2020AB | 
      | amal@gmail.com |amal123 | 
      | soumaya@gmail.com | soumaya123 | 
      
