@recruitment
Feature: Chercher et supprimer des candidats ou des offres d emploi
  En tant qu utilisateur, je souhaite verifier la presence d un candidat ou d offre d emploi et le suppimer 

  Background: 
   Given Je me connecte a l application OrangeHRM
    When Je saisis le username "Admin"
    And Je saisis le mot le passe "admin123"
    And Je clique sur le bouton login
    And Je clique sur le module Recruitment

  @add_candidate
  Scenario Outline: Ajouter un candidat
  	When je clique sur le bouton Add 
  	Then la page Add Candidate s affiche
  	When je saisis le first name, le middle name et  last name
  	And Je saisis l adress email "<amal.@gmail.com>"
  	And  Je saisis le nmero de telephone "<222222222>"
  	And Je selectionne "<Software Engineer>" dans Job Vacancy
  	And Je choisis un fichier 
  	And Je saisis le job title "<Software Engineer>"
    And Je saisis le candidat Name "<candidate_Name>"
    And Je choisis une date d application
    And Je clique sur le bouton save
    Then Je verifie que le cndidat est ajouté
   

    Examples: 
      | candidate_Name   |
      | Jennifer Clinton |
      | gonetone 03      |

  @delet_candidate
  Scenario Outline: supprimer un candidat
    When Je clique sur le bouton Add afin d ajouter un nouveau candidat
    Then Je me suis redirigee vers la page "Add Candidate"
    When Je sais le prenom du candidat dans le champ First Name "<first_Name>"
    And Je saisis le deuxieme nom dans le champ Middle Name "<middle_Name>"
    And Je saisis le nom dans le champ Last Name "<last_Name>"
    And Je saisis l E-mail du nouveau candidat dans le champ E-mail "<email>"
    And Je sais le numero de contact dans le champ Contact No "<contact_No>"
    And Je saisis le titre de poste tout en utilisant la liste deroulante Job Vacancy "<job_Vacancy>"
    And Je fait joindre le curriculum vitae du candidat dans le champ Resume "<resume>"
    And Je saisis des mots cles dans le champ Keywords "<keywords>"
    And Je saisis un commentaire dans le champ Comment "<comment>"
    And Je saisis la date d application dans le champ Date of Application "<date_Application>"
    And Je clique sur le chekbox afin de confirmer le consentement de conserver les données
    And Je clique sur le bouton Save afin de sauvegarder les donnees saisies
    Then Je verifie que le candidat a ete bien ajoute a la liste "Status: Application Initiated"
    When Je clique sur le bouton Back pour que je puisse ajouter un nouveau candidat
    And Je clique sur le bouton Add afin d ajouter un nouveau candidat

    Examples: 
      | first_Name | middle_Name | last_Name | email                 | contact_No   | job_Vacancy       | resume                                        | keywords | comment | date_Application |
      | Yosra      | yosra       | WELHAZI   | yosrawelhazi@yahoo.fr | +21629663428 | Software Engineer | C:\\Users\\pc\\Downloads\\Test technique.docx | nothing  | nothing | 2022-07-31       |
      | Yos        | yosra11111  | WEL       | yosrawelhazi@yahoo.fr | +2161        | Software Engineer | C:\\Users\\pc\\Downloads\\Test technique.docx | nothing  | nothing | 2020-08-28       |
