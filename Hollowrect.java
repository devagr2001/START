import java.net.SocketTimeoutException;

import javax.naming.ldap.SortResponseControl;

public class Hollowrect {
    public static void main(String[] args) {
        int i,j;
        for(i=1;i<=4;i++)
        {
            if(i!=2&&i!=3){
            for (j=1;j<=5;j++){

             
            System.out.print("*");
            }
        }
          else {
                   for (j=1;j<=5;j++)
                   {
                    if (j!=1&&j!=5){

                        System.out.print(" ");
                    }

                    else {
                        System.out.print("*");
                    }
                   }

          }
          System.out.print("\n");
        }
    }
}
