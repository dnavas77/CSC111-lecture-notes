class rec_11 {

	public static void main (String[] args) {
		// Recitation 11
		System.out.println( reverse("hello world") );
	}
	// reverse string recursively
	private static String reverse(String str) {
		String reverse = "";
		if(str.length() == 1){
			return str;
		} else {
			reverse += str.charAt(str.length()-1)
					+reverse(str.substring(0,str.length()-1));
			return reverse;
		}
	} // end reverseString
}
