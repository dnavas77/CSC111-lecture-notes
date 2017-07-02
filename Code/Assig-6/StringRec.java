public class StringRec
{
	/***
	 * Rutgers University - New Brunswick. Spring 2015.
	 *
	 * Assignment 6 for CSC-111
	 * Student: Danilo Navas
	 * Professor: Andrew Tjang
	 --------------------------------*/

	public static String decompress(String compressedText)
	{
		// Helper variables.
	    char x = ' ';
	    String helperStr;
		// if string length is greater than 1, assign first x to second character.
	    if (compressedText.length() != 1) x = compressedText.charAt(1);
		// if string length is 1, return that one character.
		if (compressedText.length() == 1) return compressedText;
		// if char at 0 index is 0 and length is greater than 2, call decompress.
		if (compressedText.charAt(0) == '0' && compressedText.length() != 2)
			return decompress(compressedText.substring(2));
		// if char at 0 index is 0 and length is 2, return nothing.
	    if (compressedText.charAt(0) == '0' && compressedText.length() == 2) {
	        compressedText = "\0";
	        return compressedText;
	    }
		// if fisrt character is digit greater than zero, parse digit and call
		// decompress with 1 less than the number parsed.
		if (Character.isDigit(compressedText.charAt(0)) == true) {
	        int j = Integer.parseInt(compressedText.substring(0,1));
	        j = j-1;
	        helperStr = Integer.toString(j);
	        return x + decompress(helperStr.concat(compressedText.substring(1)));
	    }
	    return compressedText.charAt(0)+decompress(compressedText.substring(1));
	} // end decompress()
}
