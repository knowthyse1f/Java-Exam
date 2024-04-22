import java.util.Scanner;

public class Loopstatement {
    public static void main (String args[]){

        //for loop 
        for (int i=0;i<5;i++){
            System.out.println("for loop : "+i);
        }
        //while loop
        int n=6;
        while(n>0){
            System.out.println("while loop : "+n);
            n--;
        }
        //do loop 
        int i=0;
        do{
            ++i;
            System.out.println("do while loop : "+i);
        }
        while(i<6);

        String[] cars={"Volvo", "BMW" ,"Ford" , "Mazda"};
        for(String j: cars){
            System.out.println("string array : "+j);
        }
    }
}
