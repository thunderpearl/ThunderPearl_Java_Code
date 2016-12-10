package JavaPractice;
/**
* The class AlphabetFreq inputs a string and counts the frequency of each alphabet present in it
* @author : www.javaforschool.com
* @Program Type : BlueJ Program - Java
*/
import java.io.*;
class String_frequency_tom1
{
    public static void main(String args[])throws IOException
    {
    	// InputStreamReader reads byte streams and decode those into character streams.
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter any string: ");
        String s = br.readLine(); // read the line till the end of line.
  
        s=s.toLowerCase(); //converting the string into lowercase
        int l=s.length(); //finding the length of the string
  
        char ch;
        System.out.println("Output:");
        System.out.println("=========================="); //this is just for styling the look of the output
        System.out.println("Alphabet\tFrequency");
        System.out.println("==========================");
  
        /* Counting frequency of alphabets begins below */
        int count=0;
        for(char i='a'; i<='z'; i++)
            {
                count = 0;
                for(int j=0; j<l; j++)
                {
                	// charAt(j) returns the character specified at the given place.
                    ch=s.charAt(j); //extracting characters of the string one by one
                    if(ch==i) //first checking the whole string for 'a', then 'b' and so on
                        count++; //increasing count of those aplhabets which are present in the string
                }
                if(count!=0)//printing only those alphabets whose count is not '0'
                {
                    System.out.println(i+"\t\t"+count);
                }
            }
    }
}
