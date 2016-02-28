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
		for (int charIndex = 0; charIndex < charArray.length; charIndex++) {
			result.append(charArray[charIndex]);

		}
		result.reverse();

		return result.toString();

	}

	

}
