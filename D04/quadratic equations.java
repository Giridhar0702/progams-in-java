import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a=in.nextDouble();
        double b=in.nextDouble();
        double c=in.nextDouble();
        double sum=b*b-4.0*a*c;
        if(sum>0.0)
        {
            double r1=(-b+Math.pow(sum,0.5))/(2.0*a);
            double r2=(-b-Math.pow(sum,0.5))/(2.0*a);
            System.out.printf("%f and %f",r1,r2);
        }
        }
        
    }

