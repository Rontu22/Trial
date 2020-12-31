import java.util.Scanner;

public class atm1
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x = in.nextInt();
        double y = in.nextDouble();
        double rem = 0.0;
        if(x%5 == 0 && x <=(int)(y+0.50))
        {
            rem = y-x-0.5;
        }
        else{
            rem = y;
        }
        if(rem>0)
        {
            System.out.format("%.2f",rem);
        }
        else
        {
            System.out.println(y);
        }
        
        in.close();

    }
}