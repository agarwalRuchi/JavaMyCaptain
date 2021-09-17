import java.util.Scanner;

public class Switchprogram {
    public static void main(String[] args){
        int choice;
        System.out.println("Pick one: \n1) Hey\n2) Hiii \n3) Hello");
        Scanner input = new Scanner(System.in);
        choice = input.nextInt();
        switch(choice){
            case 1:
                System.out.println("You said Hey");
                break;

            case 2:
                System.out.println("You said Hiii");
                break;
            case 3:
                System.out.println("You said Hello");
                break;
            default:
                System.out.println("Invalid choice.");
        }

    }

}
