import java.util.ArrayList;
import java.util.Scanner;

public class AnotherArrUnion1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();

        while(T-- >0)
        {
            int N = in.nextInt();
            int M = in.nextInt();

            int[] A = new int[N];
            int[] B = new int[M];

            for(int i=0;i<N;i++)
            {
                A[i] = in.nextInt();
            }
            for(int i=0;i<M;i++)
            {
                B[i] = in.nextInt();
            }
            
            ArrayList<Integer> al = new ArrayList<>();

            for(int i=0;i<N;i++)
            {
                al.add(A[i]);
            }
            for(int i=0;i<M;i++)
            {
                if(!al.contains(B[i]))
                {
                    al.add(B[i]);
                }
            }
            System.out.println(al.size());
            //System.out.println(al);
            
        }

    }
}
