@recruitment
Feature: Chercher et supprimer des candidats ou des offres d emploi
  En tant qu utilisateur, je souhaite verifier la presence d un candidat ou d offre d emploi et le suppimer

  Background: 
    Given Je me connecte a l application OrangeHRM
    When Je saisis le username "Admin"
    And Je saisis le mot le passe "YWRtaW4xMjM="
    And Je clique sur le bouton login
    And Je clique sur le module Recruitment

  @add_candidate
  Scenario Outline: Ajouter un candidat
    When Je clique sur le bouton Add
    Then La page Add Candidate s affiche "Add Candidate"
    When Je saisis le prenom dans le champ First Name "<first_name>"
    And Je saisis le deuxieme nom dans le champ Middle Name "<middle_name>"
    And Je saisis le nom dans le champ Last Name "<last_name>"
    And Je saisis l adress email dans le champ Email "<mail>"
    And Je saisis le numero de telephone dans champ Contact No "<contact_no>"
    And Je selectionne Software Engineer dans Job Vacancy "<job_vacancy>"
    And Je choisis un fichier dans resume "<resume>"
    And Je choisis une date d application "<date_Application>"
    And Je clique sur le bouton save
    Then Je verifie que le condidat est ajouté "Status: Application Initiated"

    Examples: 
      | first_name | middle_name | last_name | mail           | contact_no | job_vacancy       | resume                                        | date_Application |
      | Amal       | Amal        | Aouini    | amal@gmail.com |  222222222 | Software Engineer | C:\\Users\\pc\\Downloads\\Test technique.docx | 2022-08-03|
      | Amal       | Amal        | Aouini    | amal@gmail.com |  222222222 | Software Engineer | C:\\Users\\pc\\Downloads\\Test technique.docx | 2022-08-03 |

  @search_candidate
  Scenario Outline: Chercher et supprimer un candidat
    When Je selectionne Software Engineer dans le champ Job "Software Engineer"
    And Je seletionne Application Initiated dans le champ Status "Application Initiated"
    And Je Saisis Amal dans le champ Nom du candidhat "Amal Amal Aouini"
    And Je clique sur le bouton search in candidates
    Then Je verifie que le candidat est affiche dans le tableau "Amal Amal Aouini"
    When Je coche Amal Amal Aouini
    And Je clique sur le bouton Delete
    And Je clique sur le bouton OK
    Then Je verifie que le candiat a ete supprime "Amal Amal Aouini"
