import java.util.*;
public class rec2{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i=2; i*i<=n; i++){
            // boolean isprime = false;
            if(n%i==0){
                System.out.print(n + "no is not prime");
                return;
            }
        }
        System.out.println(n+"no is prme");
    }
}