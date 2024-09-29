import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int c=0;
    
        for(int i=0;i<=n;i++)
        {
            for(int k=1;k<=n-i;k++)
            {
                System.out.printf(" ");
            }
            for(int j=0;j<i;j++)
            {
                if(i==0||j==0)
                {
                    c=1;
                }
                else{
                    c=(c*(i-j))/j;
                    
                }
                System.out.printf("%d ",c);
            }
            System.out.printf("%n");
        }
    }
}
