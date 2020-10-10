import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        int K = scan.nextInt();
        if((K == 0) || (K<N) || (K<M) || (K>N*M)){
            System.out.println("NO");
        }
        else if ((K % M ==0) || (K % N == 0)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}