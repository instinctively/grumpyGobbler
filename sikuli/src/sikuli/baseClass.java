package sikuli;

import java.util.ArrayList;

import org.sikuli.basics.Settings;

public class baseClass extends imageSearch {

	public static void main(String[] args) throws Exception {
		//Settings.MoveMouseDelay = 0.5;
		Settings.OcrTextSearch = true;
		Settings.OcrTextRead = true;
		ArrayList<String> results = new ArrayList<>();
		characterCreation characterCreation = new characterCreation();
		danceInterface danceInterface = new danceInterface();
		danceMoves danceMoves = new danceMoves();
		grubGuardian grubGuardian = new grubGuardian();
		//App.focus("Wizard101");
		Thread.sleep(2000);

		//characterCreation.deleteCharacter();

		//characterCreation.createCharacter();
		
		//danceInterface.playDanceGame();	

		grubGuardian.grubSequence();
		
//		String fileName = System.getProperty("user.home")+"/student.csv";
//		System.out.print(fileName);
//		tenLac.writeCsvFile(fileName);
	}
}