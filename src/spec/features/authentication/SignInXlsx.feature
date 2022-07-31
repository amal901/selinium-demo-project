@cnxExcel
Feature: Je me connecte a l application OrangeHRM avec un fichier Excel
  En tant que utilisateur je souhaite m authentifier a l application OrangeHRM
  

  	
  @connexion_ok
  Scenario: Authentification a l application OrangeHRM
 Given Je me connecte a l application OrangeHRM
    When Je m authentifie avec un fichier excel
