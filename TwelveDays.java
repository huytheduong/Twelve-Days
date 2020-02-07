import java.util.Scanner;

public class TwelveDays {
   public static void main(String[] args) {
       
       final int MAX = 12;
       int lastDay = 0; 
      
       // inputs entered by the user
       Scanner scan = new Scanner(System.in);
      
      do {
           //Getting the days entered by the user
           System.out.print("How many days (1 to 12)? ");
           lastDay = scan.nextInt();
       } while (lastDay < 1 || lastDay > 12);//Checking whether the entered days values is with in range or not

       int day = 1; // loop control variable for song verses

       //This loop will executes based on number of days value.
       while (day <= lastDay) {
           String str1="On the ";
           String str2=" day of Christmas my true love gave to me";
           String one="st";
           String second="nd";
           String third="rd";
           String rem="th";
          
           switch (day) {
           case 1: {
               System.out.println(str1+day+one+str2);
               break;
           }
           case 2: {
               System.out.println(str1+day+second+str2);
               break;
           }
           case 3: {
               System.out.println(str1+day+third+str2);
               break;
           }
  
           case 4: {
               System.out.println(str1+day+rem+str2);
               break;
           }   case 5: {
               System.out.println(str1+day+rem+str2);
               break;
           }   case 6: {
               System.out.println(str1+day+rem+str2);
               break;
           }   case 7: {
               System.out.println(str1+day+rem+str2);
               break;
           }   case 8: {
               System.out.println(str1+day+rem+str2);
               break;
           }   case 9: {
               System.out.println(str1+day+rem+str2);
               break;
           }   case 10: {
               System.out.println(str1+day+rem+str2);
               break;
           }   case 11: {
               System.out.println(str1+day+rem+str2);
               break;
           }   case 12: {
               System.out.println(str1+day+rem+str2);
               break;
           }  
          
      

           }

           //This switch case displays the gift for the particular day
           switch (day)

           {

           case 12: {
               System.out.println("Twelve drummers drumming,");
           }
           case 11: {
               System.out.println("Eleven pipers piping,");
           }
           case 10: {
               System.out.println("Ten lords a-leaping,");
           }
           case 9: {
               System.out.println("Nine ladies dancing,");
           }
           case 8: {
               System.out.println("Eight maids a-milking,");
           }
           case 7: {
               System.out.println("Seven swans a-swimming,");
           }

           case 6: {
               System.out.println("Six geese a-laying,");
           }
           case 5: {
               System.out.println("Five golden rings,");
           }
           case 4: {
               System.out.println("Four calling birds,");
           }

           case 3: {
               System.out.println("Three French hens,");
           }
           case 2: {
               System.out.println("Two turtle doves, and");
           }
           case 1: {
               System.out.println("A partridge in a pear tree.\n\n");
               break;
           }
           }
         
           day++;
           
           
            /*“I pledge my Honor that I have not cheated, and will not cheat, on this assignment”

      Huy Duong, U65372481. */

       }
   }
}