import java.util.*;

public class Sum {
    public static void main(String[]args){
int sum=0;
Scanner sc= new Scanner(System.in);
System.out.println("Enter any no.  for sum of first natural nos: ");
int a=sc.nextInt();
for(int i=1;i<=a;i++)
{
sum=sum+i;



}
System.out.print("sum of first natural no.s =" +sum);





    }
}
