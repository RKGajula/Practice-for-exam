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
     * I changed the code for testing the push 
     * Changed again 
     * 
     */
    public static void main(String[] args) {
        String[] PillBox = new String[6];
        PillBox[0] = "R";
        PillBox[1] = "A";
        PillBox[2] = "M";
        PillBox[3] = "Y";
        PillBox[4] = "A";
        PillBox[5]="G";
        
        
       // PillBox c = new PillBox();
        
        
   for (int i=0;i<PillBox.length;i++){ 
           System.out.println(PillBox[i]);
   }
   for(int i=PillBox.length-1;i>=0;i--)
   {
       System.out.println(PillBox[i]);
   }
        
    }
    
}
