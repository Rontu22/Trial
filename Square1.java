import java.util.Scanner;

public class Square1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int a = in.nextInt();
        
        if(n%a==0 && m%a==0)
        {
            calAreaDiv(n, m, a);
        }
        else if(n%a == 0 && m%a !=0)
        {
            calAreaNotDiv_m(n, m, a);
        }
        else if(n%a !=0 && m%a == 0)
        {
            calAreaNotDiv_n(n, m, a);
        }
        else if(n%a !=0 && m%a != 0)
        {
            calAreaNotDivBoth(n, m, a);
        }



    }
    public static void calAreaDiv(int n,int m,int a)
    {
        int side_n = (n-(n%a))/a;
        int side_m = (m-(m%a))/a;

        int noOfSquare = (side_n)*(side_m);
        System.out.println(noOfSquare);

        // System.out.println("nside = "+side_n);
        // System.out.println("side m= "+side_m);
    }
    public static void calAreaNotDivBoth(int n,int m,int a)
    {
        int side_n = (n-(n%a))/a;
        int side_m = (m-(m%a))/a;

        int noOfSquare = (side_n + 1)*(side_m + 1);
        System.out.println(noOfSquare);

        // System.out.println("nside = "+side_n);
        // System.out.println("side m= "+side_m);
    }
    public static void calAreaNotDiv_m(int n,int m,int a)
    {
        int side_n = (n-(n%a))/a;
        int side_m = (m-(m%a))/a;

        int noOfSquare = (side_n)*(side_m + 1);
        System.out.println(noOfSquare);

        // System.out.println("nside = "+side_n);
        // System.out.println("side m= "+side_m);
    }
    public static void calAreaNotDiv_n(int n,int m,int a)
    {
        int side_n = (n-(n%a))/a;
        int side_m = (m-(m%a))/a;

        int noOfSquare = (side_n + 1)*(side_m);
        System.out.println(noOfSquare);

        // System.out.println("nside = "+side_n);
        // System.out.println("side m= "+side_m);
    }
}
