public class Main{
    public static void main(String args[]){
        System.out.println("Hello World");
        //This is a single line comment
        /*
         * This is a multiple line comment 
         */
        String name="Safu";
        System.out.println(name);
        int myNum=15;
        System.out.println("Normal Integer: " +myNum);
        final int myNumber=20;
        //if i use  final int that means  i can't change it
        System.out.println("Final integer: "+myNumber);

        float myFloatNum=5.99f;
        char myLetter='D';
        boolean myBool= true; 

        //type casting
        int typecasting=(int)myFloatNum;
        System.out.println("Float Number: " +myFloatNum);
        System.out.println("Charecter Letter: " +myLetter);
        System.out.println("Boolean: " +myBool);
        System.out.println("Typecasting : " +typecasting);

    }
}