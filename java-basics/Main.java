import jdk.dynalink.StandardNamespace;
import java.util.Arrays;
import java.util.Scanner;

public  class Main {
    public static <ff> void main(String[] args) {
//        casting
//        implicit casting this casting is done implicitly which is  assigning larger values to smaller data type
//
//        int a = 10;
//        double b = 15.5;
//        double fvar = a + b;
//        System.out.println(fvar);
//
//        explicit casting- this is done implicitly by a programmer who doesnot care if he loses some data
//         and he wants to asign the value from higher to lower data type
//
//        int a = 10;
//        double b = 15.5;
//
//        int fvar = a + (int)b;
//        System.out.println(fvar);

        //taking input from the user

//        Scanner sc = new Scanner(System.in);
//        System.out.println("please enter a value to variable a");
//        int a = sc.nextInt();
//
//
//        System.out.println("this is value to variable a");
//        System.out.println(a);

        //mini project
        double range =100;
        int random = (int)(Math.random()*range);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number please");
        int guess = sc.nextInt();

        if(guess > random){
            System.out.println("The number is too large");
            System.out.println("the random number was "+ random);
            System.out.println("your number is"+ guess);
        } else if (guess < random) {
            System.out.println("The number is too small");
            System.out.println("the random number was "+ random);
            System.out.println("your number is "+ guess);
        }else{
            System.out.println("Correct");
            System.out.println("the random number was"+ random);
            System.out.println("your number is "+ guess);
        }


    }
}
