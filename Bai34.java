import java.util.Scanner;
public class Bai34 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println(" enter N : ");
        int n= scan.nextInt();
        int sum1=0,sum2=0,sum3=0;
        int a,b,i;
        for (i;i<=n;i++){
            sum1+=i;
        }
        while (a<=n){
             sum2+=a;
        }
        do {
            sum3+=b;
        }while(b<n);
    }
}