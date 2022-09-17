import java.util.*;
import java.io.*;


public class Reverse {
    
public static void main(String[]args){



String str="hello" ,nstr=" ";
char ch;

System.out.println("original word: ");
System.out.println("hello");

for(int i=0;i<str.length();i++)
{

ch=str.charAt(i);
nstr=ch+nstr;


}
System.out.println("reversed word :"+nstr);

}

}
