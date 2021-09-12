import java.util.Scanner;

public class project2 {
    public static void myMethod(int minutes){
        int hours = minutes/60;
        int day = hours/24;
        int no_of_days = day % 365;
        int years = day/365;
        System.out.println(minutes + " minutes is approximately "+ years +" years and "+ no_of_days +" days");
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number.");
        int minutes = sc.nextInt();
        myMethod(minutes);

    }
}
