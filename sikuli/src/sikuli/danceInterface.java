package sikuli;

import java.io.IOException;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Region;

public class danceInterface {

	String danceBanner = "resources/danceInterface/danceGamebanner.png";
	Region danceBannerRegion = new Region(712, 839, 492, 197);
	String selectLevel = "resources/danceInterface/selectLevel.png";
	String powerStat = "resources/danceInterface/powerStat.png";
	Region powerStatRegion = new Region(938, 555, 71, 76);
	Region selectLevelRegion = new Region(855, 236, 201, 81);
	String selectMooshu = "resources/danceInterface/selectMooshu.png";
	Region selectMooshuRegion = new Region(996, 631, 150, 130);
	String playButton = "resources/danceInterface/playButton.png";
	Region playButtonRegion = new Region(1095, 748, 181, 79);
	static String rewardNextButton = "resources/danceInterface/rewardNextButton.png";
	static Region rewardNextButtonRegion = new Region(1093, 752, 178, 76);
	Region firstSnackRegion = new Region(659, 599, 132, 171);
	String feedPetButton = "resources/danceInterface/feedPetButton.png";
	Region feedPetButtonRegion = new Region(1098, 749, 166, 88);
	String playAgainButton = "resources/danceInterface/playAgainButton.png";
	Region playAgainButtonRegion = new Region(859, 748, 192, 83);
	String buyEnergyButton = "resources/danceInterface/buyEnergy.png";
	Region buyEnergyButtonRegion = new Region(855, 747, 201, 88);
	Region quitButtonRegion = new Region(707, 731, 161, 56);
	danceMoves danceMoves = new danceMoves();

	public void playDanceGame() throws FindFailed, InterruptedException,
	IOException {
		int i = 0;
		buyEnergyButtonRegion.setAutoWaitTimeout(0);
		do {
			danceBannerRegion.type("x");
			selectMooshuRegion.wait(selectMooshu, 10000).click();
			playButtonRegion.click(playButton);
			// danceMoves.getDanceMoves();
			rewardNextButtonRegion.wait(rewardNextButton, 60000).click();
			firstSnackRegion.click();
			feedPetButtonRegion.click(feedPetButton);
			Thread.sleep(1000);
			playAgainButtonRegion.click(playAgainButton);
			// Thread.sleep(500);
			powerStatRegion.wait(powerStat, 5000).click();
			// selectLevelRegion.wait(selectLevel, 5000).click();
			if (buyEnergyButtonRegion.exists(buyEnergyButton) == null)
				i = 0;
			else
				i = 1;
		} while (i == 0);
		// danceBannerRegion.type(Key.ESC);
		// Thread.sleep(1000);
		// quitButtonRegion.click();
	}
}
