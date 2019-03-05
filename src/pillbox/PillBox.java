/*
 * Ramya Krishna Gajula
 * Student ID: 99
 * Syst 
 */
package pillbox;

/**
 *
 * @author User
 */
public class PillBox {

    /**To populate the array with a word and print something on console
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char[] PillBox = new char[7];
        PillBox[0] = 's';
        PillBox[1] = 't';
        PillBox[2] = 'u';
        PillBox[3] = 'd';
        PillBox[4] = 'e';
        PillBox[5] = 'n';
        PillBox[6] = 't';
        
       // PillBox c = new PillBox();
        
        
   for (int i=0;i<PillBox.length;i++){ 
           System.out.println(PillBox[i]);
   }
   for(int i=0;i<PillBox.length-1;i--)
   {
       System.out.println(PillBox[i]);
   }
        
    }
    
}
