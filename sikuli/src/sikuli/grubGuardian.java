package sikuli;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Location;
import org.sikuli.script.Pattern;
import org.sikuli.script.Region;

public class grubGuardian {

	String mythAvailable = "resources/grubGuardian/mythAvailable.png";
	String mythUpgrade = "resources/grubGuardian/mythUpgrade.png";
	String mythNoUpgrade = "resources/grubGuardian/mythNoUpgrade.png";
	String goButton = "resources/grubGuardian/goButton.png";
	String speedUp = "resources/grubGuardian/speedUp.png";
	String wysteria = "resources/grubGuardian/wysteria.png";
	String playButton = "resources/grubGuardian/playButton.png";
	String nextButton = "resources/grubGuardian/nextButton.png";
	String backButton = "resources/grubGuardian/backButton.png";
	String maxRewards = "resources/grubGuardian/maxRewards.png";

	Location tanglewoodLocation = new Location(600, 655);
	Location petLocation = new Location(773, 490);
	Location mythOneLocation = new Location(734, 513);
	Location mythTwoLocation = new Location(708, 580);
	Location mythThreeLocation = new Location(768, 580);
	Location mythFourLocation = new Location(833, 580);
	Location goButtonLocation = new Location(1074, 764);

	Region gameRegion = new Region(464, 315, 658, 502);
	Region mythOneRegion = new Region(591, 416, 103, 94);
	Region mythTwoRegion = new Region(558, 477, 101, 100);
	Region mythThreeRegion = new Region(622, 480, 95, 93);
	Region mythFourRegion = new Region(687, 480, 95, 87);
	Region goButtonRegion = new Region(1029, 721, 99, 100);

	Pattern mythPattern = new Pattern(mythAvailable);

	public void initSimilarity() {
		mythPattern.similar((float) (0.82));
		mythOneRegion.setAutoWaitTimeout(6000000);
		mythTwoRegion.setAutoWaitTimeout(6000000);
		mythThreeRegion.setAutoWaitTimeout(6000000);
		mythFourRegion.setAutoWaitTimeout(6000000);
	}

	public void placePet() throws FindFailed {
		gameRegion.click(petLocation);
	}

	public void placeMythOne() throws FindFailed, InterruptedException {
		gameRegion.click(mythOneLocation);
		gameRegion.click(mythAvailable);
		Thread.sleep(100);
	}

	public void placeMythTwo() throws FindFailed, InterruptedException {
		gameRegion.click(mythTwoLocation);
		gameRegion.click(mythAvailable);
		Thread.sleep(100);
	}

	public void placeMythThree() throws FindFailed, InterruptedException {
		gameRegion.click(mythThreeLocation);
		gameRegion.click(mythAvailable);
		Thread.sleep(100);
	}

	public void placeMythFour() throws FindFailed, InterruptedException {
		gameRegion.click(mythFourLocation);
		gameRegion.click(mythPattern);
		Thread.sleep(100);
	}

	public void clickGo() throws FindFailed {
		goButtonRegion.click(goButton);
	}

	public void clickSpeedUp() throws FindFailed {
		gameRegion.click(speedUp);
	}

	public void upgradeMythOne() throws FindFailed {
		gameRegion.click(mythOneLocation);
		mythOneRegion.wait(mythPattern).click();
	}

	public void upgradeMythTwo() throws FindFailed {
		gameRegion.click(mythTwoLocation);
		mythTwoRegion.wait(mythPattern).click();
	}

	public void upgradeMythThree() throws FindFailed {
		gameRegion.click(mythThreeLocation);
		mythThreeRegion.wait(mythPattern).click();
	}

	public void upgradeMythFour() throws FindFailed {
		gameRegion.click(mythFourLocation);
		mythFourRegion.wait(mythPattern).click();
	}

	public void startGame() throws FindFailed {
		System.out.print("inside start game \n");
		gameRegion.wait(playButton, 5000);
		gameRegion.click(tanglewoodLocation);
		gameRegion.wait(playButton).click();
	}

	public void initialPlacements() throws FindFailed {
		initSimilarity();
		gameRegion.wait(backButton, 5000);
		placePet();
		// placeMythOne();
		// placeMythTwo();
		// placeMythThree();
		// placeMythFour();
		clickGo();
		clickSpeedUp();
	}

	public void startUpgrades() throws FindFailed, InterruptedException {

		Thread.sleep(4000);
		placeMythOne();
		placeMythTwo();
		placeMythThree();
		placeMythFour();

		upgradeMythOne();
		upgradeMythFour();
		upgradeMythTwo();
		upgradeMythThree();

		upgradeMythOne();
		upgradeMythFour();
		upgradeMythTwo();
		upgradeMythThree();

		upgradeMythFour();
		upgradeMythOne();
		upgradeMythTwo();
		upgradeMythThree();

		upgradeMythFour();
		upgradeMythThree();
		upgradeMythTwo();
		upgradeMythOne();
	}

	public void finalizeResults() throws FindFailed, InterruptedException {
		gameRegion.wait(nextButton, 15000).click();
		gameRegion.wait(playButton, 5000).click();
		Thread.sleep(1000);
	}

	public void grubSequence() throws FindFailed, InterruptedException {
		int i = 0;
		do {
			i++;
			System.out.print("loop count : " + i + "\n");
			startGame();
			initialPlacements();
			startUpgrades();
			finalizeResults();
			Thread.sleep(3000);
		} while (gameRegion.wait(wysteria, 5000) != null);
		System.out.print("loop count : " + i+ "\n");
	}
}