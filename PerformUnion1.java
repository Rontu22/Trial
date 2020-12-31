import java.util.*;
public class PerformUnion1 {
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

            Set<Integer> s = new HashSet<>();
            for(int i=0;i<N;i++)
            {
                s.add(A[i]);
            }
            for(int i=0;i<M;i++)
            {
                s.add(B[i]);
            }
            //System.out.println(s);
            System.out.println(s.size());



        }
    }
}
