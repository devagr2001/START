import java.io.*;
public class Pallindrome {
    public static boolean ispalindrome(String str){

 String rev=" ";
 char ch;

boolean ans= false ;
for(int i=0;i<str.length();i++)

  {  ch=str.charAt(i);
    rev= ch+rev;



    }
    System.out.println(rev);

    if(str.equals(rev))
    {

        ans=true;
    }
    return ans;
}

public static void main(String[] args) {
     String str="abba";
     str=str.toLowerCase();
     boolean A=ispalindrome(str);
     System.out.println(A);
   
}
}