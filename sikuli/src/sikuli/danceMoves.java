package sikuli;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Region;
import org.sikuli.script.Screen;
public class danceMoves extends imageSearch {

	Region arrowRegion = new Region(907,905,140,121);
	Region matchThisRegion = new Region(771,866,378,79);
	Region rewardTextRegion = new Region(837,227,249,88);
	Screen s2 = new Screen();
	Thread thread = new Thread();
	ArrayList<String> results = new ArrayList<>();
	//	File file1 = new File(imagePath+"/destFile.png");
	imageSearch imageSearch = new imageSearch();
	boolean upThreadRunning = true;
	boolean downThreadRunning = true;
	boolean leftThreadRunning = true;
	boolean rightThreadRunning = true;

	// TEST PLUGIN DATA FROM IMAGE SEARCH START
	Region leftRightRegion = new Region(942,930,39,79);
	Region upDownRegion = new Region(958,945,42,65);
	Region arrows = new Region(907,905,140,121);
	static String leftArrow = "resources/smallerArrows/left3.png";
	static String rightArrow = "resources/smallerArrows/right3.png";
	static String upArrow = "resources/smallerArrows/up3.png";
	static String downArrow = "resources/smallerArrows/down3.png";
	
	Pattern upArrowPattern = new Pattern(upArrow);
	Pattern downArrowPattern = new Pattern(downArrow);
	Pattern leftArrowPattern = new Pattern(leftArrow);
	Pattern rightArrowPattern = new Pattern(rightArrow);
	// TEST PLUGIN DATA FROM IMAGE SEARCH END

	public void innitSimilarity() {
		upArrowPattern.similar((float)(0.82));
		downArrowPattern.similar((float)(0.82));
		leftArrowPattern.similar((float)(0.82));
		rightArrowPattern.similar((float)(0.82));
	}

	Thread upThread = new Thread() {
		public void run() {
			System.out.print("up thread start\n");
			while (upThreadRunning) {
				try {
					//if (imageSearch.findUpPattern()) {
					if (leftRightRegion.exists(upArrowPattern) != null) {
						System.out.print("found up\n");
						results.add("up");
						sleep(100);
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}
	};

	Thread downThread = new Thread() {
		public void run() {
			System.out.print("down thread start\n");
			while (downThreadRunning) {
				try {
					//if (imageSearch.findDownPattern()) {
					if(leftRightRegion.exists(downArrowPattern) != null) {
						System.out.print("found down\n");
						results.add("down");
						sleep(100);
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	};

	Thread leftThread = new Thread() {
		public void run() {
			System.out.print("left thread start\n");
			while (leftThreadRunning) {
				try {
					//if (imageSearch.findLeftPattern()) {
					if(leftRightRegion.exists(leftArrowPattern) != null) {
						System.out.print("found left\n");
						results.add("left");
						sleep(100);
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	};

	Thread rightThread = new Thread() {
		public void run() {
			System.out.print("right thread start\n");
			while (rightThreadRunning) {
				try {
					//if (imageSearch.findRightPattern()) {
					if(leftRightRegion.exists(rightArrowPattern) != null) {
						System.out.print("found right\n");
						results.add("right");
						sleep(100);
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	};

	public BufferedImage takeScreenshot() throws IOException {
		BufferedImage bf = s2.capture(arrowRegion).getImage();
		File file1 = new File("D:/Fraps/a.png");
		return bf;
		//ImageIO.write(bf, "png", file1);
	}

	public void getDanceMoves() throws IOException, FindFailed {
		imageSearch.searchTimeoutInit();
		leftRightRegion.setAutoWaitTimeout(0);
		//innitSimilarity();
		int i = 0;
		upThread.start();
		downThread.start();
		leftThread.start();
		rightThread.start();
		while (i < 1) {
			i++;	
			danceInterface.rewardNextButtonRegion.wait(danceInterface.rewardNextButton,60000);
			//			if (imageSearch.findUpPattern() == true)
			//				//results.add("found up");
			//				System.out.print("found up\n");
			//			if (imageSearch.findDownPattern() == true)
			//				//results.add("found down");
			//				System.out.print("found down\n");
			//			if (imageSearch.findLeftPattern() == true)
			//				//results.add("found left");
			//				System.out.print("found left\n");
			//			if (imageSearch.findRightPattern() == true)
			//				//results.add("found right");
			//				System.out.print("found right\n");			
		}
		System.out.print(results);
		upThreadRunning = false;
		downThreadRunning = false;
		leftThreadRunning = false;
		rightThreadRunning = false;
	}
}
