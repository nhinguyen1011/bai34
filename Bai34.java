import java.util.Scanner;


import java.util.Scanner;
public class Bai42 {
    public static void main(String[] args) {
        float sum = 0, average = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so : ");
        float e = scanner.nextFloat();
        for(int i = 1; i <= e; i++){
            sum += i;
            average = (e + 1)/2;
        }
        System.out.println("Tong: " + sum) ;
        System.out.println("Trung binh: " + average) ;
    }
}
