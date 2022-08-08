package com.e2etests.automation.page_object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.e2etests.automation.utils.Setup;

public class RecruitmentCandidatesPage {

	/* @FindBy WebElement */
	
	@FindBy(how = How.ID, using = "menu_recruitment_viewRecruitmentModule")
	public static WebElement moduleRecruitment;
	
	@FindBy(how = How.ID, using = "btnAdd")
	public static WebElement btnAdd;
	
	@FindBy(how = How.ID, using = "addCandidateHeading")
	public static WebElement candidate_Heading;
	
	@FindBy(how = How.ID, using = "addCandidate_firstName")
	public static WebElement first_name;
	
	@FindBy(how = How.ID, using = "addCandidate_middleName")
	public static WebElement middle_name;
	
	@FindBy(how = How.ID, using = "addCandidate_lastName")
	public static WebElement last_name;
	
	@FindBy(how = How.ID, using = "addCandidate_email")
	public static WebElement mail;
	
	@FindBy(how = How.ID, using = "addCandidate_contactNo")
	public static WebElement contact_no;	
	
	@FindBy(how = How.ID, using = "addCandidate_vacancy")
	public static WebElement job_Vacancy_List;
	
	@FindBy(how = How.ID, using = "addCandidate_resume")
	public static WebElement resume;
	
	@FindBy(how = How.ID, using = "addCandidate_appliedDate")
	public static WebElement date_Application;
	
	@FindBy(how = How.ID, using = "btnSave")
	public static WebElement btnSave;
	
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Status: Application Initiated')]")
	public static WebElement messageStatus;
	
	/* @Search candidate */
	
	//@FindBy(how = How.XPATH, using = "//*[contains(text(), 'Add User')]")
	//public static WebElement add_Candidate;
	
	@FindBy(how = How.ID, using = "candidateSearch_jobTitle")
	public static WebElement candidate_Job_Title;
	
	@FindBy(how = How.ID, using = "candidateSearch_status")
	public static WebElement candidate_List_Status;
	
	@FindBy(how = How.ID, using = "candidateSearch_candidateName")
	public static WebElement candidate_Name_InSearch;
	
	@FindBy(how = How.ID, using = "btnSrch")
	public static WebElement candidate_Search_btn;
	
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Amal Amal Aouini')]")
	public static WebElement result_candidate_search_name;
	
	/* @Delete candidate */
	@FindBy(how = How.XPATH, using = "//*[@id='resultTable']/table/thead/tr/tbody/tr/td/input")
	public static WebElement checkboxCandidate;
	
	@FindBy(how = How.ID, using = "btnDelete")
	public static WebElement btnDelete;
	
	@FindBy(how = How.ID, using = "dialogDeleteBtn")
	public static WebElement confirmationbtnDelete;
	
	public RecruitmentCandidatesPage() {
		PageFactory.initElements(Setup.driver, this);
		}
	
	/* @Create Method */
	
	public void clickOnModuleRecruitment() {
		moduleRecruitment.click();
	}	
	public void clickOnbtnAdd() {
		btnAdd.click();
	}
	public void fillCandidateFirstName(String text_FirstName) {
		first_name.sendKeys(text_FirstName);
	}
	public void fillCandidateMiddleName(String text_MiddleName) {
		middle_name.sendKeys(text_MiddleName);
	}
	public void fillCandidateLastName(String text_LastName) {
		last_name.sendKeys(text_LastName);
	}
	public void fillCandidateEmail(String email) {
		mail.sendKeys(email);
	}
	public void fillContactNo(String text_contact_no) {
		contact_no.sendKeys(text_contact_no);
	}
	public void chooseJobVacancy(String job_vacancy) {
		Select select = new Select(job_Vacancy_List);
		select.selectByVisibleText(job_vacancy);
	}
	public void uploadResume(String resumeFilePath) {
		resume.sendKeys(resumeFilePath);
	}
	public void fillDateAplication(String applicationDate) {
		date_Application.clear();
		date_Application.sendKeys(applicationDate);
	}
	public void clickSave() {
		btnSave.click();
	}
	
	/* @Search Candidate*/
	
	public void chooseJobTitleSearch(String job_vacancy) {
		Select select = new Select(candidate_Job_Title);
		select.selectByVisibleText(job_vacancy);
	}
	
	public void chooseJobStatus(String job_status) {
		Select select = new Select(candidate_List_Status);
		select.selectByVisibleText(job_status);
	}
	
	public void fillCandidateNameSearch(String candidateNameInSearch) {
		candidate_Name_InSearch.sendKeys(candidateNameInSearch);
	}
	
	public void clickOnSearchCandidate() {
		candidate_Search_btn.click();
	}
	
	/* @Delete Candidate*/
	
	public void checkboCandidate() {
		checkboxCandidate.click();
	}
	
	public void deleteCandidate() {
		btnDelete.click();
	}
	
	public void confirmationDelete() {
		confirmationbtnDelete.click();
	}
	
	//public void clickOnSearchCandidate() {
	//	candidate_Search_btn.click();
	//}
	
}
