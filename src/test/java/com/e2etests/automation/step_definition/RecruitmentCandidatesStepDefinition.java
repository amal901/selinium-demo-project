package com.e2etests.automation.step_definition;

import org.testng.Assert;

import com.e2etests.automation.page_object.RecruitmentCandidatesPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RecruitmentCandidatesStepDefinition {
	
	private RecruitmentCandidatesPage recruitmentCandidatesPage;
	
	public RecruitmentCandidatesStepDefinition() {
		this.recruitmentCandidatesPage = new RecruitmentCandidatesPage();
	}
	
	@When("Je clique sur le module Recruitment")
	public void jeCliqueSurLeModuleRecruitment() {
		recruitmentCandidatesPage.clickOnModuleRecruitment();
	 
	}
	
	@When("Je clique sur le bouton Add")
	public void jeCliqueSurLeBoutonAdd() {
		recruitmentCandidatesPage.clickOnbtnAdd();
	 
	}
	@Then("La page Add Candidate s affiche {string}")
	public void laPageAddCandidateSAffiche(String Add_Candidate_Title) {
	String titleAddCandidate = RecruitmentCandidatesPage.candidate_Heading.getText();
	Assert.assertTrue(titleAddCandidate.contains(Add_Candidate_Title));
	
	}
	
	@When("Je saisis le prenom dans le champ First Name {string}")
	public void jeSaisisLePrenomDansLeChampFirstNameAmal(String first_name) {
		recruitmentCandidatesPage.fillCandidateFirstName(first_name);
	    
	}
	@When("Je saisis le deuxieme nom dans le champ Middle Name {string}")
	public void jeSaisisLeDeuxiemeNomDansLeChampMiddleNameAmal(String middle_name) {
		recruitmentCandidatesPage.fillCandidateMiddleName(middle_name);
	    
	}
	@When("Je saisis le nom dans le champ Last Name {string}")
	public void jeSaisisLeNomDansLeChampLastNameAouini(String last_name) {
		recruitmentCandidatesPage.fillCandidateLastName(last_name);
	   
	}
	@When("Je saisis l adress email dans le champ Email {string}")
	public void jeSaisisLAdressEmailDansLeChampEmailAmalGmailCom(String mail) {
		recruitmentCandidatesPage.fillCandidateEmail(mail);

	}
	@When("Je saisis le numero de telephone dans champ Contact No {string}")
	public void jeSaisisLeNumeroDeTelephoneDansChampContactNo(String contact_no) {
		recruitmentCandidatesPage.fillContactNo(contact_no);
	   
	}

	@When("Je selectionne Software Engineer dans Job Vacancy {string}")
	public void jeSelectionneSoftwareEngineerDansJobVacancy(String job_Vacancy) {
	recruitmentCandidatesPage.chooseJobVacancy(job_Vacancy);
	}

	@When("Je choisis un fichier dans resume {string}")
	public void jeChoisisUnFichierDansResume(String filePath) {
		recruitmentCandidatesPage.uploadResume(filePath);
	   
	}
	@When("Je choisis une date d application {string}")
	public void jeChoisisUneDateDApplication(String date_Application) throws InterruptedException {
		recruitmentCandidatesPage.fillDateAplication(date_Application);
		Thread.sleep(2000);
	   
	}
	@When("Je clique sur le bouton save")
	public void jeCliqueSurLeBoutonSave() {
		recruitmentCandidatesPage.clickSave();
	    
	}
	@Then("Je verifie que le condidat est ajouté {string}")
	public void jeVerifieQueLeCondidatEstAjouté(String condidatAjoute) {
		String message = RecruitmentCandidatesPage.messageStatus.getText();
		Assert.assertTrue(message.contains(condidatAjoute));
	   
	}
	
	/* @Search and delete */
	
	@When("Je selectionne Software Engineer dans le champ Job {string}")
	public void jeSelectionneSoftwareEngineerDansLeChampJob(String job_Vacancy_search) {
		recruitmentCandidatesPage.chooseJobTitleSearch(job_Vacancy_search);

	}
	@When("Je seletionne Application Initiated dans le champ Status {string}")
	public void jeSeletionneApplicationInitiatedDansLeChampStatus(String status_job) {
		recruitmentCandidatesPage.chooseJobStatus(status_job);

	}
	@When("Je Saisis Amal dans le champ Nom du candidhat {string}")
	public void jeSaisisAmalDansLeChampNomDuCandidhat(String searchCandidatName) {
		recruitmentCandidatesPage.fillCandidateNameSearch(searchCandidatName);

	}
	@When("Je clique sur le bouton search in candidates")
	public void jeCliqueSurLeBoutonSearchInCandidates() throws InterruptedException {
		recruitmentCandidatesPage.clickOnSearchCandidate();
		Thread.sleep(2000);

	}
	@Then("Je verifie que le candidat est affiche dans le tableau {string}")
	public void jeVerifieQueLeCandidatEstAfficheDansLeTableau(String nameResultSearh) {
		String resultSearchName = RecruitmentCandidatesPage.result_candidate_search_name.getText();
		Assert.assertTrue(resultSearchName.contains(nameResultSearh));

	}
	@When("Je coche Amal Amal Aouini")
	public void jeCocheAmalAmalAouini() {
		recruitmentCandidatesPage.checkboCandidate();

	}
	@When("Je clique sur le bouton Delete")
	public void jeCliqueSurLeBoutonDelete() {
		recruitmentCandidatesPage.deleteCandidate();

	}
	@When("Je clique sur le bouton OK")
	public void jeCliqueSurLeBoutonOK() {
		recruitmentCandidatesPage.confirmationDelete();

	}
	
	@Then("Je verifie que le candiat a ete supprime {string}")
	public void jeVerifieQueLeCandiatAEteSupprime(String Name) {
		String resultDeleteName = RecruitmentCandidatesPage.result_candidate_search_name.getText();
		Assert.assertFalse(resultDeleteName.contains(Name));

	}
}
