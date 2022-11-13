import java.util.Scanner;

public class Main {
    //define a method which swap the numbers
    static void swap(int x, int y){
        x = x+y;
        y = x-y;
        x = x-y;

        //print the num1 and num2 after swapping
        System.out.println("Now the Num1 is : "+x);
        System.out.println("Now the Num2 is : "+y);
    }
    public static void main(String[] args) {

        //declare two variables to store the numbers
        int num1, num2;

        //parsing
        Scanner sc = new Scanner(System.in);

        //take the number 1 from user
        System.out.print("Please enter the num1 : ");
        num1 = sc.nextInt();

        //take the number 2 from user
        System.out.print("Please enter the num2 : ");
        num2 = sc.nextInt();

        //print the number 1 and number 2
        System.out.println("Num1 is : "+num1);
        System.out.println("Num2 is : "+num2);

        //calling the method
        swap(num1, num2);
    }
}