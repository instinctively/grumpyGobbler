package sikuli;

import java.awt.AWTException;
import java.awt.Robot;

import org.python.modules.thread.thread;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.Region;

public class characterCreation extends imageSearch {

	String newCharacterButton = "resources/characterCreation/newCharacterButton.png";
	Region newCharacterButtonRegion = new Region(1206,966,160,67);

	String ambroseNextButton = "resources/characterCreation/ambroseNextButton.png";
	Region ambroseNextButtonRegion = new Region(1049,975,168,66);
	//12 clicks on text to book

	String skipTestButton = "resources/characterCreation/skipTestButton.png";
	Region skipTestButtonRegion = new Region(581,752,242,73);

	String deathSchoolSelection = "resources/characterCreation/deathSchoolSelection.png";
	Region deathSchoolSelectionRegion = new Region(960,635,96,91);

	String schoolConfirmation = "resources/characterCreation/schoolConfirmation.png";
	Region schoolConfirmationRegion = new Region(1166,756,118,65);

	String girlGender = "resources/characterCreation/girlGender.png";
	String boyGender = "resources/characterCreation/boyGender.png";
	Region genderSelectionRegion = new Region(1736,448,173,157);
	// 3 clicks on next to done

	String nameConfirmation = "resources/characterCreation/nameConfirmation.png";
	Region nameConfirmationRegion = new Region(1141,974,182,76);
	// wait for play button

	String homePlayButton = "resources/characterCreation/homePlayButton.png";
	Region homePlayButtonRegion = new Region(819,952,268,103);
	// wait for skip tutorial button

	String skipTutButton = "resources/characterCreation/skipTutButton.png";
	Region skipTutButtonRegion = new Region(739,971,199,72);

	String tutSkipConfirmation = "resources/characterCreation/tutSkipConfirmation.png";
	Region tutSkipConfirmationRegion = new Region(879,548,165,75);

	String deleteButton = "resources/characterCreation/deleteButton.png";
	Region deleteButtonRegion = new Region(1058,964,166,77);

	String abracadabraBox = "resources/characterCreation/abracadabraBox.png";
	Region abracadabraBoxRegion = new Region(829,517,249,95);

	String abracadabraDelete = "resources/characterCreation/abracadabraDelete.png";
	Region abracadabraDeleteRegion = new Region(801,592,167,83);

	generic generic = new generic();

	public Region findNewCharacterButton() {
		System.out.print("trying to find new character button \n");
		try {
			Region foundButton = newCharacterButtonRegion.find(newCharacterButton);
			return foundButton;
		}
		catch(FindFailed e){
			return null;
		}
	}

	public void clickNewCharacterButton() throws FindFailed {
		System.out.print("trying to find new character button \n");
		newCharacterButtonRegion.wait(newCharacterButton).click();
	}

	public Region findambroseNextButton() {
		System.out.print("trying to find ambroseNextButton \n");
		try {
			Region foundButton = ambroseNextButtonRegion.find(ambroseNextButton);
			return foundButton;
		}
		catch(FindFailed e){
			return null;
		}
	}

	public void clickAmbroseNextButton() throws FindFailed, InterruptedException {
		System.out.print("trying to find ambroseNextButton \n");
		//ambroseNextButtonRegion.wait(ambroseNextButton).click();
		ambroseNextButtonRegion.type(Key.SPACE);
		Thread.sleep(100);

	}

	public Region findskipTestButton() {
		System.out.print("trying to find skipTestButton \n");
		try {
			Region foundButton = skipTestButtonRegion.find(skipTestButton);
			return foundButton;
		}
		catch(FindFailed e){
			return null;
		}
	}

	public void clickSkipTestButton() throws FindFailed {
		System.out.print("trying to find skipTestButton \n");
		skipTestButtonRegion.wait(skipTestButton).click();
	}

	public Region finddeathSchoolSelection() {
		System.out.print("trying to find deathSchoolSelection \n");
		try {
			Region foundButton = deathSchoolSelectionRegion.find(deathSchoolSelection);
			return foundButton;
		}
		catch(FindFailed e){
			return null;
		}
	}

	public void clickDeathSchool() throws FindFailed {
		System.out.print("trying to find deathSchoolSelection \n");
		deathSchoolSelectionRegion.wait(deathSchoolSelection).click();

	}

	public Region findschoolConfirmation() {
		System.out.print("trying to find schoolConfirmation \n");
		try {
			Region foundButton = schoolConfirmationRegion.find(schoolConfirmation);
			return foundButton;
		}
		catch(FindFailed e){
			return null;
		}
	}

	public void clickSchoolConfirmation() throws FindFailed {
		System.out.print("trying to find schoolConfirmation \n");
		schoolConfirmationRegion.wait(schoolConfirmation).click();

	}

	public Region findgirlGender() {
		System.out.print("trying to find girlGender \n");
		try {
			Region foundButton = genderSelectionRegion.find(girlGender);
			return foundButton;
		}
		catch(FindFailed e){
			return null;
		}
	}

