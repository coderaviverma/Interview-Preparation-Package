package testclass.gs;

public class H25DistBetweenTwoWords {

	// Input two words returns the shortest distance between their two midpoints in
	// number of characters
	// Words can appear multiple times in any order and should be case insensitive.

	// E.g. for the document="Example we just made up"
	// shortestDistance( document, "we", "just" ) == 4

	public static double shortestDistance(String document, String word1, String word2) {
		document = document.toLowerCase();
		word1 = word1.toLowerCase();
		word2 = word2.toLowerCase();

		int sDist = Integer.MAX_VALUE;
//		String words[] = document.split("\\s+");
		String words[] = document.split("[[ ]*|[,]*|[\\.]*]");

		for (int i = 0; i < words.length; i++) {
			if (words[i].equals(word1)) {
				System.out.println(words[i]);
				for (int j = 0; j < words.length; j++) {
					if (words[j].equals(word2)) {
						System.out.println(words[j]);

						int start = Math.min(i, j);
						int end = Math.max(i, j);
						int dist = end - start;
						dist += (word1.length() + word2.length()) / 2;
						for (int k = start + 1; k < end; k++) {
							dist += words[k].length();
						}
						sDist = Math.min(sDist, dist);
					}
				}
			}
		}
		System.out.println(sDist);

		return sDist;
	}

	public static boolean pass() {
		return shortestDistance(document, "and", "graphic") == 6d && shortestDistance(document, "transfer", "it") == 14d
				&& shortestDistance(document, "Design", "filler") == 25d;
	}

	public static void main(String[] args) {
		if (pass()) {
			System.out.println("Pass");
		} else {
			System.out.println("Some Fail");
		}
	}

	private static final String document;
	static {
		StringBuffer sb = new StringBuffer();
		sb.append(
				"In publishing and graphic design, lorem ipsum is a filler text commonly used to demonstrate the graphic elements");
		sb.append(
				" lorem ipsum text has been used in typesetting since the 1960s or earlier, when it was popularized by advertisements");
		sb.append(
				" for Letraset transfer sheets. It was introduced to the Information Age in the mid-1980s by Aldus Corporation, which");

		document = sb.toString();
	}
}
