import java.util.Scanner;

public class Conditionlearn {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int time;
        time=sc.nextInt();
        if(time<10){
            System.out.println("Good Morning");
        }
        else if(time<18){
            System.out.println("Good Day");
        }
        else{
            System.out.println("Good evening");
        }
    }
}
