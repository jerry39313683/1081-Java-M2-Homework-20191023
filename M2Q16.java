import java.util.Scanner;
public class M2Q16{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();
    double sum=0;
    for(int i =1; i<=n ; i++){
        sum=sum+Math.pow(2,i);
    }
    System.out.println(Math.round(sum));
    }
}
