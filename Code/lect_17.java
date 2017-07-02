public class lect_17 {
   public static void main(String[] args) {
      // lecture 17

   }

   public boolean findSong(Song s) {
      for (int i = 0; i < anthology.length; i++) {
         for (int j = 0; i < anthology[i].length; i++) {
            if ( s.equals(anthology[i][j]) ) {
               return true;
            } // end if
         } // end for
      } // end for
   }
}
