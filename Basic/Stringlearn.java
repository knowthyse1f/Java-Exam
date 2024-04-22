public class Stringlearn {
    public static void main(String args[]){
        String greeting="Hello";
        System.out.println(greeting);
        //string size
        System.out.println("The length of String "+greeting.length());

        //convert to uppercase
        System.out.println("Convert the text uppercase: "+greeting.toUpperCase());

        //convert to lowercase
        System.out.println("Convert the text lowercase: "+greeting.toLowerCase());

        //search the location of any text

        System.out.println(greeting.indexOf("ll"));

        String firstName="Md. Yak ";
        String secondName="Safu";
        System.out.println(firstName.concat(secondName));
    }
}
