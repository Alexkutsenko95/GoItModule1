package Anagramm;

public class Anagramm {

	private String inputString;

	public Anagramm(String inputString) {
		this.inputString = inputString;
	}

	public String getInputString() {
		return inputString;
	}

	public void showString() {
		System.out.println("InputString: " + getInputString());

	}

	public void showAnagramm() {
		System.out.println("Annagramm: " + getAnagrammString());

	}

	public String getAnagrammString() {
		char[] charArray = inputString.toCharArray();
		StringBuilder result = new StringBuilder();
		String tempWord = "";
		for (int charIndex = 0; charIndex < charArray.length; charIndex++) {
			if (' ' == charArray[charIndex]) {
				String toOut = new StringBuffer(tempWord).reverse().toString();
				tempWord = "";
				result.append(toOut + " ");

			} else {
				tempWord = tempWord + charArray[charIndex];
			}
			if (charIndex + 1 == charArray.length) {
				String toOut = new StringBuffer(tempWord).reverse().toString();
				result.append(toOut);
			}

		}

		return result.toString();

	}

}
