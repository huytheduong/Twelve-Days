import javax.swing.JOptionPane;

public class VowelCount {
public static void main(String[] args) {
/*
* declare variables to store the number of each type of vowel
*/

while(true)
{

int countA = 0, countE = 0, countI = 0, countO = 0, countU = 0;
// Get the string from the user (prompt and input)

String str = JOptionPane.showInputDialog("Enter a string of characters: ");





for (int i = 0; i < str.length(); i++) {
switch (str.charAt(i)) {
case 'a':
case 'A':
countA++;
break;
case 'e':
case 'E':
countE++;
break;
case 'i':
case 'I':
countI++;
break;
case 'o':
case 'O':
countO++;
break;
case 'u':
case 'U':
countU++;
break;
default:
break;

}

}

JOptionPane.showMessageDialog(null, "Number of each vowel in the string:\na: " + countA
+ "\ne: " + countE + "\ni: " + countI + "\no: " + countO
+ "\nu: " + countU + "\nNumber of non-vowel characters : " + (str.length()-(countA+countE+countI+countO+countU)));


String again = JOptionPane.showInputDialog("Would you like to enter another string?\nEnter yes or no: ");
if(again.equals("yes"))
continue;
else if(again.equals("no"))
break;


 /*“I pledge my Honor that I have not cheated, and will not cheat, on this assignment”

      Huy Duong, U65372481. */

}

}
}