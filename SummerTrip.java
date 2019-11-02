import java.util.Scanner;

public class SummerTrip {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String str = sc.nextLine();
		String itName = null;
		char firstChar;
		char lastChar;
		String subIt = null;
		int goodItCount = 0;
		//boolean goodIt = true;
		for (int i = 0; i < str.length(); i++) {
			for (int j = i+2; j <= str.length(); j++) {
				itName = str.substring(i, j);
				firstChar = itName.charAt(0);
				lastChar = itName.charAt(itName.length()-1);
				if (firstChar != lastChar) {
					if (itName.length() > 2) {
						subIt = itName.substring(1, itName.length()-1);
						if (subIt.indexOf(firstChar) <0 && subIt.indexOf(lastChar) <0) {
							goodItCount++;
							//System.out.println(itName);
						}
					} else {
						goodItCount++;
						//System.out.println(itName);
					}
				}
			}
		}
		System.out.println(goodItCount);
	}
}
