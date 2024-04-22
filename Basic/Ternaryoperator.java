import java.util.Scanner;
public class Ternaryoperator {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int time;
        time=sc.nextInt();
        String result= (time<18)? "Good Day" : "Good Evening";
        System.out.println(result);
    }
}
