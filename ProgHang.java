package main;
import java.util.*;
public class ProgHang {
	private static final String[] Ord = { "samsung", "huawei", "iphone", "xiaomi", "oppo", "vivo", "motorola", "lenovo", "lg", "nokia" };
	private static final Random Q = new Random();
	private static String Phone() {
		return Ord[Q.nextInt(Ord.length)];
	}	
	public static final Integer MAXTries = 10;	
	public static final String ValOrd = Phone();
	public static char[] W;
	public static ArrayList<String> WX = new ArrayList<>();
	public void Draw()
	{
		WX.add("");
		WX.add(" |\n/|\\");
		WX.add(" |\n |\n/|\\ ");
		WX.add(" |\n |\n |\n/|\\ ");
		WX.add(" |\n |\n |\n |\n/|\\");
		WX.add(" |\n |\n |\n |\n |\n/|\\");
		WX.add("  ______\n |\n |\n |\n |\n |\n/|\\");
		WX.add("  ______\n |      |\n |      O\n |\n |\n |\n/|\\");
		WX.add("  ______\n |      |\n |      O\n |     /|\\\n | \n/|\\");
		WX.add("  ______\n |      |\n |      O\n |     /|\\\n |       \\\n |\n/|\\");
		WX.add("  ______\n |      |\n |      O\n |     /|\\\n |     / \\\n |\n/|\\");
	}
	public static final Object hanger() {
		String XQ = "  " + "" + "\n |      " + "|" + "\n |      " + "O" + "\n |" + "     /|\\" + "\n |    " + " / \\" + "\n |" + "\n/|\\";
		return XQ;
	}	
}