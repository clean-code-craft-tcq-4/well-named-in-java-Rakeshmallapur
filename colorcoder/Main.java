package colorcoder;

public class Main {
	
	protected static final String[] MajorColorNames = { "White", "Red", "Black", "Yellow", "Violet" };
	public static final int NUMBEROFMAJORCOLORS = MajorColorNames.length;
	protected static final String[] MinorColorNames = { "Blue", "Orange", "Green", "Brown", "Slate" };
	public static final int NUMBEROFMINORCOLORS = MinorColorNames.length;

	public static void main(String[] args) {
		ColorPairTestClass.testNumberToPair(4, MajorColor.WHITE, MinorColor.BROWN);
		ColorPairTestClass.testNumberToPair(5, MajorColor.WHITE, MinorColor.SLATE);

		ColorPairTestClass.testPairToNumber(MajorColor.BLACK, MinorColor.ORANGE, 12);
		ColorPairTestClass.testPairToNumber(MajorColor.VIOLET, MinorColor.SLATE, 25);
		ColorPairImpl.printManual();
	}
}
