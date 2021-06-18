/**This program reads a number between 1,000 and 999,999 from the user, where the user enters a comma in the input. Then the program prints the number without a comma. 
 * @author (Fikri Şan Köktaş)
 * @version (19 October 2020)*/
 
import java.awt.Rectangle;
import java.util.Scanner; //I import in any case
public class KFS_ReadWithCommas_Main
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 1,000 and 999,999 by using a comma: ");
        String num = input.next();
        
        int character_number = num.length(); // gets the number of digits
       
        int comma_place = character_number - 4;
      
        String first_characters = num.substring(0,comma_place);
        String last_characters = num.substring(comma_place+1, character_number);
        
        System.out.println(first_characters + last_characters);
        
    }
}


