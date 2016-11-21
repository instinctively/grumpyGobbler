package sikuli;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.lang.reflect.Field;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Match;
import org.sikuli.script.Pattern;
import org.sikuli.script.Region;

public class imageSearch {

	Region r = new Region(779,855,405,166);
	Region arrows = new Region(907,905,140,121);

	//	static String leftArrow = "resources/danceGame/left.png";
	//	static String rightArrow = "resources/danceGame/right.png";
	//	static String upArrow = "resources/danceGame/up.png";
	//	static String downArrow = "resources/danceGame/down.png";
	String goText = "resources/danceGame/go.png";
	String matchThisText = "resources/danceGame/matchThis.png";
	String doneText = "resources/danceGame/done.png";
	static String emptyMove = "resources/danceGame/emptyMove.png";
	static String rewardText = "resources/danceGame/reward.png";

	// TESTING NEW IMAGES START

	//Region smallRegions = new Region(945,961,68,34);
	Region leftRightRegion = new Region(951,954,60,50);
	Region upDownRegion = new Region(958,945,42,65);
	static String leftArrow = "resources/smallerArrows/left2.png";
	static String rightArrow = "resources/smallerArrows/right2.png";
	static String upArrow = "resources/smallerArrows/up2.png";
	static String downArrow = "resources/smallerArrows/down2.png";
	
	Pattern upArrowPattern = new Pattern(upArrow);
	Pattern downArrowPattern = new Pattern(downArrow);
	Pattern leftArrowPattern = new Pattern(leftArrow);
	Pattern rightArrowPattern = new Pattern(rightArrow);

	//rightArrowPattern.similar((float)(0.75));

	// TESTING NEW IMAGES END

	public void searchTimeoutInit() {
		upDownRegion.setAutoWaitTimeout(0);
		leftRightRegion.setAutoWaitTimeout(0);
	}

	public boolean findUpPattern() throws InterruptedException {
		if(arrows.exists(upArrowPattern) != null) {
			System.out.print("found up\n");
			return true;
		}
		else return false;
	}

	public boolean findDownPattern() throws InterruptedException {
		if(arrows.exists(downArrowPattern) != null) {
			System.out.print("found down\n");
			return true;
		}
		else return false;
	}

	public boolean findLeftPattern() throws InterruptedException {
		if(arrows.exists(leftArrowPattern) != null) {
			System.out.print("found left\n");
			return true;
		}
		else return false;
	}

	public boolean findRightPattern() throws InterruptedException {
		if(arrows.exists(rightArrowPattern) != null) {
			System.out.print("found right\n");
			return true;
		}
		else return false;
	}

	public Match findUp() throws FindFailed {
		System.out.print("trying to find up \n");
		Match foundUp = arrows.exists(upArrow);
		return foundUp;
	}

	public Match findDown() throws FindFailed {
		System.out.print("trying to find down \n");
		Match foundDown = arrows.exists(downArrow);
		return foundDown;
	}

	public Match findLeft() throws FindFailed {
		System.out.print("trying to find left \n");
		Match foundLeft = arrows.exists(leftArrow);
		return foundLeft;
	}

	public Match findRight() throws FindFailed {
		System.out.print("trying to find right \n");
		Match foundRight = arrows.exists(rightArrow);
		return foundRight;
	}

	public Match findGoText() throws FindFailed {
		System.out.print("trying to find go \n");
		Match foundGoText = r.exists(goText);
		return foundGoText;
	}

	public Match findMatchThisText() throws FindFailed {
		System.out.print("trying to find match this text \n");
		Match foundMatchThisText = r.find(matchThisText);
		return foundMatchThisText;
	}

	public Match findDoneText() throws FindFailed {
		System.out.print("trying to find done text \n");
		Match foundDoneText = r.find(doneText);
		return foundDoneText;
	}

	public Match findRewardText() throws FindFailed {
		System.out.print("trying to find reward text \n");
		Match foundRewardText = r.find(rewardText);
		return foundRewardText;
	}

	public static void typeCharacter(Robot robot, String letter) throws AWTException
	{
		Robot robots = new Robot();
		for(int i=0;i<letter.length();i++){
			try
			{
				boolean upperCase = Character.isUpperCase( letter.charAt(i) );
				String KeyVal=Character.toString(letter.charAt(i));
				String variableName = "VK_" + KeyVal.toUpperCase();
				Class clazz = KeyEvent.class;
				Field field = clazz.getField( variableName );
				int keyCode = field.getInt(null);

				robot.delay(50);

				if (upperCase) robot.keyPress( KeyEvent.VK_SHIFT );

				robot.keyPress( keyCode );
				robot.keyRelease( keyCode );

				if (upperCase) robot.keyRelease( KeyEvent.VK_SHIFT );
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}