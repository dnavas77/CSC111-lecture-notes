class lect_22 {
	public static void main(String[] args) {
		// lecture 22: RECURSION
		System.out.println(isPalindrome("tacocat"));

	}

	private static boolean isPalindrome (String s) {

		if ( s.length() == 1 || s.length() == 0 )
			return true;

		if ( s.charAt(0) != s.charAt(s.length()-1) )
			return false;
		else {
			return isPalindrome (s.substring(1,s.length()-1));
		}
	} // isPalindrome()
	
} //end class
