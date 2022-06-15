package colorcoder;

public class Main {
	
	protected static final String[] MajorColorNames = { "White", "Red", "Black", "Yellow", "Violet" };
	public static final int NUMBEROFMAJORCOLORS = MajorColorNames.length;
	protected static final String[] MinorColorNames = { "Blue", "Orange", "Green", "Brown", "Slate" };
	public static final int NUMBEROFMINORCOLORS = MinorColorNames.length;

	public static ColorPair getColorFromPairNumber(int pairNumber) {
		int zeroBasedPairNumber = pairNumber - 1;
		MajorColor majorColor = MajorColor.fromIndex(zeroBasedPairNumber / NUMBEROFMINORCOLORS);
		MinorColor minorColor = MinorColor.fromIndex(zeroBasedPairNumber % NUMBEROFMINORCOLORS);
		return new ColorPair(majorColor, minorColor);
	}

	public static int getPairNumberFromColor(MajorColor major, MinorColor minor) {
		return major.getIndex() * NUMBEROFMINORCOLORS + minor.getIndex() + 1;
	}
	
	static void printManual() {
        int count = 1;
        for(int i = 0 ; i< NUMBEROFMAJORCOLORS ; i++) {
            for(int j = 0; j< NUMBEROFMINORCOLORS ; j++) {
                 System.out.println(count + " | " + MajorColorNames[i] + " | " + MinorColorNames[j]);
                 count++;
            }
        }
   } 
	
	
	public static void main(String[] args) {
		printManual();
	}
}
