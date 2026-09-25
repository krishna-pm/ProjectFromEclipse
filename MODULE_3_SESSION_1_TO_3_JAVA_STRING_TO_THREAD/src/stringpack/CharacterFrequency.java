package stringpack;

public class CharacterFrequency {

	public static void main(String[] args) {

		String str = "Luminar Technolab";
		char[] ch = str.toCharArray();

		for (int i = 0; i < ch.length; i++) {

			if (ch[i] == ' ') {
				continue;
			}

			if (str.indexOf(ch[i]) != i) {
				continue;
			}

			int freq = 0;

			for (int j = 0; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					freq++;
				}
			}

			System.out.println(ch[i] + " = " + freq);
		}
	}
}