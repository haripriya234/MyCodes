import java.util.*;
public class PallindromeCheck
{
	public static void main(String[] args) {
	    Scanner input=new Scanner(System.in);
      System.out.println("Enter input");
	    String str1=input.nextLine();
	    String str2="";
	    for (int i=0;i<str1.length() ;i++ ){
	        str2=str1.charAt(i)+str2;
	    } 
	    if (str1.equals(str2)){
	        System.out.println("Pallindrome");
	    } 
      else{
        System.out.println("Not Pallindome");
	}
}