	public Region findboyGender() {
		System.out.print("trying to find boyGender \n");
		try {
			Region foundButton = genderSelectionRegion.find(boyGender);
			return foundButton;
		}
		catch(FindFailed e){
			return null;
		}
	}

	public void selectGender() throws FindFailed {
		double game = Math.random();
		if (game > 0.5) {
			System.out.print("trying to find girlGender \n");
			genderSelectionRegion.wait(girlGender).click();
		}
		else {
			System.out.print("trying to find boyGender \n");
			genderSelectionRegion.wait(boyGender).click();
		}
	}

	public Region findnameConfirmation() {
		System.out.print("trying to find nameConfirmation \n");
		try {
			Region foundButton = nameConfirmationRegion.find(nameConfirmation);
			return foundButton;
		}
		catch(FindFailed e){
			return null;
		}
	}

	public void clickNameConfirmation() throws FindFailed {
		System.out.print("trying to find nameConfirmation \n");
		nameConfirmationRegion.wait(nameConfirmation).click();
	}

	public Region findhomePlayButton() {
		System.out.print("trying to find homePlayButton \n");
		try {
			Region foundButton = homePlayButtonRegion.find(homePlayButton);
			return foundButton;
		}
		catch(FindFailed e){
			return null;
		}
	}

	public void clickHomePlayButton () throws FindFailed {
		System.out.print("trying to find homePlayButton \n");
		homePlayButtonRegion.wait(homePlayButton).click();
	}

	public Region findskipTutButton() {
		System.out.print("trying to find skipTutButton \n");
		try {
			Region foundButton = skipTutButtonRegion.find(skipTutButton);
			return foundButton;
		}
		catch(FindFailed e){
			return null;
		}
	}

	public void clickSkipTutButton() throws FindFailed {
		System.out.print("trying to find skipTutButton \n");
		skipTutButtonRegion.wait(skipTutButton,5000).click();
	}

	public Region findskipTutConfirmation() {
		System.out.print("trying to find tutSkipConfirmation \n");
		try {
			Region foundButton = tutSkipConfirmationRegion.find(tutSkipConfirmation);
			return foundButton;
		}
		catch(FindFailed e){
			return null;
		}
	}

	public void clickSkipTutConfirmation() throws FindFailed, InterruptedException {
		System.out.print("trying to find tutSkipConfirmation \n");
		Thread.sleep(100);
		tutSkipConfirmationRegion.wait(tutSkipConfirmation).click();
	}

	public Region finddeleteButton() {
		System.out.print("trying to find deleteButton \n");
		try {
			Region foundButton = deleteButtonRegion.find(deleteButton);
			return foundButton;
		}
		catch(FindFailed e){
			return null;
		}
	}

	public void clickDeleteButton() throws FindFailed {
		System.out.print("trying to find deleteButton \n");
		deleteButtonRegion.wait(deleteButton).click();
	}

	public Region findabracadabraBox() {
		System.out.print("trying to find abracadabraBox \n");
		try {
			Region foundButton = abracadabraBoxRegion.find(abracadabraBox);
			return foundButton;
		}
		catch(FindFailed e){
			return null;
		}
	}	

	public void clickAbracadabraBox() throws FindFailed {
		System.out.print("trying to find abracadabraBox \n");
		abracadabraBoxRegion.wait(abracadabraBox).click();
	}

	public Region findabracadabraDelete() {
		System.out.print("trying to find abracadabraDelete \n");
		try {
			Region foundButton = abracadabraDeleteRegion.find(abracadabraDelete);
			return foundButton;
		}
		catch(FindFailed e){
			return null;
		}
	}

	public void clickAbracadabraDelete() throws FindFailed {
		System.out.print("trying to find abracadabraDelete \n");
		abracadabraDeleteRegion.wait(abracadabraDelete).click();
	}

	public void deleteCharacter() throws AWTException, FindFailed {
		Robot robot = new Robot();
		clickDeleteButton();
		clickAbracadabraBox();
		typeCharacter(robot, "abracadabra");
		clickAbracadabraDelete();
	}

	public void createCharacter() throws FindFailed, InterruptedException, AWTException {
		Robot robot = new Robot();
		clickNewCharacterButton();
		//clickAmbroseNextButton();
		ambroseNextButtonRegion.wait(ambroseNextButton).click();
		clickAmbroseNextButton();
		clickAmbroseNextButton();
		clickAmbroseNextButton();
		clickAmbroseNextButton();
		clickAmbroseNextButton();
		clickAmbroseNextButton();
		clickAmbroseNextButton();
		clickAmbroseNextButton();
		clickAmbroseNextButton();
		clickAmbroseNextButton();
		clickSkipTestButton();
		clickDeathSchool();
		clickSchoolConfirmation();
		selectGender();
		ambroseNextButtonRegion.wait(ambroseNextButton).click();
		ambroseNextButtonRegion.wait(ambroseNextButton).click();
		ambroseNextButtonRegion.wait(ambroseNextButton).click();
		clickNameConfirmation();
		clickHomePlayButton();
		clickSkipTutButton();
		findskipTutButton().click();
		clickSkipTutConfirmation();
	}
}