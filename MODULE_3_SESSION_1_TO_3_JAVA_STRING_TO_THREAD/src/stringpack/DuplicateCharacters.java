package stringpack;

public class DuplicateCharacters {

	public static void main(String[] args) {

		String str = "Java full stack course";
		char[] ch = str.toCharArray();

		System.out.print("Duplicate Characters: ");

		for (int i = 0; i < ch.length; i++) {

			if (ch[i] == ' ') {
				continue;
			}

			
			boolean alreadyProcessed = false;
			for (int k = 0; k < i; k++) {
				if (ch[i] == ch[k]) {
					alreadyProcessed = true;
					break;
				}
			}

			if (alreadyProcessed) {
				continue;
			}

			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					System.out.print(ch[i] + " ");
					break;
				}
			}
		}
	}
}